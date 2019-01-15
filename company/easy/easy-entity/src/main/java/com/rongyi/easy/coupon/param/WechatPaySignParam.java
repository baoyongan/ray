package com.rongyi.easy.coupon.param;

import java.io.Serializable;

public class WechatPaySignParam implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 支付类型 1：web页支付宝支付，3:手机支付宝支付，5：微信app支付 6翼支付
     */
    private String payType;
    /**
     * appId
     */
    private String appId;
    /**
     * 微信公众号支付需要获取支付用户的openId
     */
    private String openId;
    /**
     * 0:APP(app支付),1:JSAPI(公众号支付),2:NATIVE(原生扫码支付)
     */
    private String weixinPayType;

    /**
     * 支付宝网页支付同步回调地址
     */
    private String callBackUrl;

    /**
     * 返回商户地址
     */
    private String merchantUrl;

    /**
     * 商场id
     */
    private String mallId;

    //商户类型 1商场 4店铺
    private Integer merType ;

    //商户ID or 店铺ID
    private String merId;


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getWeixinPayType() {
        return weixinPayType;
    }

    public void setWeixinPayType(String weixinPayType) {
        this.weixinPayType = weixinPayType;
    }

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }

    public String getMerchantUrl() {
        return merchantUrl;
    }

    public void setMerchantUrl(String merchantUrl) {
        this.merchantUrl = merchantUrl;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public Integer getMerType() {
        return merType;
    }

    public void setMerType(Integer merType) {
        this.merType = merType;
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId;
    }

    @Override
    public String toString() {
        return "WechatPaySignParam [orderNo=" + orderNo + ", payType="
                + payType + ", appId=" + appId + ", openId=" + openId
                + ", weixinPayType=" + weixinPayType + ", callBackUrl=" + callBackUrl
                + ", merchantUrl=" + merchantUrl  + ", mallId=" + mallId  +",merType="+merType+ ",merId="+merId+ "]";
    }

}