package com.rongyi.entity;

import lombok.Data;

@Data
public class RoleAuthority {
    private Integer id;

    private Long roleId;

    private Integer authorityId;
    
    private String authorityName;
    
}