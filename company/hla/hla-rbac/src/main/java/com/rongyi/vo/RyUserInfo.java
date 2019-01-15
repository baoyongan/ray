package com.rongyi.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class RyUserInfo implements Serializable{
	private static final long serialVersionUID = -1116795683637742868L;

	private Integer id;

    private String username;

    private String password;

    private String name;

    private String nickname;

    private String phone;

    private String memo;

    private Byte status;   //1启用 2停用

    private Date createAt;

    private Date updateAt;

    private String createBy;

    private String updateBy;
    
    private String createName;
    
    private String updateName;
    
    private String reason;
    
    private Date disableAt;

    private List<Integer> roleIds;

   
}