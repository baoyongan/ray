package com.rongyi.easy.newcoupon.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/12/28
 */
@Setter
@Getter
@ToString(callSuper = true)
public class CouponCodeRepeatVO extends BaseVO {

    /** 券码 */
    private String code;
    /** 是否是第三方券码；0：否；1：是 */
    private Integer third;
    /** 第三方券码 */
    private String othersCode;
    /** 版本号 */
    private String version;
    /**
     * 失败信息
     */
    private String msg;
}
