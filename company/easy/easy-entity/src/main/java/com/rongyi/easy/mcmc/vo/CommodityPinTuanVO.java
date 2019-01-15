package com.rongyi.easy.mcmc.vo;

import com.rongyi.easy.activitymanage.vo.groupBuy.GroupBuyGoodSimpleInfo;
import com.rongyi.easy.mcmc.Commodity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 拼团商品VO
 *
 * @author yaoyiwei
 * @date 2016-10-19
 * @version 1.0
 *
 */
public class CommodityPinTuanVO implements Serializable {

    private String commodityId;
    private String commodityName;
    private Double originalPrice;
    private Double activityPrice;
    private Integer groupPeopleLimit;
    private List<String> picUrls;
    // 拼团剩余库存
    private Integer remainStock;

    /*后台使用参数*/
    private String commodityCode;
    private List<Double> currentPriceList;
    // 商品基本库存
    private Integer stock;
    private List<String> categoryNames;
    private boolean  isActivityCommodity=false;
    private boolean hasMoreSpecs;
    private String commodityDescription;//商品描述
    private String shopMid;//店铺mongoId
    private String shopName;//店铺名称
    private String subTitle;//副标题
    private String commodityModelNo; //款号
    private Integer status;//状态 -1：非现货初始化(直播使用） 0下架 1上架 (当前时间在上架时间和下架时间之间)2是删除3待上架4待处理5待审核 6审核失败
    private Date registerAt;//上架时间
    private Date soldOutAt;//下架时间

    public String getCommodityModelNo() {
        return commodityModelNo;
    }

    public void setCommodityModelNo(String commodityModelNo) {
        this.commodityModelNo = commodityModelNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public CommodityPinTuanVO(){}

    public CommodityPinTuanVO(Builder builder) {
        this.commodityId = builder.commodityId;
        this.commodityName = builder.commodityName;
        this.commodityCode = builder.commodityCode;
        this.stock = builder.stock;
        this.categoryNames = builder.categoryNames;
        this.currentPriceList = builder.currentPriceList;
        this.commodityDescription=builder.commodityDescription;
        this.picUrls=builder.picUrls;
    }

    public static class Builder {
        private String commodityId;
        private String commodityName;
        private String commodityCode;
        private List<Double> currentPriceList;
        private Integer stock;
        private List<String> categoryNames;
        private String commodityDescription;//商品描述
        private List<String> picUrls;//商品图片集合

        public Builder() {}

        public Builder(String id, String name) {
            this.commodityId = id;
            this.commodityName = name;
        }

        public Builder code(String val) {
            this.commodityCode = val;
            return this;
        }

        public Builder stock(Integer val) {
            this.stock = val;
            return this;
        }

        public Builder categoryNames(List vals) {
            categoryNames = vals;
            return this;
        }

        public Builder currentPriceList(List vals) {
            currentPriceList = vals;
            return this;
        }

        public Builder commodityDescription(String val) {
            commodityDescription = val;
            return this;
        }

        public Builder picUrls(List vals) {
            picUrls = vals;
            return this;
        }

        public CommodityPinTuanVO build() {
            return new CommodityPinTuanVO(this);
        }
    }

    public CommodityPinTuanVO wrapPinTuanVO(Commodity commodity, GroupBuyGoodSimpleInfo goods) {
        CommodityPinTuanVO vo = new CommodityPinTuanVO();

        vo.setCommodityName(commodity.getName());
        vo.setOriginalPrice(Double.parseDouble(commodity.getoPriceMax()));
        vo.setGroupPeopleLimit(goods.getGroupPeopleLimit());
        vo.setPicUrls(commodity.getPicList());
        vo.setActivityPrice(goods.getMinActivityPrice(goods.getSpecs()));
        vo.setRemainStock(goods.getRemainStock(goods.getSpecs()));
        vo.setCommodityId(commodity.getId().toString());

        return vo;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(Double activityPrice) {
        this.activityPrice = activityPrice;
    }

    public Integer getGroupPeopleLimit() {
        return groupPeopleLimit;
    }

    public void setGroupPeopleLimit(Integer groupPeopleLimit) {
        this.groupPeopleLimit = groupPeopleLimit;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public List<String> getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(List<String> picUrls) {
        this.picUrls = picUrls;
    }

    public Integer getRemainStock() {
        return remainStock;
    }

    public void setRemainStock(Integer remainStock) {
        this.remainStock = remainStock;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public List<Double> getCurrentPriceList() {
        return currentPriceList;
    }

    public void setCurrentPriceList(List<Double> currentPriceList) {
        this.currentPriceList = currentPriceList;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public List<String> getCategoryNames() {
        return categoryNames;
    }

    public void setCategoryNames(List<String> categoryNames) {
        this.categoryNames = categoryNames;
    }

    public boolean isActivityCommodity() {
        return isActivityCommodity;
    }

    public void setIsActivityCommodity(boolean isActivityCommodity) {
        this.isActivityCommodity = isActivityCommodity;
    }

    public boolean isHasMoreSpecs() {
        return hasMoreSpecs;
    }

    public void setHasMoreSpecs(boolean hasMoreSpecs) {
        this.hasMoreSpecs = hasMoreSpecs;
    }

    public String getCommodityDescription() {
        return commodityDescription;
    }

    public void setCommodityDescription(String commodityDescription) {
        this.commodityDescription = commodityDescription;
    }

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
    
}