package com.rongyi.core.enumerate;

import com.rongyi.core.constant.IErrorCode;

/**
 * Description:卡券 错误码
 * 1 表示透传错误码 02 营销中心 13 消息中心  10213XX
 *
 * DATE: 2016/3/10 11:23
 * Package:com.rongyi.core.enumerate
 * Project:easy-market
 * @author yb
 */
public enum CodeCenterEnum implements IErrorCode {
    SUCCESS(0, "正常"),
    ERROR_SYSTEM(1021301, "系统故障"),
    ERROR_PARAM(1021302, "必要参数不合法或无效"),
    ERROR_INVALID_ACTIVITY_ID(1021303, "activityId不合法或无效"),
    ERROR_INVALID_LENGTH(1021304, "length不合法或无效"),
    ERROR_INVALID_TYPE(1021304, "type不合法或无效"),
    ERROR_INVALID_CODE(1021305, "抱歉，您输入的券码异常，请确认后重新输入"),
    ERROR_INVALID_NAME(1021308, "推广码名称已存在"),
    ERROR_INVALID_MALLID(1021306, "mallId不合法或无效"),
    ERROR_INVALID_COUNT(1021307, "count不合法或无效"),
    ERROR_UNLOGIN(1021309, "请重新登录！"),
    ERROR_INVALID_IDENTITY(1021310, "只有商场才能验证礼品码！"),
//    ERROR_VALIDCODE_ERROR_MALL(1021320, "该商场下无法验证该券！"),
    ERROR_VALIDCODE_ERROR_MALL(1021320, "抱歉，您输入的券码异常，请确认后重新输入！"),
//    ERROR_VALIDCODE_ERROR_SHOP(1021321, "该店铺下无法验证该券！"),
    ERROR_VALIDCODE_ERROR_SHOP(1021321, "抱歉，您输入的券码异常，请确认后重新输入！"),
    ERROR_VALIDCODE_GENERAL_IDENTITY(1021322, "抱歉，您输入的券码异常，请确认后重新输入！"),
    ERROR_VALIDCODE_GENERAL_MALLID(1021323, "无法获取mallId！"),
    ERROR_VALIDCODE_UNGENERAL_IDENTITY(1021324, "抱歉，您输入的券码异常，请确认后重新输入！"),
    ERROR_VALIDCODE_UNGENERAL_SHOPID(1021325, "抱歉，您输入的券码异常，请确认后重新输入！"),
    ERROR_VALIDCODE_INVALID_COUPON(1021326, "抱歉，您输入的券码异常，请确认后重新输入！"),
    ERROR_VALIDCODE_INVALID_COUPONCODE(1021327, "抱歉，您输入的券码异常，请确认后重新输入！"),
    ERROR_VALIDCODE_INVALID_COUPONTYPE(1021328, "无法验证该类型的券！"),
    ERROR_VALIDCODE_INVALID_USERCOUPON(1021329, "该券还未被领取，无法验证！"),
    ERROR_VALIDCODE_INVALID_UNEXIST_COUPON(1021330, "抱歉，您输入的券码异常，请确认后重新输入！"),
    ERROR_VALIDCODE_INVALID_THRID_COUPON(1021331, "抱歉，您输入的券码异常，请确认后重新输入！"),
    ERROR_VALIDCODE_INVALID_MODE(1021332, "抱歉，您输入的券码异常，请确认后重新输入"),
    ERROR_VALIDCODE_TYPE(1021333, "type 不合法或者无效！"),
    ERROR_VALIDCODE_FALIURE(1021334, "验码失败！"),
    ERROR_VALIDCODE_TIMEOUT(1021335, "调用PHP接口超时异常！"),
    ERROR_VALIDCODE_MUTEX(1021336, "同一类型码同一渠道同一时间段不能重复"),
    ERROR_VALIDCODE_REASON(1021337, "审核失败或作废理由为必填项"),
    ERROR_VALID_OUTCOUPON_COUNT(1021338, "超出验证数量"),
    ERROR_HANNELS_AUTHRITY(1021339,"无相应操作权限"),
    ERROR_HANNELS_NULL_CODE(1021340,"促销码为空！"),
    ERROR_HANNELS_ERROR_CODE(1021341,"促销码不合法！"),
    ERROR_HANNELS_USED_CODE(1021342,"推广码已经被使用！"),
    ERROR_HANNELS_DELETED_CODE(1021343,"推广码已经作废！"),
    ERROR_HANNELS_USE_LIMIT(1021344,"超过领取次数！"),
    ERROR_VALID_FALIURE(1021345,"验码失败！"),
    ERROR_DATE_TYPE(1021345,"日期类型参数dateType 不对！"),
    ERROR_CHANNEL_TYPE(1021350,"type 不能为空！"),
    ERROR_CHANNEL_THIRD(1021351,"thirdChannel 参数不能为空或有误"),
    ERROR_NOT_EXIST_USER(1021352,"不存在该用户，请重新输入手机号和身份"),
    ERROR_VALIDRECORD_CREATE(1021353,"创建验券记录异常"),
    ERROR_CHECK_USERID(1021354,"核销人ID不能为空！"),
    ERROR_NULL_CODE(1021356,"券码不能为空！"),


    JIADELI_CODE_REPET(1000001, "请注意，本券已使用,已被店铺营业员成功核销"),
    JIADELI_CODE_INVALIDSTATUS(1000002, "对不起，您输入的券码状态异常，请核对卡券状态"),
    JIADELI_CODE_INVALID(1000003, "对不起，您输入的券码有误，请重新输入"),
    JIADELI_CODE_NOBELONG(1000004, "对不起，您的券码非本店代金券"),
    JIADELI_CODE_INVALIDUSETIME(1000005, "对不起，此券还未生效，无法验证"),
    JIADELI_CODE_USELIMIT(1000006 , "对不起，您使用的券超出每日限制数量，明天再来吧~"),
    JIADELI_CODE_NULL(1000007, "券码为空"),
    JIADELI_ERROR_PARAM(1000008, "参数不完整"),
    JIADELI_ERROR_ACCOUNT(1000009, "未找到家得利账号信息"),
    JIADELI_ERROR_CONFIG(1000010, "未找到配置信息"),
    JIADELI_ERROR_SYSTEM(1000999, "服务异常"),
    JIADELI_ERROR_CORRECTCAUTH(1000011, "无冲正权限,不可冲正"),
    JIADELI_ERROR_URL(1000012, "地址错误"),
    ERROR_COUPON_TYPE(1021353,"礼品券类型不对！！！"),
    ERROR_TRADE_RETURN(1021354,"查询交易信息失败！！！"),
    SHANDE_ERROR_ACCOUNT(1000011, "未找到杉德账号信息"),
    
    //万达BO验券错误码
    ERROR_USERD(1000001, "卡券已使用，重复验券"),
    ERROR_UNSTATUS(1000002, "退款中、已退款、已过期"),
    ERROR_CODE(1000003, "输入券码有误"),
    ERROR_SHOPID(1000004, "非本店铺代金券券码"),
    ERROR_UNSTART(1000005, "券未到使用时间"),
    ERROR_LIMIT_USERD(1000006, "卡券每日限用N张"),
    ERROR_BLANK(1000007, "券码为空"),
    ERROR_PARAMS(1000008, "参数不完整"),
    ERROR_EXCEPTION(4003, "非法请求"),
    ERROR_UNEXIST(4004, "券码不存在"),
    ERROR_EXPRIED(4005, "券过期"),

    //冲正
    ERROR_REVERSE_UNVALID(1021361,"此券码未核销过！"),
    ERROR_REVERSE_FAILD(1021360,"冲正失败！"),
    ERROR_REVERSE_IDENTITY(1021362,"对不起，只有商场才能冲正！"),
    ERROR_REVERSE_MALLID(1021363,"对不起，该商场无法冲正此券！"),
    ERROR_REVERSE_SHOPID(1021364,"shopId字段有误！"),
    ;

    @Override
    public int getErrorNo() {
        return code;
    }

    @Override
    public String getErrorMessage() {
        return message;
    }

    private int code;
    private String message;

     CodeCenterEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getActionCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getErrorCode() {
        return String.valueOf(this.code);
    }

    public String getErrorMsg() {
        return this.message;
    }
}