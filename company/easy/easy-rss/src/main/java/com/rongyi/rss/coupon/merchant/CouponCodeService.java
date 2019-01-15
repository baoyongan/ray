package com.rongyi.rss.coupon.merchant;

import com.rongyi.easy.coupon.entity.CouponCode;

import java.util.List;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/8/17 10:35.
 */
public interface CouponCodeService {
    /**
     * 批量插入第三方券码
     *
     * @param list
     * @return
     */
     int batchInsert(List<CouponCode> list);

    /**
     * 批量插入生成的券码
     *
     * @param list
     * @return
     */
     int batchGenerateInsert(List<CouponCode> list);

    /**
     * 统计某个卡券的券码
     *
     * @param couponId
     * @return
     */
     int countByCouponId(String couponId);

    /**
     * 根据券id获取券码列表
     *
     * @param couponId
     * @return
     */
     List<CouponCode> getCodesByCouponId(String couponId);

    /**
     * 根据code更新券码状态
     *
     * @param couponCode
     * @param status
     * @return
     */
     int updateStatusByCouponCode(String couponCode, Integer status);

    /**
     * 批量更新券码状态
     *
     * @param couponCodes
     * @param status
     * @return
     */
     int batchUpdateStatusByCouponCode(List<String> couponCodes, Integer status);

    /**
     * 通过版本号获取券码数量
     *
     * @param couponId
     * @param version
     * @return
     */
    int countByVersion(String couponId, String version);

    /**
     * 通过版本号获取券码列表
     *
     * @param couponId
     * @param version
     * @return
     */
    List<String> getCodeByVersion(String couponId, String version);

    /**
     * 根据券id 查找券码列表，券码只返回code 和in_channel 字段
     *
     * @param couponId
     * @return
     */
     List<CouponCode> getCouponCodesByCouponId(String couponId);

    /**
     * 根据券id 查找未领取的券码，只返回couponId,code 字段
     * 分享微信用
     * @param couponId
     * @return
     */
     List<CouponCode> getCodesByCouponIdForShare(String couponId);


     int batchUpdateCouponCode(List<CouponCode> couponCodes);

    /**
     * 根据券码获知券的类型
     * @param code
     * @return
     */
     Integer getCouponTypeByCode(String code);

}
