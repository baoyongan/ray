package com.rongyi.easy.terminal.member.param;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MallMemberSignConfigQueryParam implements Serializable {


	private String mallId;
	
private String mac;
	
	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	@Override
	public String toString() {
		return "MallMemberSignConfigQueryParam [mallId=" + mallId + ", mac=" + mac + "]";
	}


	


	
	

	
}