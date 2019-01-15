package com.rongyi.easy.bsoms.entity;

import java.util.Date;

/**
 * 导购认证信息
 * @author sj
 *
 */
public class CertifiedInfo {
	private Integer id;
	private Integer userId;        //关联用户ID
	private String callName = "";      //称呼
	private Integer proId = 0;       //省ID
	private Integer cityId = 0;       //市ID
	private Integer areaId = 0;       //区ID
	private String contactPhone ="";  //联系电话
	private String resume;      //自我简介
	private Integer isDeleted;    //是否已删除  0正常 1已删除
	private Date createAt;
	private Date updateAt;
	private String faceImg;    //身份证正面照 
	private String backImg;   //身份证背面照 
	private String workImg;    //工作证照
	private String otherImg;   //其它照片
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getCallName() {
		return callName;
	}
	public void setCallName(String callName) {
		this.callName = callName;
	}
	public Integer getProId() {
		return proId;
	}
	public void setProId(Integer proId) {
		this.proId = proId;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public Integer getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public String getFaceImg() {
		return faceImg;
	}
	public void setFaceImg(String faceImg) {
		this.faceImg = faceImg;
	}
	public String getBackImg() {
		return backImg;
	}
	public void setBackImg(String backImg) {
		this.backImg = backImg;
	}
	public String getWorkImg() {
		return workImg;
	}
	public void setWorkImg(String workImg) {
		this.workImg = workImg;
	}
	public String getOtherImg() {
		return otherImg;
	}
	public void setOtherImg(String otherImg) {
		this.otherImg = otherImg;
	}
}