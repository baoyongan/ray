package com.rongyi.easy.malllife.vo.h5;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.malllife.vo.CommentsVO;
import com.rongyi.easy.malllife.vo.MainCategoriesVO;
import com.rongyi.easy.malllife.vo.ShopCategoryVO;
/**
 * 商场分享详情
 * @author user
 *
 */
public class MallDetailVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mallId;//商场mongoId
	private String mallName;//商场名称
	private String mallLogo;//商场icon
	private String rankAvg;//商场评分
	private String address;//商场地址
	private List<MainCategoriesVO> categories;
	private String telephone;//电话
	private List<String> mobile;//通信信息
	private String transportInfo;//交通信息
	private String businessHours;//营业时间
	private Double coord_x;//坐标
	private Double coord_y;//坐标
	private String parkingInfo;//停车场收费信息
	private String description;//商场描述
	private Integer collectionNum;//收藏数量
	private Integer shopCount;//商场下的店铺数量
	private String appearancePic;//商场底图
	private List<CommentsVO> commentList;//评论列表
	private Integer commentCount;//评论数量
	private List<CouponVO> coupons;//优惠信息
	private List<CommodityShareVO> commodityList;//商品列表
	private Integer commodityCount;//商品数量
	private List<ShopCategoryVO> shopCategories;//入驻店铺列表
	private boolean hasWonderFulAct; //精彩活动
    private boolean hasDiscountAct; //优惠资讯
    private boolean hasRaiders;//潮人攻略
    private boolean hasSpecialSale;//是否关联特卖
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getMallLogo() {
		return mallLogo;
	}
	public void setMallLogo(String mallLogo) {
		this.mallLogo = mallLogo;
	}
	public String getRankAvg() {
		return rankAvg;
	}
	public void setRankAvg(String rankAvg) {
		this.rankAvg = rankAvg;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<MainCategoriesVO> getCategories() {
		return categories;
	}
	public void setCategories(List<MainCategoriesVO> categories) {
		this.categories = categories;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public List<String> getMobile() {
		return mobile;
	}
	public void setMobile(List<String> mobile) {
		this.mobile = mobile;
	}
	public String getTransportInfo() {
		return transportInfo;
	}
	public void setTransportInfo(String transportInfo) {
		this.transportInfo = transportInfo;
	}
	public String getBusinessHours() {
		return businessHours;
	}
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}
	public Double getCoord_x() {
		return coord_x;
	}
	public void setCoord_x(Double coord_x) {
		this.coord_x = coord_x;
	}
	public Double getCoord_y() {
		return coord_y;
	}
	public void setCoord_y(Double coord_y) {
		this.coord_y = coord_y;
	}
	public String getParkingInfo() {
		return parkingInfo;
	}
	public void setParkingInfo(String parkingInfo) {
		this.parkingInfo = parkingInfo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getCollectionNum() {
		return collectionNum;
	}
	public void setCollectionNum(Integer collectionNum) {
		this.collectionNum = collectionNum;
	}
	public Integer getShopCount() {
		return shopCount;
	}
	public void setShopCount(Integer shopCount) {
		this.shopCount = shopCount;
	}
	public String getAppearancePic() {
		return appearancePic;
	}
	public void setAppearancePic(String appearancePic) {
		this.appearancePic = appearancePic;
	}
	public List<CommentsVO> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<CommentsVO> commentList) {
		this.commentList = commentList;
	}
	public List<CouponVO> getCoupons() {
		return coupons;
	}
	public void setCoupons(List<CouponVO> coupons) {
		this.coupons = coupons;
	}
	public List<CommodityShareVO> getCommodityList() {
		return commodityList;
	}
	public void setCommodityList(List<CommodityShareVO> commodityList) {
		this.commodityList = commodityList;
	}
	public List<ShopCategoryVO> getShopCategories() {
		return shopCategories;
	}
	public void setShopCategories(List<ShopCategoryVO> shopCategories) {
		this.shopCategories = shopCategories;
	}
	public boolean isHasWonderFulAct() {
		return hasWonderFulAct;
	}
	public void setHasWonderFulAct(boolean hasWonderFulAct) {
		this.hasWonderFulAct = hasWonderFulAct;
	}
	public boolean isHasDiscountAct() {
		return hasDiscountAct;
	}
	public void setHasDiscountAct(boolean hasDiscountAct) {
		this.hasDiscountAct = hasDiscountAct;
	}
	public boolean isHasRaiders() {
		return hasRaiders;
	}
	public void setHasRaiders(boolean hasRaiders) {
		this.hasRaiders = hasRaiders;
	}
	public Integer getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}
	public Integer getCommodityCount() {
		return commodityCount;
	}
	public void setCommodityCount(Integer commodityCount) {
		this.commodityCount = commodityCount;
	}
	public boolean isHasSpecialSale() {
		return hasSpecialSale;
	}
	public void setHasSpecialSale(boolean hasSpecialSale) {
		this.hasSpecialSale = hasSpecialSale;
	}
	@Override
	public String toString() {
		return "MallDetailVO [mallId=" + mallId + ", mallName=" + mallName
				+ ", mallLogo=" + mallLogo + ", rankAvg=" + rankAvg
				+ ", address=" + address + ", categories=" + categories
				+ ", telephone=" + telephone + ", mobile=" + mobile
				+ ", transportInfo=" + transportInfo + ", businessHours="
				+ businessHours + ", coord_x=" + coord_x + ", coord_y="
				+ coord_y + ", parkingInfo=" + parkingInfo + ", description="
				+ description + ", collectionNum=" + collectionNum
				+ ", shopCount=" + shopCount + ", appearancePic="
				+ appearancePic + ", commentList=" + commentList
				+ ", commentCount=" + commentCount + ", coupons=" + coupons
				+ ", commodityList=" + commodityList + ", commodityCount="
				+ commodityCount + ", shopCategories=" + shopCategories
				+ ", hasWonderFulAct=" + hasWonderFulAct + ", hasDiscountAct="
				+ hasDiscountAct + ", hasRaiders=" + hasRaiders
				+ ", hasSpecialSale=" + hasSpecialSale + "]";
	}
	
}