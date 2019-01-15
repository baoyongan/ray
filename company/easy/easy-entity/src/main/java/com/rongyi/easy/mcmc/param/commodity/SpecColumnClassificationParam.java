package com.rongyi.easy.mcmc.param.commodity;

import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;

/**
 * 大运营新建商品规格参数
 * @author user
 *
 */
public class SpecColumnClassificationParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String color;//颜色规格项对应的色系
	private String name;//规格类名
	private String colorType;// 1:标准色系，2：特殊色系
	private Integer position;//从1开始
	private List<SpecColumnClassificationParam> specColumnClassificationParamList;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColorType() {
		return colorType;
	}
	public void setColorType(String colorType) {
		this.colorType = colorType;
	}
	public List<SpecColumnClassificationParam> getSpecColumnClassificationParamList() {
		return specColumnClassificationParamList;
	}
	public void setSpecColumnClassificationParamList(
			List<SpecColumnClassificationParam> specColumnClassificationParamList) {
		this.specColumnClassificationParamList = specColumnClassificationParamList;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "SpecColumnClassificationParam [id=" + id + ", color=" + color
				+ ", name=" + name + ", colorType=" + colorType + ", position="
				+ position + ", specColumnClassificationParamList="
				+ specColumnClassificationParamList + "]";
	}
	
}