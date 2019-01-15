package com.rongyi.rss.code;


import com.rongyi.core.bean.ResponseVO;
import com.rongyi.core.framework.exception.CodeServiceException;
import com.rongyi.easy.bsoms.entity.SessionUserInfo;
import com.rongyi.easy.code.*;
import com.rongyi.easy.coupon.param.CouponReversalParam;
import com.rongyi.easy.coupon.vo.merchant.StatisticsCountVO;
import com.rongyi.easy.tradecenter.param.BizzValidHistoryParam;
import com.rongyi.easy.tradecenter.vo.BizzValidHistoryVO;
import net.sf.json.JSONObject;

import java.util.Map;

/**
 * Description: 后台验证相关接口
 * Author: 袁波
 * DATE: 2016/5/25 19:46
 * Package:com.rongyi.rss.code
 * Project:easy-market
 */
public interface ValidCodeService {

    /**
     * 验码之前查询码的信息
     * @param couponCode
     * @param shopId
     * @param mallId
     * @param identity
     * @return
     */
     ValidCouponVO validSearchCoupon(String couponCode, String shopId, String mallId, Integer identity) throws Exception;


     /**
     * 冲正查询
     * @param couponReversalParam
     * @return
     */
     ValidCouponVO reverseQuery(CouponReversalParam couponReversalParam) throws Exception;


    /**
     * 查询礼品码的信息
     * @param giftCode
     * @param mallId
     */
     ValidCouponVO validSearchGift(String giftCode, String mallId) throws CodeServiceException;


    /**
     * 验证券码
     * @param code
     * @param sessionUserInfo
     * @param platform 验证平台 。0：商家平台；1：摩店；2：轻应用
     * @return
     */
     WebValidVO validCouponCode(String code,SessionUserInfo sessionUserInfo,byte platform,int count) throws CodeServiceException;

    /**
     * 验证礼品码
     * @param code
     * @param sessionUserInfo
     * @param platform 验证平台 。0：商家平台；1：摩店；2：轻应用
     * @return
     */
     boolean validGiftCode(String code, SessionUserInfo sessionUserInfo,byte platform) ;

    /**
     * 验证礼品码
     * @param code
     * @param sessionUserInfo
     * @param isSuperShop 是否是超级店长
     * @param platform 验证平台 。0：商家平台；1：摩店；2：轻应用
     * @return
     */
     WebValidVO validGiftCode(String code, SessionUserInfo sessionUserInfo,Boolean isSuperShop,byte platform) ;



    /**
     * 验证礼品码
     * @param code
     * @param platform 验证平台 。0：商家平台；1：摩店；2：轻应用
     * @return
     */
     boolean validGiftCode(String code, String mallId,String shopId,String validUser,Integer userId,String identity,byte platform) throws CodeServiceException;

    /**
     * 统计各个类型的总验码数量和当天验码数
     * @param param
     * @param sessionUserInfo
     * @return
     */
     StatisticsValidCountVO statisticsValidCount(BizzValidHistoryParam param,SessionUserInfo sessionUserInfo);


    /**
     * 摩店 统计礼品券验证记录接口
     * @param param
     * @param mallId
     * @param shopId
     * @return
     */
     int giftCount(BizzValidHistoryParam param, String mallId, String shopId);

    /**
     * 获取礼品验证列表
     * @param param
     * @param sessionUserInfo
     * @return
     */
     BizzValidHistoryVO queryGiftValidList(BizzValidHistoryParam param, SessionUserInfo sessionUserInfo);

    /**
     * 获取礼品验证列表
     * @param param
     * @param mallId
     * @param shopId
     * @return
     */
     BizzValidHistoryVO queryGiftValidList(BizzValidHistoryParam param, String mallId, String shopId);

    /**
     * 获取活动奖品验证记录
     * @param param
     * @param sessionUserInfo
     * @return
     */
    BizzValidHistoryVO queryEventGiftValidList(BizzValidHistoryParam param, SessionUserInfo sessionUserInfo);

    /**
     * 验证活动奖品码
     * @param code
     * @param sessionUserInfo
     * @param platform 验证平台 。0：商家平台；1：摩店；2：轻应用
     * @return
     */
     boolean validEventGiftCode(String code, SessionUserInfo sessionUserInfo,byte platform);

    /**
     * 验证活动奖品码
     * @param code
     * @param sessionUserInfo
     * @param isSuperShop 是否是超级店长
     * @param platform 验证平台 。0：商家平台；1：摩店；2：轻应用
     * @return
     */
     WebValidVO validEventGiftCode(String code, SessionUserInfo sessionUserInfo,Boolean isSuperShop,byte platform);

    /**
     * 万达BO 验券接口
     * @param codeParam
     * @return
     */
     boolean validWDCode(VerifyCodeParam codeParam) throws CodeServiceException;


    /**
     * 万达 查询订单接口
     * @param codeParam
     * @return
     * @throws CodeServiceException
     */
    WdCouponVO queryWDCoupon(VerifyCodeParam codeParam) throws CodeServiceException;


    /**
     * 查询活动奖品码的信息
     * @param code
     * @param mallMid
     * @return
     */
    ValidCouponVO validSearchEventGift(String code, String mallMid);

    /**
     * 家得利验码接口
     * @param validUser
     * @param identity
     * @param code
     * @param mallId
     * @param shopId
     * @param platform
     * @param bizCode
     * @param deviceNo
     * @return
     * @throws CodeServiceException
     */
    ResponseVO validJiadeliCouponCode(String code, String mallId, String shopId, Integer userId, byte platform, int count, String bizCode, String deviceNo) throws CodeServiceException;
}