package com.rongyi.easy.tms.vo.v2;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * kejun
 * 2016/4/28 11:49
 **/
public class CartOrderExcelVO {

    private String cartOrderNo;

    private String mallId;

    private String shopId;

    private String sellerAccount;

    private String userPhone;

    private String commodityId;

    private String createAt;

    private String guideType;

    private String amountType;

    private String createAtBegin;

    private String createAtEnd;

    private String orderNo;

    private Integer orderSource;

    private Integer payChannel;

    private Double realAmountBegin;

    private Double realAmountEnd;

    private Integer status;

    private String userAccount;


    public String getAmountType() {
        return amountType;
    }

    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    public String getCreateAtBegin() {
        return createAtBegin;
    }

    public void setCreateAtBegin(String createAtBegin) {
        this.createAtBegin = createAtBegin;
    }

    public String getCreateAtEnd() {
        return createAtEnd;
    }

    public void setCreateAtEnd(String createAtEnd) {
        this.createAtEnd = createAtEnd;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public Double getRealAmountBegin() {
        return realAmountBegin;
    }

    public void setRealAmountBegin(Double realAmountBegin) {
        this.realAmountBegin = realAmountBegin;
    }

    public Double getRealAmountEnd() {
        return realAmountEnd;
    }

    public void setRealAmountEnd(Double realAmountEnd) {
        this.realAmountEnd = realAmountEnd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getCartOrderNo() {
        return cartOrderNo;
    }

    public void setCartOrderNo(String cartOrderNo) {
        this.cartOrderNo = cartOrderNo;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getSellerAccount() {
        return sellerAccount;
    }

    public void setSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getGuideType() {
        return guideType;
    }

    public void setGuideType(String guideType) {
        this.guideType = guideType;
    }

    @Override
    public String toString() {
        return "CartOrderExcelVO{" +
                "cartOrderNo='" + cartOrderNo + '\'' +
                ", mallId='" + mallId + '\'' +
                ", shopId='" + shopId + '\'' +
                ", sellerAccount='" + sellerAccount + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", commodityId='" + commodityId + '\'' +
                ", createAt='" + createAt + '\'' +
                ", guideType='" + guideType + '\'' +
                ", amountType='" + amountType + '\'' +
                ", createAtBegin=" + createAtBegin +
                ", createAtEnd=" + createAtEnd +
                ", orderNo='" + orderNo + '\'' +
                ", orderSource=" + orderSource +
                ", payChannel=" + payChannel +
                ", realAmountBegin=" + realAmountBegin +
                ", realAmountEnd=" + realAmountEnd +
                ", status=" + status +
                ", userAccount='" + userAccount + '\'' +
                '}';
    }

    public Map<String,Object> toMap(){
        Map<String,Object> map = new HashMap<>();
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            Object obj;
            try {
                obj = field.get(this);
                if(obj!=null){
                    map.put(field.getName(), obj);
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }
}