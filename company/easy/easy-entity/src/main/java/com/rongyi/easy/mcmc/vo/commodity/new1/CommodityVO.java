package com.rongyi.easy.mcmc.vo.commodity.new1;

import com.rongyi.core.common.util.DateTool;
import com.rongyi.easy.bsoms.entity.SessionUserInfo;
import com.rongyi.easy.malllife.constants.Constants;
import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.mcmc.constant.CommodityConstants;
import com.rongyi.easy.mcmc.constant.CommodityDataStatus;
import com.rongyi.easy.mcmc.constant.CommodityTerminalType;
import com.rongyi.easy.mcmc.param.CommodityParam;
import com.rongyi.easy.mcmc.vo.GiftPaymentVO;
import com.rongyi.easy.mcmc.vo.commodity.new1.postage.PostageTemplateVO;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class CommodityVO implements  Serializable, Cloneable {

	/**
	 *
	 */
	private static final long serialVersionUID = 8138633144546500349L;
	private static final  Integer MAX_GALLERY_POSITION=100;
	private String commodityId;
	private String commodityName;
	private String commodityCategory;
	private List<ObjectId> commodityCategoryIds;//商品所属的品类列表（海信）
	private String commodityCategory1;	//新增 一级类目ID(当前适用于getCommodityById)
	private String commodityCategory2;	//新增 二级类目ID(当前适用于getCommodityById)
	private String commodityCategoryName1;
	private String commodityCategoryName2;
	private String commodityDescription;
	private String commodityPostage;
	private String commodityStock;
	private String commoditySold;
	private String commodityPubDate;
	private Integer commodityStatus;
	private int commodityAppStatus;// 商品APP显示状态 (0下架 1上架 3待上架)

	private String commodityOPriceMax;//我是最高原价”,
	private String commodityOPriceMin;//我是最低原价”,
	private String commodityCPriceMax;//我是最高现价”,
	private String commodityCPriceMin;//我是最低现价”,
	private String commodityOPOfLCP;//我是最低现价对应的原价

	private int commodityType;//渠道  0商家，1买手
	private int isSpot;//是否现货
	private Date liveStartTime; // 直播开始时间
	private Date liveEndTime; // 直播结束时间
	private String create_by; // 创建人
	private String update_by;//修改人
	private String liveId; // 直播Id
	private Integer saleId;
	private Integer flashSaleId;
	private String commodityOriginalPrice;
	private String commodityCurrentPrice;
	private String shopId;//店铺mysql Id
	private String shopMid; // shop mongo id
	private String commodityShopNumber;
	private List<String> commodityPicList;//商品图片
	private List<CommoditySpecVO> commoditySpecList;//商品规格信息
	private String commodityCode;//商品编码
	private String commodityBarCode; //商品条形码
	private String commodityCommission;
	private String brandMid;//品牌mongoId
	private String mallMid;//商场mongoId
	private String shopName;//店铺名称
	private boolean supportCourierDeliver=true;//true是  false否
	private boolean supportSelfPickup=true;//支持到店自提  true 是    false否
	private Date registerAt;//上架时间
	private Date soldOutAt;//下架时间
	private Integer source;//来源0表示页面添加1表示批量导入2表示app添加的商品
	//private Integer distribution;//配送方式 1表示到店自提2快递3表示支持两种方式
	private Integer freight;//1表示商家承担运费,0表示买家承担运费
	private Integer terminalType;//上架终端：com.rongyi.easy.mcmc.constant.CommodityTerminalType常量定义
	private Integer stockStatus;//0表示统一库存1表示分管库存，现在只有分管库存
	private String reason;//下架原因
	private String mallId;//商场mysql Id
	private String brandName;
	private String shopNum;
	private int brandId;//品牌mysqlId
	private String filialeMid;//分公司id
	private int identity = 5;//-1表示定时任务0集团管理员、1商场管理员、2品牌管理员、3分公司、4店长、5导购6买手（目前没用，暂做保留）
	private Integer processIdentity;   //当前登录人的身份，判断当前登录人的身份以次字段为主，identity不准确，暂时保留
	private String activityType = "0";	//活动状态[闪购1、特卖2、秒杀3、拼单4]
	private Integer purchaseCount; //商品限购数 0为不限购
	private Integer templateId;//邮费模版id
	private Integer sort;
	private String mallName;
	private List<Integer> customCategoryIds;//自定义分类集合;
	private String commodityModelNo;//商品款号
	private List<String> goodsParam;//商品参数
	private Integer activityId;//活动id
	private double activityPrice;//活动价,如果商品没有参与或者,则显示现价
	private Long updateAt;
	private Integer galleryPosition;//1,2,3分别对应橱窗1,2,3
	private boolean inActivity; //是否参加活动
	private Integer shelvesType;//1:立即上架，手动下架,2:定时上下架
	private boolean offerShelves;//是否可下架  true是；false否

	// 礼品id mysql id 兼容老数据
	private String giftId;
	// 礼品编号
	private String sn;
	// 礼品所属id
	private String mappingId;
	// 商品类型(0:商品, 1:礼品)
	private Integer commodityRange = CommodityConstants.CommodityType.COMMODITY;
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
	// 卡券开始时间
	private Date couponStartDate;
	// 卡券过期时间
	private Date couponEndDate;
	// 标签列表
	private List<String> tagIds;
	// 支付方式列表
	private List<String> paymentIds;
	// 商品兑换规则
	private List<GiftPaymentVO> paymentVOs;
	private String platform;
	private Double price;
	private Integer selfTakeDays;

	/**
	 * 是否在积分商城展示（1展示，2不展示）
	 */
	private Integer showIntegralMall;

	private String subheading;  //副标题
	private String commodityDetails; //商品详情
	private boolean ifShowInWechat;//是否在微信端展示，true是，false不是
	private boolean isSpecDeleted=false;//下单页面判断规则是否被删除

	private String groupMid;
	private List<String> locationIds;//商品记录发到集团或者商场或者店铺集合
	private Integer accountType;
	private List<Integer> serviceIds;//微信公众号ids
	private List<String> mallServiceIds;
	private String merchantId;  //商户id
	private Integer merchantType; //商户类型 0:集团 1：商场 4：店铺
	private List<String> categoryNames;
	private String freePostage;  // 0包邮 1不包邮
	private List<String> onServiceIds;
	private List<String> offServiceIds;

	private List<String> skus;
	private String systemNumber;
	private Integer flag;//1表示发布商品，2表示复制新建商品
	private CommodityFunctionParamVO functionParamVO; // 发布、编辑商品时，方法参数详情类

	private Integer isRefund;//是否可以退货，0：不可退货 1：可退货
	private String postageTemplateId;// 运费模版MID
	private PostageTemplateVO postageTemplateVO; // 运费详情

	private Double weight; // 商品重量
	private List<String> operationCategorys;  //运营类目
	private Integer isEditCategory; // 编辑运营类目
	private List<String> operationCategoryFenList;  //商品运营分店类目
	private Integer shopSort = 0; //店铺商品列表排序 0-9 越大越靠前

	private boolean categoryFenUpdate;//商品运营分店是否已经改过;false表示没有,true表示已经改过

	/**
	 * 是否推荐(0:不推荐,1:推荐)
	 */
	private Integer recommend;

	/**
	 * 落地类型(0:默认,1:外部网页,2:小程序)
	 */
	private Integer landingPageType;

	/**
	 * 落地Url地址
	 */
	private String landingPageUrl;

	public Integer getRecommend() {
		return recommend;
	}

	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}

	public boolean isCategoryFenUpdate() {
		return categoryFenUpdate;
	}

	public void setCategoryFenUpdate(boolean categoryFenUpdate) {
		this.categoryFenUpdate = categoryFenUpdate;
	}

	public List<String> getOperationCategoryFenList() {
		return operationCategoryFenList;
	}

	public void setOperationCategoryFenList(List<String> operationCategoryFenList) {
		this.operationCategoryFenList = operationCategoryFenList;
	}

	public Integer getIsEditCategory() {
		return isEditCategory;
	}

	public void setIsEditCategory(Integer isEditCategory) {
		this.isEditCategory = isEditCategory;
	}

	public List<String> getOperationCategorys() {
		return operationCategorys;
	}

	public void setOperationCategorys(List<String> operationCategorys) {
		this.operationCategorys = operationCategorys;
	}

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

	public String getFreePostage() {
		return freePostage;
	}

	public void setFreePostage(String freePostage) {
		this.freePostage = freePostage;
	}

	public Integer getSelfTakeDays() {
		return selfTakeDays;
	}

	public void setSelfTakeDays(Integer selfTakeDays) {
		this.selfTakeDays = selfTakeDays;
	}

	public Integer getFlashSaleId() {
		return flashSaleId;
	}

	public void setFlashSaleId(Integer flashSaleId) {
		this.flashSaleId = flashSaleId;
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
	private Date activityStartTime;
	private Date activityEndTime;

	private String serviceDescription;//售后说明
	private Integer serviceDescriptionId;//售后说明id
	private String serviceDescriptionRemark;   //售后说明备注

	public String getServiceDescriptionRemark() {
		return serviceDescriptionRemark;
	}

	public void setServiceDescriptionRemark(String serviceDescriptionRemark) {
		this.serviceDescriptionRemark = serviceDescriptionRemark;
	}

	public List<String> getCategoryNames() {
		return categoryNames;
	}

	public void setCategoryNames(List<String> categoryNames) {
		this.categoryNames = categoryNames;
	}

	public Integer getMerchantType() {
		return merchantType;
	}

	public void setMerchantType(Integer merchantType) {
		this.merchantType = merchantType;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}


	public String getGroupMid() {
		return groupMid;
	}

	public void setGroupMid(String groupMid) {
		this.groupMid = groupMid;
	}

	public List<String> getLocationIds() {
		return locationIds;
	}

	public void setLocationIds(List<String> locationIds) {
		this.locationIds = locationIds;
	}

	public Integer getAccountType() {
		return accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}

	public List<Integer> getServiceIds() {
		return serviceIds;
	}

	public void setServiceIds(List<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}

	public boolean isOfferShelves() {
		return offerShelves;
	}
	public void setOfferShelves(boolean offerShelves) {
		this.offerShelves = offerShelves;
	}
	public Integer getShelvesType() {
		return shelvesType;
	}
	public void setShelvesType(Integer shelvesType) {
		this.shelvesType = shelvesType;
	}
	public Integer getGalleryPosition() {
		return galleryPosition;
	}
	public void setGalleryPosition(Integer galleryPosition) {
		this.galleryPosition = galleryPosition;
	}
	public Integer getTemplateId() {
		return templateId;
	}
	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}
	public String getActivityType() {
		return activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	public int getCommodityAppStatus() {
		return commodityAppStatus;
	}
	public void setCommodityAppStatus(int commodityAppStatus) {
		this.commodityAppStatus = commodityAppStatus;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getBrandMid() {
		return brandMid;
	}
	public void setBrandMid(String brandMid) {
		this.brandMid = brandMid;
	}
	public String getMallMid() {
		return mallMid;
	}
	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
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
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	public int getCommodityType() {
		return commodityType;
	}
	public void setCommodityType(int commodityType) {
		this.commodityType = commodityType;
	}
	public int getIsSpot() {
		return isSpot;
	}
	public void setIsSpot(int isSpot) {
		this.isSpot = isSpot;
	}
	public String getCommodityOPriceMax() {
		return commodityOPriceMax;
	}
	public void setCommodityOPriceMax(String commodityOPriceMax) {
		this.commodityOPriceMax = commodityOPriceMax;
	}
	public String getCommodityOPriceMin() {
		return commodityOPriceMin;
	}
	public void setCommodityOPriceMin(String commodityOPriceMin) {
		this.commodityOPriceMin = commodityOPriceMin;
	}
	public String getCommodityCPriceMax() {
		return commodityCPriceMax;
	}
	public void setCommodityCPriceMax(String commodityCPriceMax) {
		this.commodityCPriceMax = commodityCPriceMax;
	}
	public String getCommodityCPriceMin() {
		return commodityCPriceMin;
	}
	public void setCommodityCPriceMin(String commodityCPriceMin) {
		this.commodityCPriceMin = commodityCPriceMin;
	}
	public String getCommodityOPOfLCP() {
		return commodityOPOfLCP;
	}
	public void setCommodityOPOfLCP(String commodityOPOfLCP) {
		this.commodityOPOfLCP = commodityOPOfLCP;
	}
	public String getCommodityShopNumber() {
		return commodityShopNumber;
	}
	public void setCommodityShopNumber(String commodityShopNumber) {
		this.commodityShopNumber = commodityShopNumber;
	}
	public Integer getCommodityStatus() {
		return commodityStatus;
	}
	public void setCommodityStatus(Integer commodityStatus) {
		this.commodityStatus = commodityStatus;
	}
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	public String getCommodityCommission() {
		return commodityCommission;
	}
	public void setCommodityCommission(String commodityCommission) {
		this.commodityCommission = commodityCommission;
	}
	public String getCommodityCode() {
		return commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}
	public String getCommodityBarCode() { return commodityBarCode; }
	public void setCommodityBarCode(String commodityBarCode) { this.commodityBarCode = commodityBarCode; }
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public Integer getProcessIdentity() {
		return processIdentity;
	}
	public void setProcessIdentity(Integer processIdentity) {
		this.processIdentity = processIdentity;
	}
	public String getCommodityCategory1() {
		return commodityCategory1;
	}
	public void setCommodityCategory1(String commodityCategory1) {
		this.commodityCategory1 = commodityCategory1;
	}
	public String getCommodityCategory2() {
		return commodityCategory2;
	}
	public void setCommodityCategory2(String commodityCategory2) {
		this.commodityCategory2 = commodityCategory2;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public String getCommodityCategory() {
		return commodityCategory;
	}
	public void setCommodityCategory(String commodityCategory) {
		this.commodityCategory = commodityCategory;
	}

	public List<ObjectId> getCommodityCategoryIds() {
		return commodityCategoryIds;
	}

	public void setCommodityCategoryIds(List<ObjectId> commodityCategoryIds) {
		this.commodityCategoryIds = commodityCategoryIds;
	}

	public String getCommodityDescription() {
		return commodityDescription;
	}
	public void setCommodityDescription(String commodityDescription) {
		this.commodityDescription = commodityDescription;
	}
	public String getCommodityPostage() {
		return commodityPostage;
	}
	public void setCommodityPostage(String commodityPostage) {
		this.commodityPostage = commodityPostage;
	}
	public String getCommodityStock() {
		return commodityStock;
	}
	public void setCommodityStock(String commodityStock) {
		this.commodityStock = commodityStock;
	}
	public String getCommoditySold() {
		return commoditySold;
	}
	public void setCommoditySold(String commoditySold) {
		this.commoditySold = commoditySold;
	}
	public String getCommodityPubDate() {
		return commodityPubDate;
	}
	public void setCommodityPubDate(String commodityPubDate) {
		this.commodityPubDate = commodityPubDate;
	}
	public String getCommodityOriginalPrice() {
		return commodityOriginalPrice;
	}
	public void setCommodityOriginalPrice(String commodityOriginalPrice) {
		this.commodityOriginalPrice = commodityOriginalPrice;
	}
	public String getCommodityCurrentPrice() {
		return commodityCurrentPrice;
	}
	public void setCommodityCurrentPrice(String commodityCurrentPrice) {
		this.commodityCurrentPrice = commodityCurrentPrice;
	}
	public List<String> getCommodityPicList() {
		return commodityPicList;
	}
	public void setCommodityPicList(List<String> commodityPicList) {
		this.commodityPicList = commodityPicList;
	}
	public List<CommoditySpecVO> getCommoditySpecList() {
		return commoditySpecList;
	}
	public void setCommoditySpecList(List<CommoditySpecVO> commoditySpecList) {
		this.commoditySpecList = commoditySpecList;
	}
	public boolean isSupportCourierDeliver() {
		return supportCourierDeliver;
	}
	public void setSupportCourierDeliver(boolean supportCourierDeliver) {
		this.supportCourierDeliver = supportCourierDeliver;
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
	public Integer getSource() {
		return source;
	}
	public void setSource(Integer source) {
		this.source = source;
	}
	public Integer getFreight() {
		return freight;
	}
	public boolean isSupportSelfPickup() {
		return supportSelfPickup;
	}
	public void setSupportSelfPickup(boolean supportSelfPickup) {
		this.supportSelfPickup = supportSelfPickup;
	}
	public void setFreight(Integer freight) {
		this.freight = freight;
	}
	public Integer getTerminalType() {
		return terminalType;
	}
	public void setTerminalType(Integer terminalType) {
		this.terminalType = terminalType;
	}
	public Integer getStockStatus() {
		return stockStatus;
	}
	public void setStockStatus(Integer stockStatus) {
		this.stockStatus = stockStatus;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getShopNum() {
		return shopNum;
	}
	public void setShopNum(String shopNum) {
		this.shopNum = shopNum;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getFilialeMid() {
		return filialeMid;
	}
	public void setFilialeMid(String filialeMid) {
		this.filialeMid = filialeMid;
	}
	public int getIdentity() {
		return identity;
	}
	public void setIdentity(int identity) {
		this.identity = identity;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}
	public String getMallName() {
		return mallName;
	}
	public List<Integer> getCustomCategoryIds() {
		return customCategoryIds;
	}
	public void setCustomCategoryIds(List<Integer> customCategoryIds) {
		this.customCategoryIds = customCategoryIds;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getCommodityCategoryName1() {
		return commodityCategoryName1;
	}
	public void setCommodityCategoryName1(String commodityCategoryName1) {
		this.commodityCategoryName1 = commodityCategoryName1;
	}
	public String getCommodityCategoryName2() {
		return commodityCategoryName2;
	}
	public void setCommodityCategoryName2(String commodityCategoryName2) {
		this.commodityCategoryName2 = commodityCategoryName2;
	}
	public List<String> getGoodsParam() {
		return goodsParam;
	}
	public void setGoodsParam(List<String> goodsParam) {
		this.goodsParam = goodsParam;
	}
	public Integer getPurchaseCount(){
		return purchaseCount;
	}
	public void setPurchaseCount(Integer purchaseCount){
		this.purchaseCount = purchaseCount;
	}
	public String getCommodityModelNo() {
		return commodityModelNo;
	}
	public void setCommodityModelNo(String commodityModelNo) {
		this.commodityModelNo = commodityModelNo;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public double getActivityPrice() {
		return activityPrice;
	}

	public void setActivityPrice(double activityPrice) {
		this.activityPrice = activityPrice;
	}

	public Long getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Long updateAt) {
		this.updateAt = updateAt;
	}

	public boolean isInActivity() {
		return inActivity;
	}

	public void setInActivity(boolean inActivity) {
		this.inActivity = inActivity;
	}

	public List<GiftPaymentVO> getPaymentVOs() {
		return paymentVOs;
	}

	public void setPaymentVOs(List<GiftPaymentVO> paymentVOs) {
		this.paymentVOs = paymentVOs;
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

	public Date getCouponEndDate() {
		return couponEndDate;
	}

	public void setCouponEndDate(Date couponEndDate) {
		this.couponEndDate = couponEndDate;
	}

	public Date getCouponStartDate() {
		return couponStartDate;
	}

	public void setCouponStartDate(Date couponStartDate) {
		this.couponStartDate = couponStartDate;
	}

	public String getSubheading() {
		return subheading;
	}

	public void setSubheading(String subheading) {
		this.subheading = subheading;
	}

	public String getCommodityDetails() {
		return commodityDetails;
	}

	public void setCommodityDetails(String commodityDetails) {
		this.commodityDetails = commodityDetails;
	}

	public boolean isIfShowInWechat() {
        return ifShowInWechat;
    }

    public void setIfShowInWechat(boolean ifShowInWechat) {
        this.ifShowInWechat = ifShowInWechat;
    }

	public boolean isSpecDeleted() {
		return isSpecDeleted;
	}

	public void setSpecDeleted(boolean specDeleted) {
		isSpecDeleted = specDeleted;
	}

	public Integer getServiceDescriptionId() {
		return serviceDescriptionId;
	}

	public void setServiceDescriptionId(Integer serviceDescriptionId) {
		this.serviceDescriptionId = serviceDescriptionId;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
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

	public List<String> getSkus() {
		return skus;
	}

	public void setSkus(List<String> skus) {
		this.skus = skus;
	}

	public String getSystemNumber() {
		return systemNumber;
	}

	public void setSystemNumber(String systemNumber) {
		this.systemNumber = systemNumber;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public CommodityFunctionParamVO getFunctionParamVO() {
		return functionParamVO;
	}

	public void setFunctionParamVO(CommodityFunctionParamVO functionParamVO) {
		this.functionParamVO = functionParamVO;
	}

	public Integer getIsRefund() {
		return isRefund;
	}

	public void setIsRefund(Integer isRefund) {
		this.isRefund = isRefund;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}	public String getPostageTemplateId() {
		return postageTemplateId;
	}

	public void setPostageTemplateId(String postageTemplateId) {
		this.postageTemplateId = postageTemplateId;
	}

	public PostageTemplateVO getPostageTemplateVO() {
		return postageTemplateVO;
	}

	public void setPostageTemplateVO(PostageTemplateVO postageTemplateVO) {
		this.postageTemplateVO = postageTemplateVO;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getShopSort() {
		return shopSort;
	}

	public void setShopSort(Integer shopSort) {
		this.shopSort = shopSort;
	}

	public Integer getShowIntegralMall() {
		return showIntegralMall;
	}

	public void setShowIntegralMall(Integer showIntegralMall) {
		this.showIntegralMall = showIntegralMall;
	}

	/*
	 * 是否在小程序端展示（1展示，0不展示）
	 */
	private Integer showMiniProgram;

	public Integer getShowMiniProgram() {
		return showMiniProgram;
	}

	public void setShowMiniProgram(Integer showMiniProgram) {
		this.showMiniProgram = showMiniProgram;
	}

	public Integer getLandingPageType() {
		return landingPageType;
	}

	public void setLandingPageType(Integer landingPageType) {
		this.landingPageType = landingPageType;
	}

	public String getLandingPageUrl() {
		return landingPageUrl;
	}

	public void setLandingPageUrl(String landingPageUrl) {
		this.landingPageUrl = landingPageUrl;
	}

	public CommodityVO(){

	}
	public CommodityVO(Commodity commodity){
		this.merchantId = commodity.getMerchantId();
		this.commodityType = commodity.getType();//渠道  0商家，1买手
		this.shopId = commodity.getShopId();
		this.shopMid = commodity.getShopMid();//店铺mongoId
		this.shopName = commodity.getShopName();
		this.create_by = commodity.getCreate_by();//创建人
		this.liveId = commodity.getLiveId();//直播id
		this.liveStartTime = commodity.getLiveStartTime();//直播开始时间
		this.liveEndTime = commodity.getLiveEndTime();//直播结束时间
		this.commodityId = commodity.getId().toString();
		this.commodityName = commodity.getName();
		this.commodityCategory = commodity.getCategory();
		this.commodityDescription = commodity.getDescription();
		this.brandMid = commodity.getBrandMid();//品牌mongoId
		this.brandName=commodity.getBrandName();
		this.mallMid = commodity.getMallMid();//商场mongoId
		this.purchaseCount=commodity.getPurchaseCount();
		this.isSpot = commodity.getIsSpot() ? 1 : 0;

		if(commodity.getPostage() != null && !commodity.getPostage().isEmpty()){
			try {
				this.commodityPostage = commodity.getPostage();
			} catch(Exception e){
				this.commodityPostage = "0.0";
			}
		} else {
			this.commodityPostage = "0.0";
		}
		this.commodityStock = String.valueOf(commodity.getStock());
		this.commoditySold = String.valueOf(commodity.getSold());
		this.commodityPubDate = commodity.getCreateAt().toString();
		this.commodityOriginalPrice = commodity.getOriginalPrice();
		this.commodityCurrentPrice = commodity.getCurrentPrice();
		this.commodityPicList = commodity.getPicList();
		this.commodityCode = (commodity.getCode() != null) ? commodity.getCode() : "";
		this.commodityStatus = commodity.getStatus();
		this.commodityShopNumber = "";
		if(commodity.getShopNum() != null){
			this.commodityShopNumber = commodity.getShopNum();
		}
		this.commodityOPriceMax = commodity.getoPriceMax();
		this.commodityOPriceMin = commodity.getoPriceMin();
		this.commodityCPriceMax = commodity.getcPriceMax();
		this.commodityCPriceMin = commodity.getcPriceMin();
		this.commodityOPOfLCP = commodity.getoPriceOfLowestCPrice();
		this.supportCourierDeliver = commodity.isSupportCourierDeliver();
		this.registerAt = commodity.getRegisterAt();
		this.soldOutAt = commodity.getSoldOutAt();
		//立即上架，手动下架的上下架时间只查为30年，其他的为定时上下架
		this.shelvesType = (null == commodity.getShelvesType()) ? 2 : commodity.getShelvesType();

		this.supportSelfPickup = commodity.isSupportSelfPickup();
		// 商品待上架且上架时间大于当前时间，app商品状态为 待上架
		// 商品上架或待上架，且上架时间小于当前时间，且下架时间大于当前时间，app商品状态为 上架
		// 其他 下架
		// 状态 -1：非现货初始化(直播使用） 0下架 1上架 (当前时间在上架时间和下架时间之间)2是删除3待上架4待处理5待审核 6审核失败
		if (this.commodityStatus == 3
				&& (commodity.getRegisterAt() != null && commodity.getRegisterAt().getTime() - new Date().getTime() > 0)) {
			this.commodityAppStatus = 3;
		} else if ((commodityStatus == 1 || commodityStatus == 3)
				&& (commodity.getRegisterAt() != null && commodity.getRegisterAt().getTime() - new Date().getTime() <= 0)
				&& (commodity.getSoldOutAt() != null && commodity.getSoldOutAt().getTime() - new Date().getTime() > 0)) {
			this.commodityAppStatus = 1;
		} else if (commodityAppStatus != 0 && commodityAppStatus != 1 && commodityAppStatus != 3) {
			this.commodityAppStatus = 0;
		} else {
			this.commodityAppStatus = this.commodityStatus;
		}

		//闪购 || 特卖 || 秒杀
		if (commodity.getSaleId() != null) {
			this.activityType = "2";
		} else if (commodity.getFlashSaleId() != null) {
			this.activityType = "1";
		} else if (StringUtils.isNotBlank(commodity.getSecKillSign())) {
			this.activityType = "3";
		} else {
			//其他
			this.activityType = "0";
		}

		// 当前是秒杀商品
		if ("3".equals(this.activityType)) {
			long nowTime = new Date().getTime();
			// 商品处于上架状态
			if (this.commodityAppStatus == 1) {
				if (commodity.getActivityStartTime() != null && commodity.getActivityStartTime().getTime() > nowTime) {
					// 秒杀未开始
					this.commodityAppStatus = 3;
				} else if (commodity.getActivityEndTime() != null && commodity.getActivityEndTime().getTime() <= nowTime) {
					// 秒杀已结束
					this.commodityAppStatus = 4;
				}
			}
		}
		if(null !=commodity.getActivityStartTime() ){
			this.setActivityStartTime(commodity.getActivityStartTime());
		}
		if( null !=commodity.getActivityEndTime()){
			this.setActivityEndTime(commodity.getActivityEndTime());
		}

		this.terminalType = commodity.getTerminalType();
		this.sort = commodity.getSort();//排序
		this.update_by = commodity.getUpdate_by();//修改人
		this.commodityModelNo = commodity.getCommodityModelNo();//商品款号
		this.goodsParam = commodity.getGoodsParam();//商品参数
		this.updateAt=commodity.getUpdateAt().getTime();
		//默认返回非橱窗商品的值设置为0
		this.galleryPosition=commodity.getGalleryPosition()==null || commodity.getGalleryPosition()==0 ?0:MAX_GALLERY_POSITION-commodity.getGalleryPosition();

		this.couponStartDate = commodity.getCouponStartDate();
		this.couponEndDate = commodity.getCouponEndDate();
		this.selfExpireDate = commodity.getSelfExpireDate();
		this.selfTakeDays = commodity.getSelfTakeDays();
		this.commodityRange = commodity.getCommodityRange();
		this.sn = commodity.getSn();
		this.identity = commodity.getIdentity();
		this.subheading=commodity.getSubheading();
		this.commodityDetails=commodity.getCommodityDetails();
		this.setSelfAddressId(commodity.getSelfAddressId());
		this.serviceDescriptionId=commodity.getServiceDescriptionId();
		this.serviceDescription=commodity.getServiceDescription();
		this.serviceDescriptionRemark=commodity.getServiceDescriptionRemark();
		this.onServiceIds = commodity.getOnServiceIds();
		this.setIfShowInWechat(isShowInWechat());

		this.source = commodity.getSource();
		this.systemNumber=commodity.getSystemNumber();
		this.isRefund = commodity.getIsRefund() == null ? 0 : commodity.getIsRefund();//是否可退货
		this.reason=commodity.getReason();
		this.setOperationCategorys(commodity.getOperationCategorys());
		this.postageTemplateId = commodity.getPostageTemplateId();
		this.weight = commodity.getWeight();
		this.shopSort = commodity.getShopSort();
		this.showMiniProgram=commodity.getShowMiniProgram();
		this.landingPageType=commodity.getLandingPageType();
		this.landingPageUrl=commodity.getLandingPageUrl();
	}

	private boolean isShowInWechat() {
		if(CollectionUtils.isEmpty(getOnServiceIds())) {
			return false;
		}

		List<String> onIds = getOnServiceIds();
		onIds.remove(Constants.ServiceId.APP_RONG_YI_GUANG);
		onIds.remove(Constants.ServiceId.TERMINAL_SCREEN);
		onIds.remove(Constants.ServiceId.MINI_PROGRAM);

		return onIds.size() > 0;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void setCommodityVOFromTotalCommodity(CommodityParam param, SessionUserInfo userInfo){
		this.setCommodityRange(CommodityConstants.CommodityType.COMMODITY);
		this.setCommodityName(param.getName());
		this.setCommodityCategory(param.getCategory());
		this.setCommodityDescription(param.getDescription());
		this.setCommodityPostage(param.getPostage() != null ? param.getPostage().toString() : "0");
		this.setCommodityCode(param.getCode());
		this.setCommodityPicList(param.getPicList());

		this.setSupportCourierDeliver(true);
		this.setSupportSelfPickup(true);
		switch(param.getDistribution()){
			//配送方式 1表示到店自提2快递3表示支持两种方式
			//supportCourierDeliver支持快递发货字段  true 是    false否
			// supportSelfPickup支持到店自提  true 是    false否
			case 2:this.setSupportSelfPickup(false);break;
			case 1:this.setSupportCourierDeliver(false);break;
			case 0:this.setSupportCourierDeliver(false);this.setSupportSelfPickup(false);
		}

		this.setFreight(param.getFreight());
		this.setTerminalType(param.getTerminalType());

		if(param.getStatus() != null && param.getStatus() == 5) {// 立即上架
			this.setRegisterAt(DateTool.addTime(new Date(), 3));
			this.setSoldOutAt(DateTool.addYears(this.getRegisterAt(), 1));
		} else {
			this.setRegisterAt(param.getRegisterAt());
			this.setSoldOutAt(param.getSoldOutAt());
		}
		//商家后台修改商品不能改变来源
		this.setSource(param.getSource());
		this.setStockStatus(param.getStockStatus());
		this.setReason(param.getReason());

		//商品状态待上架通过定时任务刷新状态给app使用
		this.setCommodityStatus(CommodityDataStatus.STATUS_COMMODITY_SHELVE_WAITING);
		this.setCommodityCurrentPrice(param.getCurrentPrice());
		this.setCommodityOriginalPrice(param.getOriginalPrice());
		this.setPurchaseCount(param.getPurchaseCount());
		this.setCustomCategoryIds(param.getCustomCategoryIds());
		this.setTemplateId(param.getTemplateId());

		this.setMallServiceIds(param.getServiceIds());

		if(param.getIsEditCategory() == null) {
			if(param.getTerminalType() == 1 ||
					param.getTerminalType() == 3 ||
					param.getTerminalType() == 5 ||
					param.getTerminalType() == 7) {
				List<String> onServiceIdsList=new ArrayList();
				onServiceIdsList.add(Constants.ServiceId.APP_RONG_YI_GUANG);
				this.setOnServiceIds(onServiceIdsList);
			}
			/*if(param.getShowMiniProgram()!=null&&param.getShowMiniProgram().intValue()==1){
				List<String> onServiceIdsList=new ArrayList();
				if(this.getOnServiceIds()!=null&&this.getOnServiceIds().size()>0){
					onServiceIdsList=this.getOnServiceIds();
				}
				onServiceIdsList.add(Constants.ServiceId.MINI_PROGRAM);
				this.setOnServiceIds(onServiceIdsList);
			}*/
		}

		this.setSubheading(param.getSubheading());
		this.setCommodityDetails(param.getCommodityDetails());

		//默认值
		this.setBrandId(-1);
		this.setShopId("-1");
		this.setMallId("-1");

		this.setIdentity(userInfo.getIdentity());//增加商品身份信息
		this.setProcessIdentity(userInfo.getIdentity());
		this.setMerchantId(userInfo.getBindingMid());
		if(StringUtils.isBlank(param.getId())){
			this.setCreate_by(userInfo.getId().toString());//新增的时候设置创建者的id
		} else {
			if(null != param.getCreateBy()) {
				this.setCreate_by(param.getCreateBy() + "");
			}
			this.setUpdate_by(userInfo.getId().toString());
		}
		this.setShelvesType(param.getShelvesType());

		this.setBrandMid(param.getBrandMid());
		this.setBrandName(param.getBrandName());
		this.setCommodityModelNo(param.getCommodityModelNo());
		this.setServiceDescriptionId(param.getServiceDescriptionId());
		this.setServiceDescription(param.getServiceDescription());
		this.setServiceDescriptionRemark(param.getServiceDescriptionRemark());
		this.setGoodsParam(Arrays.asList(param.getGoodsParam()));
		this.setIsRefund(param.getIsRefund());//是否可退货
		this.setPostageTemplateId(param.getPostageTemplateId());
		this.setWeight(param.getWeight());
		this.setIsEditCategory(param.getIsEditCategory());
		this.setShowMiniProgram(param.getShowMiniProgram());
		this.setLandingPageType(param.getLandingPageType());
		this.setLandingPageUrl(param.getLandingPageUrl());
	}

	public void setHaiXinCommodityVOFromTotalCommodity(CommodityParam param, SessionUserInfo userInfo){
		this.setCommodityRange(CommodityConstants.CommodityType.HAIXIN);
		this.setCommodityName(param.getName());
		this.setCommodityCategory(param.getCategory());
		this.setCommodityCategoryIds(param.getCategoryIds());
		this.setCommodityDescription(param.getDescription());
		this.setCommodityPostage(param.getPostage() != null ? param.getPostage().toString() : "0");
		this.setCommodityCode(param.getCode());
		this.setCommodityBarCode(param.getBarCode());
		this.setCommodityPicList(param.getPicList());
		this.setSupportCourierDeliver(true);
		this.setSupportSelfPickup(true);
		if (null != param.getDistribution()) {
			switch(param.getDistribution()){
				//配送方式 1表示到店自提2快递3表示支持两种方式
				//supportCourierDeliver支持快递发货字段  true 是    false否
				// supportSelfPickup支持到店自提  true 是    false否
				case 2:this.setSupportSelfPickup(false);break;
				case 1:this.setSupportCourierDeliver(false);break;
				case 0:this.setSupportCourierDeliver(false);this.setSupportSelfPickup(false);
			}
		}
		this.setFreight(param.getFreight());

		if(StringUtils.isBlank(param.getId())) {
			this.setTerminalType(CommodityTerminalType.TERMINAL_TYPE_4);
			this.setCreate_by(null == userInfo ? null : userInfo.getId().toString());//新增的时候设置创建者的id
			this.setCommodityStatus(CommodityDataStatus.STATUS_COMMODITY_CHECK_PENDING);//上架状态:待审核

			// 新增：海信导入
			if (null != param.getSource() && 1 == param.getSource()) {
				this.setCommodityStatus(CommodityDataStatus.STATUS_COMMODITY_PENDING);//上架状态:待处理
				this.setCreate_by("-1");
			}
		}  else {
			this.setCreate_by(null != param.getCreateBy() ? param.getCreateBy().toString() : "-1");
			this.setTerminalType(param.getTerminalType());
			this.setRegisterAt(param.getRegisterAt());
			this.setSoldOutAt(param.getSoldOutAt());
			this.setCommodityStatus(param.getStatus());
			this.setUpdate_by(null == userInfo ? null : userInfo.getId().toString());
		}

		//商家后台修改商品不能改变来源（修改商品，source在service层取数据原source值）
		this.setSource(param.getSource());
		this.setStockStatus(param.getStockStatus());
		this.setCommodityCurrentPrice(param.getCurrentPrice().toString());
		this.setCommodityOriginalPrice(param.getOriginalPrice().toString());
		this.setPurchaseCount(param.getPurchaseCount());
		this.setCustomCategoryIds(param.getCustomCategoryIds());
		this.setTemplateId(param.getTemplateId());
		this.setCommodityDetails(param.getCommodityDetails());

		// TODO 服务号在别处获取

		//默认值
		this.setBrandId(-1);
		this.setShopId("-1");
		this.setMallId("-1");

		this.setProcessIdentity(null == userInfo ? null : userInfo.getIdentity());

		// 海信导入的数据，userinfo为空
		this.setMerchantId(null == userInfo ? param.getMerchantId() : userInfo.getBindingMid());

		this.setBrandMid(param.getBrandMid());
		this.setBrandName(param.getBrandName());

		this.setServiceDescriptionId(param.getServiceDescriptionId());
		this.setServiceDescription(param.getServiceDescription());
		this.setServiceDescriptionRemark(param.getServiceDescriptionRemark());
		this.setGoodsParam(Arrays.asList(param.getGoodsParam()));
		this.setIsRefund(param.getIsRefund());//是否可退货
	}

}