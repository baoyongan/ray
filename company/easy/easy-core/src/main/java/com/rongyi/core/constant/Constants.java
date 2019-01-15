package com.rongyi.core.constant;

import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.core.framework.spring.context.utils.SpringContextUtil;

public interface Constants {
    String COOKIE_DOMAIN_RONGYI = ".rongyi.com";
    String COOKIE_DOMAIN_RONGYIGUANG = ".rongyiguang.com";

    interface FilterRelation {
        String AND = "AND";
        String OR = "OR";
    }


    interface OrderPaytime {
        Integer PAY_SECOND = 900; //订单支付最大时间（秒数）
    }

    Integer RY_SESSION_TIMEOUT = 60 * 60 * 2;
    Integer BS_SESSION_TIMEOUT = 60 * 60;

    String BS_COOKIE_NAME = "BSST";
    String RY_COOKIE_NAME = "RYST";

    /**
     * 登录用户的session key
     */
    String USER_SESSION_KEY = "user_session_key"; //

    //商家账号初始密码
    String USER_INIT_PWD = "RYxyz123";


    String RESULT_SUCCES = "success"; //成功标志位
    String RESULT_FAIL = "fail"; //失败标志位

    /**
     * 新版
     * 本地路径
     */
    interface UPAIYUN_LOCAL_URL {
        String APP_BUSINESSDISTRICT_DIR = "/businessdistrict/original/"; //app热门商圈
        String APP_CATEGORY_DIR = "/category/original/"; //app分类
        String MALL_ALL_PIC_DIR = "/mall/original/";
        String SHOP_ALL_PIC_DIR = "/shop/original/";
        String FLOOR_ALL_PIC_DIR = "/mall/floor/";
        String BRAND_ALL_PIC_DIR = "/brand/original/";  //品牌图片存放路径
        String SHOPQRCODE_ALL_PIC_DIR = "/shopqrcode/original/";
    }

    /**
     * 新版
     * 上传云路径
     */
    interface UPAIYUN_URL {
        String UPAIYUN_URL = "http://rongyi.b0.upaiyun.com/";  //网址
        String ADVERT_URL = "system/advert/";//内容管理图片路径
        String APP_BUSINESSDISTRICT_UPAIYUN_DIR = "/system/app_businessdistrict/"; //app热门商圈
        String APP_CATEGORY_UPAIYUN_DIR = "/system/app_category/"; //app分类
        String UPAIYUN_URL_MALL_ICON = "/system/mall/icon/";              // 云盘路径-商场icon /mallId/xxx.jpg
        String UPAIYUN_URL_MALL_INTRODUCTION_PIC = "/system/mall/introduction_pic/";  // 云盘路径-商场简介图+ yy/mm/mallId/xxx.png
        String UPAIYUN_URL_MALL_TERMINAL_LOGO = "/system/mall/terminal_logo/";     // 云盘路径-商场 终端机logo+/mallId/xxx.png
        String UPAIYUN_URL_MALL_APPEARANCE_PIC = "/system/mall/appearance_pic/";    // 云盘路径-商场app外景图 +yy/mm/mallId/xxx.png
        String UPAIYUN_URL_MALL_TRAFFIC_PIC = "/system/mall/traffic_pic/";       // 云盘路径-商场交通图 +/yy/mm/mallid/xx.png
        String UPAIYUN_URL_MALL_WEB_APPEARANCE_PIC = "/system/mall/web_appearance_pic/"; // 云盘路径-商场商场web外景图 +/yy/mm/mallId/xx.png
        String UPAIYUN_URL_MALL_WECHAT_PIC = "/system/mall/wechat/"; // 云盘路径-商场微信 /mallId/xxx.jpg
        String UPAIYUN_URL_MALL_MERLOG_PIC = "/system/mall/merlog/";   // 云盘路径-商场存放商家后台Logo  /mallId/xxx.jpg

        String UPAIYUN_URL_BRAND_MERLOG_PIC = "/system/brand/merlog/";  //云盘路径-品牌存放商家后台Logo  /mallId/xxx.jpg
        String UPAIYUN_URL_SHOP_QRCODE_PIC = "/system/shop/qrcode/"; // 云盘路径-店铺二维码 /shopId/xxx.jpg		    }
        String UPAIYUN_URL_SHOP_PIC = "/system/photo/file/";   //店铺 APP图片 与终端机图片路径
        String UPAIYUN_URL_SMART = "system/smart/file/"; // 云盘路径-互动屏智能终端数据包
    }

    interface Version {
        String VERSION1 = "0.1.0";
    }

    interface FlopgoMessage {
        String API_NULL_FLOPUSER = "用户名参数没有";
        String API_NULL_FLOPCHANNEL = "用户渠道没有";
        String API_NULL_OBJECTFLOPGOID = "翻牌活动id没有";
        String API_NULL_ACTIVITYID = "最近没有活动";
        String API_NULL_LISTTYPE = "列表类型没有";
        String API_NULL_PAGESize = "没有分页";
        String API_NULL_USERPHONE = "用户手机号为空";
        String API_NULL_COUPONID = "没有卷码";
        String API_NULL_ID = "没有奖品id";
        String API_USER_NO = "用户没有登录";
        String API_USER_CHANNEL_ERROR = "用户渠道错误 ";
    }

    interface SOME_TIME {


        int SESSION_REGIST_TIME = 30 * 60;//注册时的验证码有效期为30分钟
        int SESSION_LEFT_TIME = 60 * 60 * 24 * 30;//一个月的时间吧
    }


    /**
     * API 信息常量
     */
    interface Message {
        // API请求用户异常信息
        String API_REQUEST_SUCCESS = "请求成功";
        String REQUEST_ORDER_FALSE = "未找到相关订单";
        String API_USER_UBNORMAL = "用户不正确";
        String API_VERSION_UBNORMAL = "版本号不正确";
        String API_NULL_OPTENID = "微网站下单，openId 为空";
        String API_NULL_WECHAT_PHONE = "微网站下单，缺少必要电话参数";
        String API_NULL_TER_PHONE = "终端机渠道手机用户下单，缺少必要电话参数";
        String API_NULL_PHONE = "app渠道下单，缺少必要电话参数";
        String API_NULL_USER = "未找到相关用户信息";
        String API_NULL_PARAM = "缺少必要参数";

        // Order 下单信息
        String ORDER_PARAM_UBNORMAL = "下订单参数异常";

        String GROUPON_INEXISTENCE = "下单优惠券不存在";
        String GROUPON_SOLD_OUT = "此优惠券已下线或已过期";
        String GROUPON_OUT_DATE = "下单日期不在销售时间之内";
        String ORDER_PAY_SUCCESS = "下单并生成团购券成功";
        String ORDER_SUCCESS = "下单成功";
        String GROUPON_REST_LACK = "优惠券剩余数量不足";
        String GROUPON_OUT_QUOTA = "购买数量已经超出每个用户购买限制";
        String GROUPON_OUT_QUOTA_TODAY = "亲，优惠券已被抢购一空，明天再来吧";
        // 接口使用信息
        String NO_RELATIVE_GROUPON = "未找到相关优惠券";
        String ABNORMAL_USE_TIME = "优惠券使用时间异常";
        String ABNORMAL_USE_STATUS = "优惠券使用状态异常";

        // 订单详情中默认字段
        String UPDATE_BY = "用户";
    }

    interface Common {

        int YES = 1;
        int NO = 0;

        /**
         * 返回验证码的描述短信
         */
        String SEND_PHONE_VERIFY_CODE_MSG = "send.phone.verify.code.msg";
        /**
         * 使用哪个短信通道,1:云短信通道 ，2：百悟短信通道,3:建周
         */
        String MESSAGE_CHANNEL = "message_channel";
        /**
         * 存session的
         */
        String GET_CODE_4_VERIFY_PHONE = "getCode4VerifyPhone_";
    }

    interface JSON_RESULT {
        /**
         * 正常返回状态
         */
        short STATUS_NORMAL = 0;
        /**
         * 异常返回状态
         */
        short STATUS_ABNORMAL = 1;
        /**
         * 没有权限访问
         */
        short STATUS_DENIED = 11;
        /**
         * 未登录不可访问
         */
        short STATUS_UN_LOGIN = 21;
    }

    interface PageSize {
        /**
         * 已经报名的小伙伴一页数量
         */
        int ALREADY_APPLY_USERS = 100;//
        /**
         * 我的报名一页的数量
         */
        int MINE_APPLYS = 100;
        /**
         * 首页一页的数量
         */
        int HOME_INDEX = 100;
        /**
         * 我的订单每页数量
         */
        int MY_ORDER = 100;

    }

    interface ZonesType {
        String TYPE_PROVINCE = "Province";
        String TYPE_CITY = "City";
        String TYPE_DISTRICT = "District";
        String TYPE_BUSINESSDISTRICT = "BusinessDistrict";
        String TYPE_MALL = "Mall";
        String TYPE_MALL_AREA = "MallArea";

    }

    interface Valid {
        int OPEN = 0;
        int CLOSE = 1;
        int DELETE = 2;
    }

    interface Categories {
        String FIRST_PARENT_IDS = "51f9da1731d65584ab001f0f"; // 最上面一级的分类ID
    }

    interface MallActivity {
        PropertyConfigurer propertyConfigurer = (PropertyConfigurer) SpringContextUtil.getBean("propertyConfigurer");
        String CRM_HOST_URL_Path = propertyConfigurer.getProperty("crm.rongyi.com").toString();
        String CRM_MALL_ACTIVITYS_IMAGE_PATH = propertyConfigurer.getProperty("mallActivity.image.path").toString();
    }

    interface SolrURL {
        PropertyConfigurer propertyConfigurer = (PropertyConfigurer) SpringContextUtil.getBean("propertyConfigurer");
        String SOLR_TEST_BASE = propertyConfigurer.getProperty("solr.base.url").toString();
        // String SOLR_TEST_BASE = "http://192.168.1.202:8080/solr/";
        // String SOLR_TEST_BASE = "http://10.4.13.17/solr";
        String SOLR_BRAND = SOLR_TEST_BASE + "brand/";
        String SOLR_MALL = SOLR_TEST_BASE + "mall/";
        String SOLR_SHOP = SOLR_TEST_BASE + "shop/";
        String SOLR_MEMBER = SOLR_TEST_BASE + "member/";
        String SOLR_COMMODITY = SOLR_TEST_BASE + "commodity/";
        String SOLR_RMMMSHOP = SOLR_TEST_BASE + "poi/";
    }

    interface ActivityType {
        String SHOP = "2";
        String BRAND = "0";
        String MALL = "1";
        String BAILIAN = "4";
    }

    interface CouponOrderBy {
        String PRICEASC = "priceAsc";
        String PRICEDESC = "priceDesc";
        String PUBLICASC = "publicAsc";
        String PUBLICDESC = "publicDesc";
    }

    /**
     * 优惠券展示渠道
     */
    interface ShowChannel {
        /**
         * 三个端都不展示
         */
        String NONE = "0";

        /**
         * 互动屏、APP
         */
        String TERMINAL_APP = "1";

        /**
         * 微网站、APP
         */
        String WECHAT_APP = "2";

        /**
         * 互动屏、微网站、APP
         */
        String TERMINAL_WECHAT_APP = "3";

        /**
         * APP
         */
        String APP = "4";

        /**
         * 互动屏
         */
        String TERMINAL = "5";//

        /**
         * 微网站
         */
        String WECHAT = "6";//

        /**
         * 互动屏、微网站
         */
        String TERMINAL_WECHAT = "7";
    }

    interface CheckCodeError {
        String CODEERROR = "抱歉，您输入的券码错误，不能打印，如有疑问请咨询下方的客服电话";
        String NOPRINT = "抱歉，目前不提供打印功能，请咨询下方的客服电话";
    }

    interface CheckType {
        String COMMODITY = "01";
        String COUPON = "02";
    }

    /**
     * 集团id
     */
    interface GROUPID {

        String lUDI = "100001"; // 绿地
        String JIDI = "100002"; // 金地
        String BAILIAN = "100003"; // 百联
        String RONGYI = "100000"; // 容易
    }

    /**
     * owner_id 软件提供商id
     */
    interface OWNERID {
        /**
         * 绿地
         */
        String lUDI = "000001"; // 绿地
        /**
         * 金地
         */
        String JIDI = "000002"; // 金地
        /**
         * 百联
         */
        String BAILIAN = "000003"; // 百联
        /**
         * 容易
         */
        String RONGYI = "000000"; // 容易
    }

    /**
     * 会员类型 1:实体会员， 2:电子会员
     */
    interface MEMBER_NATURE {
        /**
         * 会员类型 1:实体会员
         */
        int ENTITY_MEMBER = 1;
        /**
         * 会员类型 2:电子会员
         */
        int ELECTRONIC_MEMBER = 2;
    }

    interface ImagesCloud {
        String UPAIYUN_Url = "http://rongyi.b0.upaiyun.com/"; // 云盘路径
        String UPAIYUN_URL_BENEFITS = "system/benefits/"; // 云盘路径-会员权益
        String UPAIYUN_URL_INTEGRALRULES = "system/integralRules/"; // 云盘路径-积分规则
        String UPAIYUN_URL_INTEGRALCOMM = "system/mall/commodity/intrgral/"; // 云盘路径-积分商品
        String UPAIYUN_URL_SHOPS = "system/photo/file/"; // 云盘路径-会员权益
        String UPAIYUN_URL_SMART = "system/smart/file/"; // 云盘路径-互动屏智能终端数据包
    }

    /**
     * 是否绑定的会员
     */
    interface MemberBind {
        /**
         * 绑定
         */
        int BINDED = 0;
        /**
         * 非绑定
         */
        int UNBIND = 1;
    }

    /**
     * 会员性别
     */
    interface MemberSex {
        /**
         * 性别: M=Male男性, F=Female女性
         */
        String MALE = "M";
        /**
         * 性别: M=Male男性, F=Female女性
         */
        String FEMALE = "F";
    }

    interface RoaCommon {
        String PHONE_VERIFYCODE_OK = "true";
        String DELAYTIME = "30";

    }

    /**
     * 来源：0000（终端机），0001（app），0002（微信），0003为 移动微商城卖家版，
     * 0004为移动微商城买家版，0005（网页），0006-9999（其他，包括发码，活动等）
     *
     * @author user
     */
    interface RequestSource {
        String TERMINAL = "0000";
        String MALL_LIFE = "0001";
        String WECHAT = "0002";
        String SELLER_MOBILE_MALL = "0003";
        String BUYER_MOBILE_MALL = "0004";
        String WEB_PAGE = "0005";
    }

    interface RSA {
        String PUBLIC_KEY = "publicKey";
        String PRIVATE_KEY = "privateKey";

        String PUBLIC_KEY_STR = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCe1N+tR4udbureHSxDVlRCv7SLw7LLFixyLoXEjVFNNkxpnluammzeRlZ23PU16DLPIpCI9BtYHMh+n6Al4plc4nKEfJ0OgoLr4M/VzlCReAWl7+DFFxKZV7MA7yr7gsX/eLQyWAachc17gMmLMFfXBRD/8PZB2if2XnNfcsHL5wIDAQAB";
        String PRIVATE_KEY_STR = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAJ7U361Hi51u6t4dLENWVEK/tIvDsssWLHIuhcSNUU02TGmeW5qabN5GVnbc9TXoMs8ikIj0G1gcyH6foCXimVzicoR8nQ6Cguvgz9XOUJF4BaXv4MUXEplXswDvKvuCxf94tDJYBpyFzXuAyYswV9cFEP/w9kHaJ/Zec19ywcvnAgMBAAECgYBh/lBqZkPbQ/2gQDt46CBgdkp8GKeM6QdPAykA1XedvaxzVYKK5k/Y62iZOUYIllQSu+6UsJbWTBvfE7kI5r9bOH08nnReZN8HXEIPQGX5OYUzm/7kHhZYSXdw+rCNmbTBACEFskJ0qHGMKddxqGjuHRriI2zmVem2yHJ3uIx7EQJBAMvmqQYetN1Tfoud2ilVVMuPoFoetZdz1oHodyDFRgB82Lkpjv6e8JRg0Kuu+CXMK/0E788P1j+N16BJnqB9e4sCQQDHai4tT2ESAuqiQ3kgxqbNXlKq2c1eQFIqFn+crJesltt53ymAYShCRiGS18UFfU4tIS0nNji7qe5om0j9FyyVAkEAxQ81h66hic2p3XE/aPcJLnqutKo9QhQ32fE7QLangs0l/z3E7xvY0u4GfgZp2M3MLYpZ4boii+Wf4U+FOQJNJQJBAKSl39CbbNtxOweUzEsqmgiQ65KTWISMeQq1HtJekrD2seozPtH35kSqIQhcTRlWN5j9fomUtE0GZolKRX5qhu0CQE9D3ZasigRGCBRb9QBsSp+/5YZ1B8UPN7wUBmBKqhLVzZbTyEFVC95AofejU0jjcJ/HwPLaJmAs07oDzpJzNxU=";
    }

    /**
     * 退款状态, 未处理:0,已通过:1,已驳回:2
     *
     * @author LiuChao 2014/10/24
     */
    interface RefundStatus {
        int NOT_REFUND = 0;
        int HAS_REFUND = 1;
        int REJECT = 2;
    }

    interface MQRequestParam {
        String REQUEST_QUEUENAME_OSM = "osm";
        String REQUEST_QUEUENAME_RPB = "rpb";
        String REQUEST_QUEUENAME_VA = "va";
        String REQUEST_QUEUENAME_TMS = "tms";
        String EXCHANGE = "core_exchange";
    }

    interface Comment {
        String DEFAULT_PRAISE_WORDS = "东西不错，好评~";
    }

    interface forumCode {

        /**
         * 清仓商品板块代码
         */
        String CLEARANCE_COMMODITY = "A1003";

    }

    /*
     * 系统来源
     */
    interface sourceSystem {
        String SOTRE_MMS = "SOTRE_MMS";// 会员系统
        String STORE_CMS = "SOTRE_CMS";// 百货cms
        String STORE_COUPON = "STORE_COUPON";// 百货优惠券
        String MALLSHOP_COUPON = "MALLSHOP_COUPON";// 摩店优惠券
    }

    interface CODE_LENGTH {
        int COUPON_CODE_NEW = 14;//add by lianglaibin@2018-06-29  新卡券的券码为14位
        int COUPON_CODE = 12;
        int INVITE_CODE = 6;
        int GIFT_CODE = 8;
    }


    interface UdField {
        String UCONPONSIDS = "uConponsIds";// 优惠券增加和修改
        String DCONPONSIDS = "dConponsIds";// 优惠券删除
        String MEMBERBENEFITS = "memberBenefits";// 会员权益
        String INTEGRALRULES = "integralRules";// 积分规则
        String SIGNIN = "signIn";
        String UINTEGRALCOMMODITYIDS = "uIntegralCommodityIds";// 积分商品增加和修改
        String DINTEGRALCOMMODITYIDS = "dIntegralCommodityIds";// 积分商品删除
    }

    /**
     * 发布
     */
    interface isUdPublished {
        /**
         * 未发布
         */
        byte published_0 = 0;
        /**
         * 发布成功
         */
        byte published_1 = 1;
    }

    /**
     * 用户状态
     *
     * @author user
     */
    interface STATUS {
        /**
         * 用户状态：删除
         */
        Integer DELETE = 3;

        /**
         * 用户状态：审核中
         */
        Integer CHECKING = 2;

        /**
         * 用户状态：通过
         */
        Integer ACCESS = 1;
    }

    interface AccountType {
        /**
         * 银行卡类型
         */
        Integer BANK = 2;
        /**
         * 支付宝类型
         */
        Integer PAY = 1;
    }


    interface Permission {
        /**
         * 账户管理
         */
        Integer ACCOUNT_MANAGEMENT = 1;
        /**
         * 商品管理
         */
        Integer COMMODITY_MANAGEMENT = 2;
        /**
         * 排班管理
         */
        Integer WORKFORCE_MANAGEMENT = 3;
        /**
         * 订单管理
         */
        Integer ORDER_MANAGEMENT = 4;
        /**
         * 店员认证
         */
        Integer ASSISTANT_AUTHENTICATION = 5;
        /**
         * 客服
         */
        Integer CUSTOMER_SERVICE = 6;
        /**
         * 评价
         */
        Integer EVALUATE = 7;
        /**
         * 积分规则管理
         */
        Integer INTEGRAL_ROLE_MANAGEMENT = 8;
        /**
         * 后台商品管理
         */
        Integer BACKGROUND_COMMODITY_MANAGEMENT = 9;
        /**
         * 商品交易
         */
        Integer COMMODITY_DEAL = 10;

    }

    /**
     * SQL return Exception
     *
     * @author Lc
     */
    interface SQLException {
        String INCORRECT_VALUE = "Incorrect string value";
    }

    /**
     * 魔生活魔店版本号
     */
    interface MallLifeVersion {
        Integer VERSION = 1;
    }

    interface TMSTimeRangeType {
        int ALL = 0;
        int DAY = 1;
        int WEEK = 2;
        int MONTH = 3;
    }

    /**
     * @author lqy
     * @ClassName: DrawApplyStatus
     * @Description: TODO(提现记录状态)
     * @date 2015年5月28日 下午4:09:48
     */
    interface DrawApplyStatus {
        int ALL = 0;//所有
        int SEND = 1;//已发放
        int PROCESSING = 2;//处理中
        int FAIL = 3;//失败
        String BONUS_DEFAULT_MSG = "优秀成交额外奖励";
    }

    interface VderStatus {
        int NOT_PAY = 0;//待付款
        int HAD_PAY = 1;//已付款
        int HAD_CANCEL = 2;//已取消
        int HAD_DELETE = 3;//已删除
        int REFUND = 5; //退款状态,包括退款中和已退款
        PropertyDate[] vderStatusProperty = {new PropertyDate("0", "待付款"), new PropertyDate("1", "已付款"),
                new PropertyDate("2", "已取消"), new PropertyDate("3", "已删除")};
    }

    interface MyOrder {
        String ORDER_SPLIT = ",";
        int NOT_OUT_DATE = 0;
        int OUT_DATE = 1;
    }

    /**
     * 优惠券使用状态. 未使用:0,已使用:1,退款中:2,已退款:3,已过期:4
     *
     * @author LiuChao 2014/10/22
     */
    interface ActivityStatus {
        int NOT_USE = 0;
        int HAS_USED = 1;
        int REFUNDING = 2;
        int REFUNDED = 3;
        int EXPIRED = 4;
    }

    /**
     * 只用于优惠券列表展示, 待付款、已付款、已取消、已删除值与VderStatus同，不再重复赋值。 新增 4退款中, 5未消费, 6已退款,
     * 7已过期, 8已使用
     *
     * @author Lc
     */
    interface ActivityDisplayStatus {
        int REFUNDING = 4;
        int NOT_USE = 5;
        int REFUNDED = 6;
        int EXPIRED = 7;
        int HAS_USED = 8;
        int OUT_CODE = 9;
    }

    /**
     * 配置的类型
     */
    interface ConfigType {
        String CONFIGURATIONS = "com.rongyi.easy.gcc.Configurations";
        String TRANS_CONFIGURATIONS = "com.rongyi.easy.gcc.TransConfigurations";
        /**
         * 买手交易配置
         */
        String BUYER_TRANS_CONFIGURATIONS = "com.rongyi.easy.gcc.BuyerTransConfigurations";
        /**
         * 微商城买手参数配置
         */
        String BUYER_CONFIGURATIONS = "com.rongyi.easy.gcc.BuyerConfigurations";
    }

    interface AppType {
        /**
         * 容易逛
         */
        Integer MALLLIFE = 1;
        /**
         * 摩店
         */
        Integer MALLSHOP = 2;
    }

    interface ValidCodeSuggest {
        /**
         * 扫码验券建议
         */
        String VALID_CODE_SUGGEST = "小提醒：如果遇到用户选择数量和本页面不一致的情况，建议采用单张验码的方式试试噢。问题反馈：400-040-8989";
    }

    interface ValidCodeNum {
        /**
         * 验券的数量（默认值）
         */
        Integer DEFAULT_VALID_CODE_NUM = 1;
    }

    /**
     * 优惠券验证的异常状态描述
     *
     * @author Ventures
     */
    interface AbnormalMassage {

        String BEYONDLIMITS = "对不起，您今天已超出此类券的使用次数";
        String CODEERROR = "对不起，您输入的券码有误。";
        String REFUND = "对不起，您输入的券码状态异常";
        String BEUSED = "对不起，您输入的券码已被使用。";
        String OUTDATE = "对不起，您输入的券码已失效。";
        String UNDUEDATE = "对不起，您输入券码的活动暂未开始。";
        String NOPRINT = "抱歉，验证系统异常。";
        String NOUSEMODE = "对不起，你输入的券码，不支持此方式验证。";
        String TITLERROR = "对不起，您此次选择的优惠券名称有误，请重新选择。";
        String NOHEAR = "抱歉，本店暂未发行该类优惠券";
        String REPEAT = "您已经成功验证";
        String NOTENOUGHNUM = "没有足够的可用券码";
    }

    /**
     * App标识  来自于app store
     */
    interface AppId {
        String MDC2C_IOS_APPId = "999209638";
        String RYG_IOS_APPId = "684748850";
    }

    /**
     * App广告推广通道
     */
    interface AppAdvertChannel {
        String ZHIMENG_CHANNEL = "zhimeng";//指盟
        String WAPS_CHANNEL = "waps";//万普

    }

    interface Errno {
        int success = 0;
    }

    interface NoticeStatus {
        /**
         * 未通过
         */
        Integer NOPASSED = 0;
        /**
         * 审核中
         */
        Integer REVIEWING = 1;
        /**
         * 发布中
         */
        Integer RELEASEING = 2;
        /**
         * 已过期
         */
        Integer OVERDUE = 3;
    }

    /**
     * 卖家类型
     */
    interface GuideType {
        /**
         * 导购
         */
        Integer GUIDE = 1;
        /**
         * 买手
         */
        Integer BULL = 2;
    }

    interface CouponPage {
        Integer CURRENT_PAGE = 1;
        Integer PAGE_SIZE = 10;
    }

    interface UserOperate {
        Integer HONGBAO = 1;//红包
        Integer COUPON = 2;//代金券
        Integer REBATE = 3;//抵扣券
        Integer INVITATIONRED = 4;//推荐红包
    }

    interface RedenvelopStatus {
        int UNUSED = 0;
        int USED = 1;
        int OVERDUE = 2;
    }

    //容易逛[0] 互动屏[1] 微商[2]
    interface CouponChannel {
        int RYG = 0;//容易逛
        int HDP = 1;//互动屏
        int WX = 2;//微信
    }

    interface ExportSize {
        int EXCEL_EXPORT_MAX_SIZE = 50000;
    }

    //容易逛[0] 互动屏[1] 微商[2]
    interface CouponPublishChannel {
        int DYY = 0;//大运营卡券
        int SJ = 1;//商家卡券
    }

    /**
     * 对账类型
     */
    interface IS_PAY_VA {
        byte IS_PAY_VA_0 = 0;//初始值，未结算
        byte IS_PAY_VA_1 = 1;//对私(打款到导购虚拟账号
        byte IS_PAY_VA_2 = 2;//对公(通过对账单结算)'
    }


    /**
     * 百度推送定义的消息类型
     */
    interface BD_PUSH_MSG_TYPE {
        int TC_MSG = 0;//透传消息
        int TZ_MSG = 1;//通知消息
    }


    /**
     * 百度推送设备类型
     */
    interface PUSH_DEVICE {
        int ADDROID = 3;
        int IOS = 4;
    }

    /**
     * 百度推送到达APP
     */
    interface PUSH_APP {
        int RYG = 0;//容易逛
        int MD = 1;//摩店
        int DATA = 2;
    }

    /**
     * 推荐类目 类型APP
     *
     * @author user
     */
    interface RECOMMEND_TYPE {
        /**
         * 商场/店铺类型
         */
        Integer MALL_TYPE = 1;
        /**
         * 品牌类型
         */
        Integer BRAND_TYPE = 2;
        /**
         * 分类
         */
        Integer CATEGORY_TYPE = 3;
        /**
         * 推荐商场/店铺code
         */
        String MALL_CODE = "REC_MALL";
        /**
         * 推荐品牌code
         */
        String BRAND_CODE = "REC_BRAND";
        /**
         * 推荐分类code
         */
        String CATEGORY_CODE = "REC_CATEGORY";
    }

    interface PUSH_PLATFORM {
        /**
         * 商家后台
         */
        Integer BUSINESS_BACKGROUND = 1;
        /**
         * 摩店APP
         */
        Integer MD_APP = 2;
        /**
         * 摩店管理平台
         */
        Integer MD_MANAGEMENT = 3;
    }

    interface SHARE_USER_TYPE {
        /**
         * 容易逛用户
         */
        Integer MALLLIFE = 1;
        /**
         * 导购
         */
        Integer MALL_GUIDE = 2;
        /**
         * 买手
         */
        Integer MALL_BUYER = 3;
        /**
         * 摩店用户
         */
        Integer MALLSHOP = 4;
    }

    /***/
    interface PUBLISH_COMMODITY_DATE {
        /**
         * 检测摩店用户发布商品并修改接单状态的默认时间
         */
        Integer PUBLISH_DEFAULT_TIME = 4;//
        /**
         * 发布商品给用户推送消息的时间限制
         */
        Long LIMIT_TIME = (PUBLISH_DEFAULT_TIME - 1) * 24 * 60 * 60 * 1000L;
        /**
         * 发布商品修改用户接单状态的时间限制
         */
        Long PUBLISH_LIMIT_TIME = PUBLISH_DEFAULT_TIME * 24 * 60 * 60 * 1000L;
        /**
         * 给用户推送消息的标题
         */
        String PUSH_TITLE = "任务通知";
        /**
         * 在默认时间前一天给用户推送的消息
         */
        String PUSH_MSG_BULL = "您的买手账户已经有" + (PUBLISH_DEFAULT_TIME - 1) + "天没有发布商品，快去发布商品吧，否则明天账户将被置为'暂不接单'哦~";
        /**
         * 在默认时间前一天给用户推送的消息
         */
        String PUSH_MSG_SHOP = "您的店铺账户已经有" + (PUBLISH_DEFAULT_TIME - 1) + "天没有发布商品，快去发布商品吧，否则明天账户将被置为'暂不接单'哦~";
    }

    interface INDEX_CORE_STAT {//0更新成功  1更新中  2更新失败
        String SUCCESS = "success";
        String FAILED = "failed";
        String PROGRESS = "progress";
        String PERPROGRESS = "perprogress";
    }

    enum ErrorCode {

        /**
         * 正常返回状态
         */
        SUCCESS(0, "success"),
        /**
         * 异常返回状态
         */
        ERROR(10001, "fail"),
        /**
         * 参数错误
         */
        ERROR_PARAMETER(10101, "参数错误"),
        /**
         * DB错误
         */
        ERROR_DATABASE(10201, "DB错误"),
        /**
         * 权限错误
         */
        ERROR_AUTHORITY(10301, "权限错误"),
        /**
         * 其他、系统、未知错误
         */
        ERROR_OTHER(10999, "系统错误");

        private Integer code;
        private String message;

        private ErrorCode(Integer code, String message) {
            this.code = code;
            this.message = message;
        }

        public Integer getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }

    interface COMMON_STATUS {//0删除  1正常
        Integer delete = 0;
        Integer normal = 1;
    }

    interface IS_DEFAULT {//0非默认 1默认
        Integer no = 0;
        Integer yes = 1;
    }

    interface INDUSTRY_INFO_TYPE {//0非默认 1默认
        String own_info = "own_info";
        String extension_info = "extension_info";
    }

    enum LuckyMoneyCode {
        /**
         * 2016年双蛋红包
         */
        DOUBLE_EGG_2016("2016-SD", "2016年双蛋活动"),
        /**
         * 2017福袋红包
         */
        LUCKY_BAG_2017("LUCKY_BAG_2017", "2017福袋活动");

        private String code;
        private String message;

        private LuckyMoneyCode(String code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }

    /**
     * 分销推送的订单状态
     *
     * @author user
     */
    interface OrderPushStatus {

        /**
         * 支付成功
         */
        String TO_SHIPPED = "1";
        /**
         * 订单确认收货状态
         */
        String CONFIRM_RECEIPT = "2";
        /**
         * 订单取消和退款
         */
        String CANCEL = "3";
    }

    /**
     * 推送类型
     *
     * @author user
     */
    interface OrderPushSource {
        /**
         * 商品分销推送
         */
        String COMMODITY_FENXIAO = "COMMODITY_FENXIAO";
    }

    interface BDP_USER_KEY {
        String PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCNMUbc5ZyOfNnu8nc3Eup8HfhoMzpFvaz5jgmtcwG/88tJ8m40odTaMBCM2IoFIpq2U3fMSF6Z3Km0fVj1+w99nK60dgalyEbuCns/mGLySsJei88NsM/YHILDS8DU5gW18kKCpwvOwL5D3dqJiW2jI8a9A5a7PnEjatJzvMu2/wIDAQAB";
        String PRIVATE_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAI0xRtzlnI582e7ydzcS6nwd+GgzOkW9rPmOCa1zAb/zy0nybjSh1NowEIzYigUimrZTd8xIXpncqbR9WPX7D32crrR2BqXIRu4Kez+YYvJKwl6Lzw2wz9gcgsNLwNTmBbXyQoKnC87AvkPd2omJbaMjxr0Dlrs+cSNq0nO8y7b/AgMBAAECgYBaPSpLOD0tHEK1YyYqft564TTIdCVEOYv6G3u37Y8qvYgqBNXGsb+2i42oVyUvTwSOjx474+0CbXPRNWPMIt+st1jvxdeXEv5nQXDIyhZutmcgc0JI7QbD/dvxivH2yHFQtlh/NOA7niAj27mm8K1P5+h5EEDCOrhWSIpNW5Nz4QJBAMbaocJodJ+betNKwGl9fTF7F7QOMbcbZ3rsHMd2szAoL5lT5LtzuyaNcN/jVQd9VZ6nB5uJAPj+8H8NXomwVJkCQQC1xJQumqEcm7E3BJ/szso0+mvgy1u3gN/WlBMt+zrKdiqvLMCgiDHtUCQrkBgyEVodeihgsjGmkmCuVIcseg9XAkAgqdb6RQgrE3H4dQXoDgnbb9mz5MT7y8+SnGgZx4Clf2RaLjKbK+Zo7cDFteTIpyjCN7ODM9zqCY5dgEewHDu5AkEAj7tdbajKg6O9s4LNr2Up0lC/Y2eLJAUde0FmFTMXHyfnwtOBkq9/w2de4q+z4kuEVdDWAviFeHFBUDj5FruCSwJBAITyP/nAVY7NOiiVrguKQSUuoxqUKZJhC9CmPaPJbwhcos7qfxkJwhG4beJoN7IiuNvZ3PaP+g8rOQZJ4EljG2g=";
    }

    interface SERVICE_TYPE {
        // 店铺
        int SHOPTYPE = 4;
        // 总部
        int HEAD_TYPE = 8;
    }

    /**
     * 条件类型
     */

    interface ConditionType {
        Integer AMOUNT = 1; // 按照金额
        Integer COUNT = 2; //按照数量
    }

    /**
     * 优惠方式
     */

    interface ReductionType {
        Integer DECREASE = 1; // 减金
        Integer PERCENT = 2; // d打折
    }

    /**
     * 门槛类型1:指定门槛，2:逐级
     */
    interface RuleType {
        Integer MAX_AMOUNT = 1;
        Integer STEP_BY_STEP = 2;
    }

    /**
     * PHP platform
     */
    interface RECHARGE_PLATFORM{
        //操作渠道1:互动屏2:微信3:微商城 5:商家后台 6:POS,7小程序
        Integer SCREEN = 1;
        Integer WECHAT = 2;
        Integer WECHATMALL = 3;
        Integer BSOMS = 5;
        Integer POS = 6;
        Integer APPLET = 7;
    }

    String USERCENTER_API_URL = "usercenter.url";
    String REDUCTION_API_URL ="reduction.url";

    interface USERCENTER_TYPE{
        // 扣减
         String DEFAULT_TYPE_DECREASE = "2";
        // 增加/返还
        String DEFAULT_TYPE_INCREASE = "1";
        // optype
        String DEFAULT_OP_TYPE_INCREASE = "11";
        // 扣减optype
        String DEFAULT_OP_TYPE_DECREASE = "3";
    }

    /**
     * 营销卡券订单
     */
    interface  MK_COUPON_ORDER{
        // token
        String token = "ab32bdcb85da2cb5";
    }

    /**
     * 注册福利返回的异常
     */
    enum MK_REGISTERED_MSG {
        /**
         * 库存不足
         */
        ERROR_STOCK_LOW("1015102", "赠送失败（库存不足）"),
        /**
         * 已失效或已下架
         */
        ERROR_SOLDOUT("1015104", "赠送失败（已失效或已下架）"),
        /**
         * 已失效或已下架
         */
        ERROR_NOT_EXISTS("1015105", "赠送失败（已失效或已下架）"),
        /**
         * 系统异常
         */
        ERROR_SYSTEM("1015102", "赠送失败（系统异常）");

        private String code;
        private String message;

        private MK_REGISTERED_MSG(String code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }

    /**
     * 0：微网站（容易逛），1：容易逛，2：终端机，3：其他，4：微商城（商家），5：微信小程序 6:推送工具
     */
    interface ORDER_SOURCE_NEW {

        /**
         * 微网站（容易逛）
         */
        Integer RYG_WAP = 0;

        /**
         * 容易逛
         */
        Integer RYG_APP = 1;

        /**
         * 终端机
         */
        Integer TERMINAL = 2;

        /**
         * 其他
         */
        Integer OTHER = 3;

        /**
         * 微商城（商家）
         */
        Integer WECHAT = 4;

        /**
         * 微信小程序
         */
        Integer WECHAT_APPLET = 5;

        /**
         * 商家推送工具
         */
        Integer PUSH_TOOL = 6;

        /**
         * 新 小程序
         */
        Integer OTHER_APPLET = 10;
    }
    
    /**
     * 
     * @author user
     *
     */
    interface SMART_FILE_TYPE{
    	/**
    	 * 商场类型
    	 */
    	Integer MALL = 1;
    	/**
    	 * 店铺类型
    	 */
    	Integer SHOP = 2;
    	/**
    	 * 楼层类型
    	 */
    	Integer FLOOR = 3;
    	/**
    	 * 互动屏类型
    	 */
    	Integer MACHINE = 4;
    	/**
    	 * 店铺分类
    	 */
    	Integer CATEGORY = 5;
    	/**
    	 * 全局配置（首页）
    	 */
    	Integer HOME_MODULE = 6;
    	/**
    	 * 店铺推荐
    	 */
    	Integer RECOMM_SHOP = 7;
    	/**
    	 * app主页配置
    	 */
    	Integer APP_THEME = 8;
    	/**
    	 * 首页图片配置
    	 */
    	Integer HOME_PIC = 9;
    	/**
    	 * 精彩活动
    	 */
    	Integer WONDFUL_ACT = 10;
    	/**
    	 * 精彩活动分类
    	 */
    	Integer ACT_CATEGORY = 11;
    	/**
    	 * 会员中心
    	 */
    	Integer MEMBER_CENTER = 12;
    	/**
    	 * 会员中心
    	 */
    	Integer COUPON = 13;
    	/**
    	 * 设备点位
    	 */
    	Integer POINT = 14;
    	/**
    	 * 公共设施
    	 */
    	Integer PUBLICFAC = 15;
    	/**
    	 * 公共设施
    	 */
    	Integer DELETE = 16;
    	/**
    	 * 电子易拉宝首页
    	 */
    	Integer ROLL_SCREEN_HOME = 17;
    	/**
    	 * 电子易拉宝版商场以及设备信息
    	 */
    	Integer ROLL_SCREEN_POINT = 18;
    	/**
    	 * 电子易拉宝版设备
    	 */
    	Integer ROLL_SCREEN_MACHINE = 19;
    	/**
    	 * 电子货架banner
    	 */
    	Integer BANNER = 20;
    	/**
    	 * 设备模板排期
    	 */
    	Integer TEMPLATE_SCHEDULE = 21;
    	/**
    	 * 模板首页类型 商场LOGO
    	 */
    	Integer HOME_TYPE = 22;
    	/**
    	 * 应用数据版本号
    	 */
    	Integer APP_DATA_VERSION = 23;
    	/**
    	 * 资源使用次数
    	 */
    	Integer RESOURCE_COUNT = 24;
    	/**
    	 * 商场定制版作品数据
    	 */
    	Integer MALL_CUSTOM_PRODUCTION = 25;
        /**
         * 游戏盒子
         */
        Integer GAME_BOX = 26;
    }
    
    /**
     * 
     * @author user
     *
     */
    interface SMART_DATA_TYPE{
    	/**
    	 * 基础数据
    	 */
    	Integer BASE = 1;
    	/**
    	 * 资源文件
    	 */
    	Integer REASOURCE = 2;
    	/**
    	 * APP
    	 */
    	Integer APP = 3;
    	/**
    	 * 删除的数据
    	 */
    	Integer DELETE = 4;
    	/**
    	 * APK
    	 */
    	Integer APK = 5;
        /**
         * asar应用程序
         */
        Integer ASAR = 6;
        /**
         * flash应用模板
         */
        Integer FLASH = 7;

    }

    /**
     * 用户每天积分使用限制 redis key
     *  @author zhuming
     * @date 2017/11/14
     */
    public static final String USER_DAY_INTEGRAL_SEPATOR = "_";
}