package com.rongyi.easy.pos.entity;

import java.io.Serializable;

/**
 * 获取运费活动-子商品请求参数
 *
 * @author wangjh7
 * @date 2017-06-20
 */
public class ExpressFeeUnitEntity implements Serializable {
    private String unitId;
    private String skuId;
    // 折扣总价（单价*数量-分摊折扣价）
    private Double totalAmount;
    // 数量
    private Integer count;

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    @Override
    public String toString() {
        return "ReductionUnitEntity{" +
                "count=" + count +
                ", unitId='" + unitId + '\'' +
                ", skuId='" + skuId + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
