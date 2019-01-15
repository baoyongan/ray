package com.rongyi.easy.bdata.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户自定义分类
 * 
 * @author rongyi
 *
 */
public class CustomCategoryVO implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;
	/**
	 * id
	 */
	private String id;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 商场id
	 */
	private String mallId;
	/**
	 * 父id
	 */
	private String parentId;
	/**
	 * 位置
	 */
	private int position;
	/**
	 * 层级
	 */
	private int level;

	/**
	 * 原始图片
	 */
	private String icon;

	/**
	 * 背景图片
	 */
	private String backgroundPicture;
	/**
	 * 点击后点击图片
	 */
	private String clickBackgroundPicture;
	/**
	 * 有效状态
	 */
	private int valid;
	/**
	 * 分类id列表
	 */
	private List<String> categorysId;//品牌分类id
	private List<CustomCategoryVO>  childCustomCategory;

	/**
	 * 创建时间
	 */
	private Date createdAt;
	/**
	 * 更新时间
	 */
	private Date updatedAt;
	/**
	 * 创建人
	 */
	private int createdBy;
	/**
	 * 更新人
	 */
	private int updatedBy;

    /**
     * 自定义分类下关联的店铺数
     */
	private Long shopNum;

	

	/**
	 * 英文名
	 */
	private String alias;

	public String getClickBackgroundPicture() {
		return clickBackgroundPicture;
	}

	public void setClickBackgroundPicture(String clickBackgroundPicture) {
		this.clickBackgroundPicture = clickBackgroundPicture;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getBackgroundPicture() {
		return backgroundPicture;
	}

	public void setBackgroundPicture(String backgroundPicture) {
		this.backgroundPicture = backgroundPicture;
	}

	public List<CustomCategoryVO> getChildCustomCategory() {
		return childCustomCategory;
	}

	public void setChildCustomCategory(List<CustomCategoryVO> childCustomCategory) {
		this.childCustomCategory = childCustomCategory;
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

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

	public List<String> getCategorysId() {
		return categorysId;
	}

	public void setCategorysId(List<String> categorysId) {
		this.categorysId = categorysId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Long getShopNum() {
		return shopNum;
	}

	public void setShopNum(Long shopNum) {
		this.shopNum = shopNum;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

}