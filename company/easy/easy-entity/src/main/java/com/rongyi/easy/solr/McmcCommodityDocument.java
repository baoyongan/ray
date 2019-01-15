package com.rongyi.easy.solr;

import com.rongyi.core.constant.Identity;
import com.rongyi.core.enumerate.mcmc.CommodityType;
import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.mcmc.CommodityShopInfo;
import com.rongyi.easy.mcmc.constant.CommodityDataStatus;
import com.rongyi.easy.mcmc.vo.CommodityVO;
import com.rongyi.easy.util.CommodityUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.solr.client.solrj.beans.Field;
import org.apache.solr.common.SolrDocument;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class McmcCommodityDocument implements java.io.Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = -6516058338575306587L;
	@Field
	private String id;
	@Field("category1")
	private String category1;
	@Field("category2")
	private String category2;
	@Field("category3")
	private String category3;
	@Field("category4")
	private String category4;
	@Field("commodityName")
	private String commodityName;
	@Field("commodityCode")
	private String commodityCode;
	@Field("commodityShopId")
	private String commodityShopId;
	@Field("zone_ids")
	private List<String> zone_ids;
	@Field("status")
	private Integer status;
	@Field("sold")
	private Integer sold;
	@Field("public_start")
	private Date public_start;
	@Field("position")
	private String position;
	@Field("brand_id")
	private String brand_id;
	@Field("category_ids")
	private List<String> category_ids;
	@Field("category1_id")
	private String category1_id;
	@Field("category2_id")
	private String category2_id;
	@Field("category3_id")
	private String category3_id;
	@Field("commodityMallId")
	private String commodityMallId;
	@Field("commodityBrandId")
	private String commodityBrandId;
	@Field("price")
	private Double price;
	@Field("currentPriceList")
	private List<Double> currentPriceList;//商品价格（不同规格现价列表，用于商品价格筛选区间）
	@Field("spot")
	private Boolean spot;
	@Field("type")
	private Integer type;
	@Field("liveId")
	private String liveId;
	@Field("liveStartTime")
	private Date liveStartTime;
	@Field("liveEndTime")
	private Date liveEndTime;
	@Field("createBy")
	private String createBy;
	@Field("commodityNameSubdiv")
	private String commodityNameSubdiv;
	@Field("saleId")
	private Integer saleId;
	@Field("flashSaleId")
	private Integer flashSaleId;
	@Field("activityStartTime")
	private Date activityStartTime;
	@Field("activityEndTime")
	private Date activityEndTime;
	@Field("sortPosition")
	private Integer sortPosition;
	@Field("flashSortPosition")
	private Integer flashSortPosition;
	@Field("terminalType")
	private Integer terminalType;// com.rongyi.easy.mcmc.constant.CommodityTerminalType常量定义
	@Field("systemNumber")
	private String systemNumber;
	//@Field("discount")
	private Double discount;
	@Field("brandName")
	private String brandName;
	@Field("updateAt")
	private Date updateAt;
    @Field("galleryPosition")
	private Integer galleryPosition;

	@Field("shopName")
	private String shopName; ///< 店铺名称
	@Field("mallName")
	private String mallName;  ///< 商场名称
	@Field("hotAreaName")
	private String hotAreaName; ///< 商圈名称
	@Field("top")
	private Integer top; ///< 置顶排序
	@Field("secKillSign")
	private String secKillSign;
	//@Field("extend")
	//private String extend;

	@Field("commodityModelNo")
	private String commodityModelNo;//商品款号
	@Field("stock")
	private Integer stock;
	@Field("commodityRange")
	private Integer commodityRange;

	@Field("locationIds")
	private List<String> locationIds;
	@Field("serviceIds")
	private List<Integer> serviceIds;
	@Field("mallServiceIds")
	private List<String> mallServiceIds;
	@Field("onServiceIds")
	private List<String> onServiceIds;
	@Field("offServiceIds")
	private List<String> offServiceIds;

	/**
	 * 商品包含的标签id,只存放的叶节点
	 */
	@Field("commodityTagIds")
	private List<String> commodityTagIds;

	/**
	 * 商品所属的标签,关联CommodityTag的id,包含父级节点的id
	 */
	@Field("commodityTagAllIds")
	private List<String> commodityTagAllIds;

	/*
	 * 是否在小程序端展示（1展示，0不展示）
	 */
	@Field("showMiniProgram")
	private Integer showMiniProgram;

	public List<String> getMallServiceIds() {
		return mallServiceIds;
	}

	public void setMallServiceIds(List<String> mallServiceIds) {
		this.mallServiceIds = mallServiceIds;
	}

	public List<String> getOnServiceIds() {
		return onServiceIds;
	}

	public void setOnServiceIds(List<String> onServiceIds) {
		this.onServiceIds = onServiceIds;
	}

	public List<String> getOffServiceIds() {
		return offServiceIds;
	}

	public void setOffServiceIds(List<String> offServiceIds) {
		this.offServiceIds = offServiceIds;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	public List<Double> getCurrentPriceList() {
		return currentPriceList;
	}
	public void setCurrentPriceList(List<Double> currentPriceList) {
		this.currentPriceList = currentPriceList;
	}
	public String getCommodityMallId() {
		return commodityMallId;
	}

	public void setCommodityMallId(String commodityMallId) {
		this.commodityMallId = commodityMallId;
	}

	public String getCommodityBrandId() {
		return commodityBrandId;
	}

	public void setCommodityBrandId(String commodityBrandId) {
		this.commodityBrandId = commodityBrandId;
	}

	public String getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}

	public List<String> getCategory_ids() {
		return category_ids;
	}

	public void setCategory_ids(List<String> category_ids) {
		this.category_ids = category_ids;
		// 三级分类拆分成三个字段
		if(CollectionUtils.isNotEmpty(category_ids)){
			if (category_ids.size()>=3) {
				this.setCategory1_id(category_ids.get(0));
				this.setCategory2_id(category_ids.get(1));
				this.setCategory3_id(category_ids.get(2));
			} else {
				// 海信只有2级分类
				if (category_ids.size()>=1) {
					this.setCategory1_id(category_ids.get(0));
				}
				if (category_ids.size()>=2) {
					this.setCategory2_id(category_ids.get(1));
				}
			}
		}
	}

	public String getCategory1_id() {
		return category1_id;
	}

	public void setCategory1_id(String category1_id) {
		this.category1_id = category1_id;
	}

	public String getCategory2_id() {
		return category2_id;
	}

	public void setCategory2_id(String category2_id) {
		this.category2_id = category2_id;
	}

	public String getCategory3_id() {
		return category3_id;
	}

	public void setCategory3_id(String category3_id) {
		this.category3_id = category3_id;
	}

	public List<String> getZone_ids() {
		return zone_ids;
	}

	public void setZone_ids(List<String> zone_ids) {
		this.zone_ids = zone_ids;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getSold() {
		return sold;
	}

	public void setSold(Integer sold) {
		this.sold = sold;
	}


	public Date getPublic_start() {
		return public_start;
	}

	public void setPublic_start(Date public_start) {
		this.public_start = public_start;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getCommodityShopId() {
		return commodityShopId;
	}

	public void setCommodityShopId(String commodityShopId) {
		this.commodityShopId = commodityShopId;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Integer getGalleryPosition() {
		return galleryPosition;
	}

	public void setGalleryPosition(Integer galleryPosition) {
		this.galleryPosition = galleryPosition;
	}


	public Integer getCommodityRange() {
		return commodityRange;
	}

	public void setCommodityRange(Integer commodityRange) {
		this.commodityRange = commodityRange;
	}


	public McmcCommodityDocument(){

	}

	public McmcCommodityDocument(SolrDocument doc){
		this.id = doc.getFieldValue("id").toString();
		this.category1 = doc.getFieldValue("category1").toString();
		this.category2 = doc.getFieldValue("category2").toString();
		this.category3 = doc.getFieldValue("category3").toString();
//		this.category4 = doc.getFieldValue("category4").toString();
		this.commodityName = doc.getFieldValue("commodityName").toString();
		this.commodityCode = doc.getFieldValue("commodityCode").toString();
		this.commodityShopId = doc.getFieldValue("commodityShopId").toString();
		this.commodityNameSubdiv = doc.getFieldValue("commodityNameSubdiv").toString();
		this.saleId=(Integer)doc.getFieldValue("saleId");
		this.flashSaleId=(Integer)doc.getFieldValue("flashSaleId");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategory1() {
		return category1;
	}
	public void setCategory1(String category1) {
		this.category1 = category1;
	}
	public String getCategory2() {
		return category2;
	}
	public void setCategory2(String category2) {
		this.category2 = category2;
	}
	public String getCategory3() {
		return category3;
	}
	public void setCategory3(String category3) {
		this.category3 = category3;
	}
	public String getCategory4() {
		return category4;
	}
	public void setCategory4(String category4) {
		this.category4 = category4;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public String getCommodityNameSubdiv() {
		return commodityNameSubdiv;
	}
	public void setCommodityNameSubdiv(String commodityNameSubdiv) {
		this.commodityNameSubdiv = commodityNameSubdiv;
	}

	public Boolean getSpot() {
		return spot;
	}

	public void setSpot(Boolean spot) {
		this.spot = spot;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getLiveId() {
		return liveId;
	}

	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}

	public Date getLiveStartTime() {
		return liveStartTime;
	}

	public void setLiveStartTime(Date liveStartTime) {
		this.liveStartTime = liveStartTime;
	}

	public Date getLiveEndTime() {
		return liveEndTime;
	}

	public void setLiveEndTime(Date liveEndTime) {
		this.liveEndTime = liveEndTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public Integer getFlashSaleId() {
		return flashSaleId;
	}

	public void setFlashSaleId(Integer flashSaleId) {
		this.flashSaleId = flashSaleId;
	}

	public Date getActivityStartTime() {
		return activityStartTime;
	}

	public void setActivityStartTime(Date activityStartTime) {
		this.activityStartTime = activityStartTime;
	}

	public Date getActivityEndTime() {
		return activityEndTime;
	}

	public void setActivityEndTime(Date activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

	public Integer getSortPosition() {
		return sortPosition;
	}

	public void setSortPosition(Integer sortPosition) {
		this.sortPosition = sortPosition;
	}

	public Integer getFlashSortPosition() {
		return flashSortPosition;
	}

	public void setFlashSortPosition(Integer flashSortPosition) {
		this.flashSortPosition = flashSortPosition;
	}

	public Integer getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(Integer terminalType) {
		this.terminalType = terminalType;
	}

	public String getSystemNumber() {
		return systemNumber;
	}

	public void setSystemNumber(String systemNumber) {
		this.systemNumber = systemNumber;
	}

	public String getSecKillSign() {
		return secKillSign;
	}

	public void setSecKillSign(String secKillSign) {
		this.secKillSign = secKillSign;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	/*public String getExtend() {
		return extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
	}*/

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getHotAreaName() {
		return hotAreaName;
	}

	public void setHotAreaName(String hotAreaName) {
		this.hotAreaName = hotAreaName;
	}

	public Integer getTop() {
		return top;
	}

	public void setTop(Integer top) {
		this.top = top;
	}

	public String getCommodityModelNo() {
		return commodityModelNo;
	}

	public void setCommodityModelNo(String commodityModelNo) {
		this.commodityModelNo = commodityModelNo;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public List<String> getLocationIds() {
		return locationIds;
	}

	public void setLocationIds(List<String> locationIds) {
		this.locationIds = locationIds;
	}

	public List<Integer> getServiceIds() {
		return serviceIds;
	}

	public void setServiceIds(List<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}

	public List<String> getCommodityTagIds() {
		return commodityTagIds;
	}

	public void setCommodityTagIds(List<String> commodityTagIds) {
		this.commodityTagIds = commodityTagIds;
	}

	public List<String> getCommodityTagAllIds() {
		return commodityTagAllIds;
	}

	public void setCommodityTagAllIds(List<String> commodityTagAllIds) {
		this.commodityTagAllIds = commodityTagAllIds;
	}

	public Integer getShowMiniProgram() {
		return showMiniProgram;
	}

	public void setShowMiniProgram(Integer showMiniProgram) {
		this.showMiniProgram = showMiniProgram;
	}

	public void wrapDocumentInfo(Commodity commodity, CommodityVO commodityVo,
								 long brandId, long mallId, CommodityShopInfo shopInfo,
								 List<Double> positions, List<String> zoneIds, String brandMid) {
		this.setId(commodity.getId().toString());
		this.setCommodityName(commodity.getName());
		this.setCommodityNameSubdiv(commodity.getName());
		this.setCommodityCode(commodity.getCode());
		this.setCommodityShopId(commodity.getShopId());
		this.setPublic_start(new Date());
		this.setSold(0);
		this.setType(CommodityType.GUIDE.getValue());
		this.setCreateBy(commodity.getCreate_by());
		this.setPrice(commodity.getPrice());
		this.setStatus(commodity.getStatus());
		this.setTerminalType(commodity.getTerminalType());
		if(!CommodityUtil.isGiftType(commodity.getCommodityRange())) {
			List<String> category_ids = new ArrayList<>();
			if (CollectionUtils.isNotEmpty(commodity.getCategoryIds())) {
				for (ObjectId categoryObjectId : commodity.getCategoryIds()) {
					category_ids.add(categoryObjectId.toString());
				}
			}
			this.setCategory_ids(category_ids);
			this.setBrandName(commodity.getBrandName());
		}
		this.setUpdateAt(commodity.getUpdateAt());

		if (commodity.getSaleId() != null && commodity.getSaleId() != 0) {
			this.setSaleId(commodity.getSaleId());
			this.setSortPosition(9999);
		}

		this.setSystemNumber(commodity.getSystemNumber());
		this.setDiscount(commodity.getDiscount());

		this.setCommodityBrandId(String.valueOf(brandId));
		this.setCommodityMallId(String.valueOf(mallId));

		if(shopInfo != null) {
			if(CollectionUtils.isNotEmpty(shopInfo.getZoneIds())){
				this.setZone_ids(shopInfo.getZoneIds());
			}else {
				if(StringUtils.isNotBlank(shopInfo.getShopMid())){
					this.setZone_ids(Arrays.asList(shopInfo.getShopMid()));//海信商品没有省市区的信息
				}
			}
			this.setPosition(shopInfo.getPositon());
			this.setBrand_id(shopInfo.getBrandMid());
		}
		this.setCommodityRange(commodityVo.getCommodityRange());

		if(commodityVo.getProcessIdentity() != null && commodityVo.getProcessIdentity() == Identity.BUYER) {
			// 买手相关字段
			this.setSpot(commodity.getIsSpot());
			this.setType(CommodityType.BULL.getValue()); // 0：商家 1：买手
			this.setTerminalType(commodity.getTerminalType());
			if(commodity.getIsSpot()) {
				this.setStatus(commodity.getStatus());
			} else {
				// 买手&非现货 商品 临时状态: -1
				this.setStatus(CommodityDataStatus.STATUS_COMMODITY_NOT_SPORT_CONTRACT);
			}
			if (zoneIds != null && !zoneIds.isEmpty()) {
				this.setZone_ids(zoneIds);
			}
			if (positions != null && positions.size() == 2) {
				this.setPosition(positions.get(0) + "," + positions.get(1));
			}
			this.setBrand_id(brandMid);
		}
		//库存进入solr
		this.setStock(commodity.getStock());
		this.setCommodityModelNo(commodity.getCommodityModelNo());

		this.setLocationIds(commodity.getLocationIds());
		//this.setServiceIds(commodity.getServiceIds());
		this.setMallServiceIds(commodity.getMallServiceIds());
		this.setOnServiceIds(commodity.getOnServiceIds());
		this.setCommodityTagIds(commodity.getCommodityTagIds());
		this.setCommodityTagAllIds(commodity.getCommodityTagAllIds());
		this.setShowMiniProgram(commodity.getShowMiniProgram());
	}

	public void toDocument(Commodity commodity) {
		if(commodity != null) {
			this.setId(commodity.getId().toString());
			this.setCommodityName(commodity.getName());//商品名字
			this.setCommodityNameSubdiv(commodity.getName());//商品名字
			this.setCommodityCode(commodity.getCode());//商品编码
			this.setCommodityShopId(commodity.getShopId());//商品所在店铺 MySQL id
			this.setCommodityBrandId(commodity.getBrandId());//商品关联品牌 MySQL id
			this.setBrand_id(commodity.getBrandMid());
			this.setCommodityMallId(commodity.getMallId());//商品所在商场 MySQL id
            /*商品状态*/
			this.setStatus(commodity.getStatus());
			this.setSold(commodity.getSold());//销量
			this.setPublic_start(commodity.getRegisterAt());//上架时间
			this.setPrice(commodity.getPrice());
			this.setTerminalType(commodity.getTerminalType());
			this.setMallServiceIds(commodity.getMallServiceIds());
			this.setOnServiceIds(commodity.getOnServiceIds());
			this.setOffServiceIds(commodity.getOffServiceIds());

			// 新增店铺名称、商场名称、商圈名称
			this.setHotAreaName(commodity.getHotAreaName());
			this.setMallName(commodity.getMallName());
			this.setShopName(commodity.getShopName());

			this.setUpdateAt(commodity.getUpdateAt());
			this.setCommodityTagIds(commodity.getCommodityTagIds());
			this.setCommodityTagAllIds(commodity.getCommodityTagAllIds());
			this.setShowMiniProgram(commodity.getShowMiniProgram());
		}
	}




	/** commoditytoNewDocument
	 * commodity 转成  document
	 *
	 * @param commodity
	 */
	public void commoditytoNewDocument(Commodity commodity) {
		if(commodity != null) {

			this.setId(commodity.getId().toString());
			this.setCommodityName(commodity.getName());//商品名字
			this.setCommodityNameSubdiv(commodity.getName());//商品名字

			//【1】过滤条件
			this.setCommodityCode(commodity.getCode());//商品编码
			this.setCommodityShopId(commodity.getShopId());//商品所在店铺 MySQL id
			this.setCommodityBrandId(commodity.getBrandId());//商品关联品牌 MySQL id
			this.setBrand_id(commodity.getBrandMid());
			this.setCommodityMallId(commodity.getMallId());//商品所在商场 MySQL id
			this.setCreateBy(commodity.getCreate_by()); //createBy

			//【2】排序条件（整理ing）
			this.setDiscount(commodity.getDiscount());



			//【3】分组查询条件 （整理ing）
			//商品总表ID（查询分组使用）
			this.setSystemNumber(commodity.getSystemNumber());

            /*商品状态*/
			this.setStatus(commodity.getStatus());
			this.setSold(commodity.getSold());//销量
			this.setPrice(commodity.getPrice());
			this.setTerminalType(commodity.getTerminalType());
			this.setMallServiceIds(commodity.getMallServiceIds());
			this.setOnServiceIds(commodity.getOnServiceIds());
			this.setOffServiceIds(commodity.getOffServiceIds());
			this.setCommodityModelNo(commodity.getCommodityModelNo());



			//直播商品,查询所有直播商品
			this.setSaleId(commodity.getSaleId());
			//特卖商品
			this.setFlashSaleId(commodity.getFlashSaleId());


			 this.setStock(commodity.getStock());
			this.setLocationIds(commodity.getLocationIds());
			this.setBrandName(commodity.getBrandName());

			this.setCommodityRange(commodity.getCommodityRange());
			this.setType(commodity.getType());
			//设置特卖
			if (commodity.getSaleId() != null && commodity.getSaleId() != 0) {
				this.setSaleId(commodity.getSaleId());
				this.setSortPosition(9999);
			}

			//发布 更新时间
			if(null!=commodity.getRegisterAt()){
			 this.setPublic_start(commodity.getRegisterAt());//上架时间
			}else{
			 this.setPublic_start(commodity.getCreateAt());
			}

			this.setUpdateAt(commodity.getUpdateAt());

			// 新增店铺名称、商场名称、商圈名称
			this.setHotAreaName(commodity.getHotAreaName());
			this.setMallName(commodity.getMallName());
			this.setShopName(commodity.getShopName());

            //买手商品
			if(commodity.getType() == Identity.BUYER) {
				this.setSpot(commodity.getIsSpot());
				if(commodity.getIsSpot()) {
					this.setStatus(commodity.getStatus());
				} else {
					// 买手&非现货 商品 临时状态: -1
					this.setStatus(CommodityDataStatus.STATUS_COMMODITY_NOT_SPORT_CONTRACT);
				}

			}
			//直播商品排序
			this.setTop(commodity.getSort());
			this.setCommodityTagIds(commodity.getCommodityTagIds());
			this.setCommodityTagAllIds(commodity.getCommodityTagAllIds());
			this.setShowMiniProgram(commodity.getShowMiniProgram());


		}
	}


}