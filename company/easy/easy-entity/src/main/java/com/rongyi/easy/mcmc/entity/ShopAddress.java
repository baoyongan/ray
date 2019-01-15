package com.rongyi.easy.mcmc.entity;

import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;

/**
 * 店铺地址类
 * @author xiaobo
 *
 */
public class ShopAddress implements Serializable{	
	private static final long serialVersionUID = 1L;
	/**
	 * mongo id
	 */
	 private String id;
	 /**
	  * 名称
	  */
	 private String name;
	 /**
	  * 类型 0 商场 ，1街边店
	  */
	 private int type;
	 /**
	  * 坐标
	  */
	 private List<Double> location;
	 
	 /**
	  * 分类id
	  */
	 private List<ObjectId> categoryIds;
	 
	 /**
	  * 区域id列表
	  */
	 private List<ObjectId> zoneIds;
	 
	 /**
	  * 商品数量
	  */
	 private long count;
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public List<Double> getLocation() {
		return location;
	}
	public void setLocation(List<Double> location) {
		this.location = location;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public List<ObjectId> getCategoryIds() {
		return categoryIds;
	}
	public void setCategoryIds(List<ObjectId> categoryIds) {
		this.categoryIds = categoryIds;
	}
	public List<ObjectId> getZoneIds() {
		return zoneIds;
	}
	public void setZoneIds(List<ObjectId> zoneIds) {
		this.zoneIds = zoneIds;
	}
	
	
	
}
