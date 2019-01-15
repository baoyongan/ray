package com.rongyi.easy.rpb.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Created by shaozhou on 2017/3/29.
 */
public class PaymentOrderForCmsVo implements Serializable {
    private String cashName;//收银商户
    private Integer couponUsed;//卡券抵扣
    private String orderNo;//订单号
    private Long payAmount;//实际支付金额（分）
    private Long paymentTime;//支付时间
    private Integer paymentType;//支付方式（0:支付宝 1:微信 2:pos银行卡,3:现金）
    private Long realAmount;//订单金额
    private Long reductionUsed;//满减金额
    private Long scoreDiscount;//积分抵扣金额
    private String settleName;//结算对象
    private Integer status;//
    private String posNo;//收款设备号
    private String memo ;//备注
    private Integer source;//订单来源 3 pos订单 4 开发平台订单
    private String ryMchId;//商家rymchId
    private String payNo;//订单流水号

    public String getCashName() {
        return cashName;
    }

    public void setCashName(String cashName) {
        this.cashName = cashName;
    }

    public Integer getCouponUsed() {
        return couponUsed;
    }

    public void setCouponUsed(Integer couponUsed) {
        this.couponUsed = couponUsed;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public Long getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Long paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Long getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Long realAmount) {
        this.realAmount = realAmount;
    }

    public Long getReductionUsed() {
        return reductionUsed;
    }

    public void setReductionUsed(Long reductionUsed) {
        this.reductionUsed = reductionUsed;
    }

    public Long getScoreDiscount() {
        return scoreDiscount;
    }

    public void setScoreDiscount(Long scoreDiscount) {
        this.scoreDiscount = scoreDiscount;
    }

    public String getSettleName() {
        return settleName;
    }

    public void setSettleName(String settleName) {
        this.settleName = settleName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getRyMchId() {
        return ryMchId;
    }

    public void setRyMchId(String ryMchId) {
        this.ryMchId = ryMchId;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}