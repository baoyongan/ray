package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

/**
 * Created by xuying on 2016/6/20.
 */
public class OperateCommoditySearchParam implements Serializable{
    private String code;//编码
    private String name;//商品名
    private String source;//渠道(买手，商家，全部)
    private String buyerName;//买手
    private String flag;//1商场、2分公司
    private String searchName;//商场名称或者分公司名称
    private String shopName;//店铺名称
    private String categoryId;//3级分类id
    private String category;//4级分类id
    private int status;//状态 0下架 1上架 2是删除3待上架4待处理 -1表示所有
    private String timeType;//1创建时间、2上架时间、3下架时间
    private Long startTime;//时间段开始
    private Long endTime;//时间段结束
    private int currpage;//当页数1表示第一页
    private int pageSize;//每页大小
    private String keyword;
    private Integer terminalType;//上架终端

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public int getCurrpage() {
        return currpage;
    }

    public void setCurrpage(int currpage) {
        this.currpage = currpage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(Integer terminalType) {
        this.terminalType = terminalType;
    }

    @Override
    public String toString() {
        return "OperateCommoditySearchParam{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", flag='" + flag + '\'' +
                ", searchName='" + searchName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", category='" + category + '\'' +
                ", status=" + status +
                ", timeType='" + timeType + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", currpage=" + currpage +
                ", pageSize=" + pageSize +
                ", keyword='" + keyword + '\'' +
                ", terminalType='" + terminalType + '\'' +
                '}';
    }
}
