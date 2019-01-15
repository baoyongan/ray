package com.rongyi.easy.coupon.param;

import com.rongyi.easy.coupon.entity.CouponShop;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/3/14 15:06
 * Package:com.rongyi.easy.coupon.param
 * Project:easy-market
 */
public class ActivityCouponParam implements Serializable{

    private String  id;

    private Integer couponType;

    private Integer activityId;

    private String activityName;

    private String activityJoinTime;

    private Date joinStartAt;

    private Date joinEndAt;

    private String name;

    private Integer totalCount;

    private Integer joinCount;
    /**
     * 原价
     */
    private Double origPrice;

    /**
     * 优惠价
     */
    private Double currPrice;

    private Date publishStartAt;

    private Date publishEndAt;

    private Date validStartAt;

    private Date validEndAt;

    private String listPicUrl;

    private String usageDesc;

    private String limitDesc;

    private String remark;

    private List<CouponShop> couponShops;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityJoinTime() {
        return activityJoinTime;
    }

    public void setActivityJoinTime(String activityJoinTime) {
        this.activityJoinTime = activityJoinTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getJoinCount() {
        return joinCount;
    }

    public void setJoinCount(Integer joinCount) {
        this.joinCount = joinCount;
    }

    public Double getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(Double origPrice) {
        this.origPrice = origPrice;
    }

    public Double getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(Double currPrice) {
        this.currPrice = currPrice;
    }

    public Date getPublishStartAt() {
        return publishStartAt;
    }

    public void setPublishStartAt(Date publishStartAt) {
        this.publishStartAt = publishStartAt;
    }

    public Date getPublishEndAt() {
        return publishEndAt;
    }

    public void setPublishEndAt(Date publishEndAt) {
        this.publishEndAt = publishEndAt;
    }

    public Date getValidStartAt() {
        return validStartAt;
    }

    public void setValidStartAt(Date validStartAt) {
        this.validStartAt = validStartAt;
    }

    public Date getValidEndAt() {
        return validEndAt;
    }

    public void setValidEndAt(Date validEndAt) {
        this.validEndAt = validEndAt;
    }

    public String getListPicUrl() {
        return listPicUrl;
    }

    public void setListPicUrl(String listPicUrl) {
        this.listPicUrl = listPicUrl;
    }

    public String getUsageDesc() {
        return usageDesc;
    }

    public void setUsageDesc(String usageDesc) {
        this.usageDesc = usageDesc;
    }

    public String getLimitDesc() {
        return limitDesc;
    }

    public void setLimitDesc(String limitDesc) {
        this.limitDesc = limitDesc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getJoinStartAt() {
        return joinStartAt;
    }

    public void setJoinStartAt(Date joinStartAt) {
        this.joinStartAt = joinStartAt;
    }

    public Date getJoinEndAt() {
        return joinEndAt;
    }

    public void setJoinEndAt(Date joinEndAt) {
        this.joinEndAt = joinEndAt;
    }

    public List<CouponShop> getCouponShops() {
        return couponShops;
    }

    public void setCouponShops(List<CouponShop> couponShops) {
        this.couponShops = couponShops;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ActivityCouponParam{");
        sb.append("id='").append(id).append('\'');
        sb.append(", couponType=").append(couponType);
        sb.append(", activityId=").append(activityId);
        sb.append(", activityName='").append(activityName).append('\'');
        sb.append(", activityJoinTime='").append(activityJoinTime).append('\'');
        sb.append(", joinStartAt=").append(joinStartAt);
        sb.append(", joinEndAt=").append(joinEndAt);
        sb.append(", name='").append(name).append('\'');
        sb.append(", totalCount=").append(totalCount);
        sb.append(", joinCount=").append(joinCount);
        sb.append(", origPrice=").append(origPrice);
        sb.append(", currPrice=").append(currPrice);
        sb.append(", publishStartAt=").append(publishStartAt);
        sb.append(", publishEndAt=").append(publishEndAt);
        sb.append(", validStartAt=").append(validStartAt);
        sb.append(", validEndAt=").append(validEndAt);
        sb.append(", listPicUrl='").append(listPicUrl).append('\'');
        sb.append(", usageDesc='").append(usageDesc).append('\'');
        sb.append(", limitDesc='").append(limitDesc).append('\'');
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", couponShops=").append(couponShops);
        sb.append('}');
        return sb.toString();
    }
}