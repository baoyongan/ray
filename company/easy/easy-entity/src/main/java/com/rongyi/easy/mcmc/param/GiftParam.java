package com.rongyi.easy.mcmc.param;

import com.rongyi.easy.mcmc.vo.GiftPaymentVO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 礼品参数
 *
 * @author yaoyiwei
 * @date 2016-11-30
 * @version 1.0
 *
 */
public class GiftParam implements Serializable {

    private String id;
    private String name;
    private String code;
    private Integer stock;
    private List<String> picList;
    private String description;
    private Integer purchaseCount;
    private String createBy;
    // 礼品id mysql id 兼容老数据
    private String giftId;
    // 礼品编号
    private String sn;
    // 礼品所属id
    private String mappingId;
    // 商品类型(0:商品, 1:礼品)
    private Integer commodityRange;
    // 礼品参与活动id
    private String activityId;
    // 兑换类型（1.兑换，2.换购）
    private String exchangeTypes;
    // 积分设置类型（1.同一设置 2.按等级设置）
    private Integer pointType;
    // 换购类型（1.同一设置 2.按等级设置）
    private Integer buyType;
    // 配送方式（1.自提 2.快递）
    private String deliveryTypes;
    // 自提类型（1.公共设施 2.指定店铺）
    private Integer selfType;
    // 自提地点
    private String selfAddress;
    // 自提地点备注
    private String selfRemark;
    // 自提地点id
    private String selfAddressId;
    // 自提期限
    private Date selfExpireDate;
    // 标签列表
    private List<String> tagIds;
    // 支付方式列表
    private List<String> paymentIds;
    private List<GiftPaymentVO> paymentVOs;
    // 终端
    private String platform;
    private Double price;
    private Date registerAt;//上架时间
    private Date soldOutAt;//下架时间
    private Integer selfTakeDays;
    private String reason;
    private Integer status;
    // 卡券开始时间
    private Date couponStartDate;
    // 卡券过期时间
    private Date couponEndDate;
    private Integer source;
    private String mallMid;

    /**
     * 是否推荐(0:不推荐,1:推荐)
     */
    private Integer recommend;

    /*
     * 是否在积分商城展示（1展示，2不展示）
     */
    private Integer showIntegralMall;

    public String getMallMid() {
        return mallMid;
    }

    public void setMallMid(String mallMid) {
        this.mallMid = mallMid;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Date getCouponStartDate() {
        return couponStartDate;
    }

    public void setCouponStartDate(Date couponStartDate) {
        this.couponStartDate = couponStartDate;
    }

    public Date getCouponEndDate() {
        return couponEndDate;
    }

    public void setCouponEndDate(Date couponEndDate) {
        this.couponEndDate = couponEndDate;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public List<String> getPicList() {
        return picList;
    }

    public void setPicList(List<String> picList) {
        this.picList = picList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public String getGiftId() {
        return giftId;
    }

    public void setGiftId(String giftId) {
        this.giftId = giftId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getMappingId() {
        return mappingId;
    }

    public void setMappingId(String mappingId) {
        this.mappingId = mappingId;
    }

    public Integer getCommodityRange() {
        return commodityRange;
    }

    public void setCommodityRange(Integer commodityRange) {
        this.commodityRange = commodityRange;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getExchangeTypes() {
        return exchangeTypes;
    }

    public void setExchangeTypes(String exchangeTypes) {
        this.exchangeTypes = exchangeTypes;
    }

    public Integer getPointType() {
        return pointType;
    }

    public void setPointType(Integer pointType) {
        this.pointType = pointType;
    }

    public Integer getBuyType() {
        return buyType;
    }

    public void setBuyType(Integer buyType) {
        this.buyType = buyType;
    }

    public String getDeliveryTypes() {
        return deliveryTypes;
    }

    public void setDeliveryTypes(String deliveryTypes) {
        this.deliveryTypes = deliveryTypes;
    }

    public Integer getSelfType() {
        return selfType;
    }

    public void setSelfType(Integer selfType) {
        this.selfType = selfType;
    }

    public String getSelfAddress() {
        return selfAddress;
    }

    public void setSelfAddress(String selfAddress) {
        this.selfAddress = selfAddress;
    }

    public String getSelfRemark() {
        return selfRemark;
    }

    public void setSelfRemark(String selfRemark) {
        this.selfRemark = selfRemark;
    }

    public String getSelfAddressId() {
        return selfAddressId;
    }

    public void setSelfAddressId(String selfAddressId) {
        this.selfAddressId = selfAddressId;
    }

    public Date getSelfExpireDate() {
        return selfExpireDate;
    }

    public void setSelfExpireDate(Date selfExpireDate) {
        this.selfExpireDate = selfExpireDate;
    }

    public List<String> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }

    public List<String> getPaymentIds() {
        return paymentIds;
    }

    public void setPaymentIds(List<String> paymentIds) {
        this.paymentIds = paymentIds;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getRegisterAt() {
        return registerAt;
    }

    public void setRegisterAt(Date registerAt) {
        this.registerAt = registerAt;
    }

    public Date getSoldOutAt() {
        return soldOutAt;
    }

    public void setSoldOutAt(Date soldOutAt) {
        this.soldOutAt = soldOutAt;
    }

    public List<GiftPaymentVO> getPaymentVOs() {
        return paymentVOs;
    }

    public void setPaymentVOs(List<GiftPaymentVO> paymentVOs) {
        this.paymentVOs = paymentVOs;
    }

    public Integer getSelfTakeDays() {
        return selfTakeDays;
    }

    public void setSelfTakeDays(Integer selfTakeDays) {
        this.selfTakeDays = selfTakeDays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public Integer getShowIntegralMall() {
        return showIntegralMall;
    }

    public void setShowIntegralMall(Integer showIntegralMall) {
        this.showIntegralMall = showIntegralMall;
    }

    @Override
    public String toString() {
        return "GiftParam{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", stock=" + stock +
                ", picList=" + picList +
                ", description='" + description + '\'' +
                ", purchaseCount=" + purchaseCount +
                ", createBy='" + createBy + '\'' +
                ", giftId='" + giftId + '\'' +
                ", sn='" + sn + '\'' +
                ", mappingId='" + mappingId + '\'' +
                ", commodityRange=" + commodityRange +
                ", activityId='" + activityId + '\'' +
                ", exchangeTypes='" + exchangeTypes + '\'' +
                ", pointType=" + pointType +
                ", buyType=" + buyType +
                ", deliveryTypes='" + deliveryTypes + '\'' +
                ", selfType=" + selfType +
                ", selfAddress='" + selfAddress + '\'' +
                ", selfRemark='" + selfRemark + '\'' +
                ", selfAddressId='" + selfAddressId + '\'' +
                ", selfExpireDate=" + selfExpireDate +
                ", tagIds=" + tagIds +
                ", paymentIds=" + paymentIds +
                ", paymentVOs=" + paymentVOs +
                ", platform='" + platform + '\'' +
                ", price=" + price +
                ", registerAt=" + registerAt +
                ", soldOutAt=" + soldOutAt +
                ", selfTakeDays=" + selfTakeDays +
                ", reason='" + reason + '\'' +
                ", status=" + status +
                ", couponStartDate=" + couponStartDate +
                ", couponEndDate=" + couponEndDate +
                ", source=" + source +
                ", mallMid='" + mallMid + '\'' +
                ", recommend='" + recommend + '\'' +
                '}';
    }

}