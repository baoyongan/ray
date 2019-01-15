package com.rongyi.easy.rmmm.param.user;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;

public class UserShareCodeParam extends BaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userId;
	private Integer type;//1容易逛用户   2摩店用户
	private String openId;//H5传过来的openId
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	
}
