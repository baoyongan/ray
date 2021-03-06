package com.arc.wechat.controller.web;

import com.arc.wechat.service.WeChatScanQRCodeRecordService;
import com.arc.wechat.wechat.WeChatDTO;
import com.arc.wechat.wechat.WeChatScanQRCodeRecord;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * web包中放的是跳转页面的controller
 *
 * @author yechao
 * @date 20180706
 */
@Controller
@RequestMapping("/ds")
public class Index {


    private static final Logger log = LoggerFactory.getLogger(Index.class);

    @Autowired
    private WeChatScanQRCodeRecordService weChatScanQRCodeRecordService;


    @RequestMapping("/ex")
    @ResponseBody
    public void excel(HttpServletRequest request, HttpServletResponse response) throws Exception {
        long startTime = System.currentTimeMillis();    //开始时间
        log.info("导出excel开始::::::::::");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        int sheets = 0;//sheets 数目
        int pageSize = 50000;
        int sheetNumber = 1;
        Integer activityId = 66;
//        String path = "G:/test.xlsx";
        SXSSFWorkbook workbook = null;
        SXSSFSheet sheet = null;

        WeChatDTO dto = new WeChatDTO(activityId, 1, pageSize);
        //1、获取将要到处数据的数据量
        //2、判断集合sheet可以装下
        int count = weChatScanQRCodeRecordService.listPageCount(dto);

        workbook = new SXSSFWorkbook(100);
        workbook.setCompressTempFiles(true);

        //创建sheet
//        for (sheetNumber = 1; sheetNumber <= sheets; sheetNumber++) {
//            sheet = workbook.createSheet("sheet标题名" + sheetNumber);
//            createTitle(workbook, sheet);
//
//            //创建sheet内的多行数据
//            int rowNumber = 1;
//            for (int data = 1; data < 4; data++) {
//                Row row = sheet.createRow(rowNumber);
//                row.createCell(0).setCellValue("XXXXXXXXXXXXX");
//                rowNumber++;
//            }
//        }

/////////////////////////////////////////////////

        if (count >= 0) {
            sheets = count / pageSize;//总页数
            if (sheets <= 0 || (count % pageSize) > 0) {//数据量不足一个sheet的 或者有余数的
                sheets = sheets + 1;
            }


            List<WeChatScanQRCodeRecord> records = new ArrayList<>(pageSize);
            records = weChatScanQRCodeRecordService.listPage(dto);
            log.debug("##################################总数据量count{}--sheets数目{}", count, sheets);

            //两个思路去处理
            //一、分页查询MySQL获取数据 得到所有结果 然后一次处理  ---HashMap<String, List<WeChatScanQRCodeRecord>> map = new HashMap<>();
            //二、分页查询MySQL获取数据 然后分批处理 ---用这个 避免程序消耗过多内存 -->按次数将数据写入文件

            // 一次for 获取一页 处理这一页


            for (sheetNumber = 1; sheetNumber <= sheets; sheetNumber++) {

                // 数据库中存储的数据行---即单词分页大小，即pageSize
                // 求数据库中待导出数据的行数-----总数据量，既count
                // 根据行数求数据提取次数---分多少次操作完成，即sheets//            int export_times = list_count % page_size > 0 ? list_count / page_size + 1 : list_count / page_size;
                // 按次数将数据写入文件

                // 最重要的就是使用SXSSFWorkbook，表示流的方式进行操作
                // 在内存中保持1000行，超过1000行将被刷新到磁盘
                sheet = workbook.createSheet("sheet标题名" + sheetNumber);
                createTitle(workbook, sheet);
                int rowNumber = 1;            //创建sheet内的多行数据
//                for (WeChatScanQRCodeRecord qrCodeRecord : records) {
//                    Row row = sheet.createRow(rowNumber);
//                    row.createCell(0).setCellValue(qrCodeRecord.getCodeNickName() == null ? "" : qrCodeRecord.getCodeNickName());
//                    row.createCell(1).setCellValue(qrCodeRecord.getOpenId());
//                    row.createCell(2).setCellValue(qrCodeRecord.getCreateTime() == null ? "" : formatter.format(qrCodeRecord.getCreateTime()));
//                    rowNumber++;//新增数据行，并且设置单元格数据
//                }
            }
        }
        log.info("Export excel execute  time: " + (System.currentTimeMillis() - startTime) + "ms");

        //输出文件
        // 如果文件名有中文，必须URL编码      String excelName = URLEncoder.encode("数据导出.xlsx", "UTF-8");
        String excelName = "数据导出.xlsx";
        excelName = excelName.replaceAll("[^\u4e00-\u9fa5a-zA-Z0-9]", "");
        String userAgent = request.getHeader("User-Agent");//user-agent  大小写都可以
        if (userAgent != null && userAgent.toLowerCase().indexOf("firefox") > 0) {
            excelName = new String(excelName.getBytes("UTF-8"), "ISO8859-1");
        } else {
            excelName = java.net.URLEncoder.encode(excelName, "UTF-8");
        }
        long millis = System.currentTimeMillis();
        response.reset();
        response.setContentType(request.getServletContext().getMimeType(excelName));
        response.addHeader("Content-Disposition", "attachment;filename=" + excelName);
//        response.addHeader("Content-Disposition", "attachment;filename=" + getBrowserFileName(request, excelName));
        OutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        response.flushBuffer();
        outputStream.close();
        log.info("Transfer execute  time: " + (System.currentTimeMillis() - millis) + "ms");
    }


// 测试
//    public static void main(String[] args) throws Exception {
//        ForExcel tm = new ForExcel();
//        tm.jdbcex(true);
//    }

   /* public void jdbcex(boolean isClose) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException, InterruptedException {
//        try {
//
//        } catch (Exception e) {
//
//        }finally {
//
//        }
        String xlsFile = "G:/poi.xlsx";        //输出文件
        //内存中只创建100个对象，写临时文件，当超过100条，就将内存中不用的对象释放。
        Workbook wb = new SXSSFWorkbook(1000);            //关键语句
        Sheet sheet = null;//工作表对象
        Row nRow = null;//行对象
        Cell nCell = null;//列对象

        //使用jdbc链接数据库
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8";
        String user = "root";
        String password = "admin";

        //获取数据库连接
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "     SELECT *     FROM scan_qr_code_record    ";   //100万测试数据
        ResultSet rs = stmt.executeQuery(sql);

        ResultSetMetaData rsmd = rs.getMetaData();
        long startTime = System.currentTimeMillis();    //开始时间
        System.out.println("strat execute time: " + startTime);

        int rowNo = 0;        //总行号
        int pageRowNo = 0;    //页行号

        while (rs.next()) {
            //打印300000条后切换到下个工作表，可根据需要自行拓展，2百万，3百万...数据一样操作，只要不超过1048576就可以
            if (rowNo % 300000 == 0) {
                System.out.println("Current Sheet:" + rowNo / 300000);
                sheet = wb.createSheet("我的第" + (rowNo / 300000) + "个工作簿");//建立新的sheet对象
                sheet = wb.getSheetAt(rowNo / 300000);        //动态指定当前的工作表
                pageRowNo = 0;        //每当新建了工作表就将当前工作表的行号重置为0
            }
            rowNo++;
            nRow = sheet.createRow(pageRowNo++);    //新建行对象

            // 打印每行，每行有6列数据   rsmd.getColumnCount()==6 --- 列属性的个数
            for (int j = 0; j < rsmd.getColumnCount(); j++) {
                nCell = nRow.createCell(j);
                nCell.setCellValue(rs.getString(j + 1));
                //                nRow.createCell(j).setCellValue(rs.getString(j + 1));
            }

            if (rowNo % 10000 == 0) {
                System.out.println("row no: " + rowNo);
            }
//		Thread.sleep(1);	//休息一下，防止对CPU占用，其实影响不大
        }

        long finishedTime = System.currentTimeMillis();    //处理完成时间
        System.out.println("finished execute  time: " + (finishedTime - startTime) / 1000 + "m");

        FileOutputStream fOut = new FileOutputStream(xlsFile);
        wb.write(fOut);
        fOut.flush();        //刷新缓冲区
        fOut.close();

        long stopTime = System.currentTimeMillis();        //写文件时间
        System.out.println("write xlsx file time: " + (stopTime - startTime) / 1000 + "m");

        if (isClose) {
//            this.close(rs, stmt, conn);
            rs.close();
            stmt.close();
            conn.close();
        }
    }
*/
    //执行关闭流的操作
//    private void close(ResultSet rs, Statement stmt, Connection conn) throws SQLException {
//        rs.close();
//        stmt.close();
//        conn.close();
//    }

    //    public static void main(String[] args) {
//        //取结果的整数部分
//        System.out.println(5000 / 5000);//1
//        System.out.println(5 / 5000);//0
//        System.out.println(5001 / 5000);//1
//        System.out.println();
//
//        //取到的是余数
//        System.out.println(5000 % 5000);//0
//        System.out.println(5 % 5000);//5
//        System.out.println(50022 % 5000);//22
//    }


    private void createTitle(SXSSFWorkbook workbook, SXSSFSheet sheet) {
        SXSSFRow row = sheet.createRow(0);
        //设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256个字符宽度
        sheet.setColumnWidth(1, 12 * 256);
        sheet.setColumnWidth(3, 17 * 256);
        //设置为居中加粗
//        HSSFCellStyle style = (HSSFCellStyle) workbook.createCellStyle();
//        HSSFFont font = (HSSFFont) workbook.createFont();
//        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
//        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
//        style.setFont(font);

        SXSSFCell cell0 = row.createCell(0);
        cell0.setCellValue("微信昵称");

        SXSSFCell cell1 = row.createCell(1);
        cell1.setCellValue("openId");

        SXSSFCell cell2 = row.createCell(2);
        cell2.setCellValue("参与时间");
    }
    @RequestMapping("")
    @ResponseBody
    public Map<String, Object> index() {
        //日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。
        log.trace("日志输出 trace");
        log.debug("日志输出 debug");
        log.info("日志输出 info");
        log.warn("日志输出 warn");
        log.error("日志输出 error");
        return null;
    }




}
