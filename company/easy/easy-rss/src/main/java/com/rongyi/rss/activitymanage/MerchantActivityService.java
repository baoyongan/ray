package com.rongyi.rss.activitymanage;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.activitymanage.entity.ActivityInfo;
import com.rongyi.easy.merchantactivity.param.*;
import com.rongyi.easy.merchantactivity.vo.*;
import com.rongyi.easy.activitymanage.vo.ActivityGoodsCheckRecordVO;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * create by com.rongyi.rss.activitymanage ideaworkspace :author lijing
 * 商家后台活动接口
 * User:lijing
 * DATE : 2016/3/14
 * TIME : 9:56
 * ideaworkspace.
 */
public interface MerchantActivityService {

	public GoodsActivtyVO selectGoodsActivityDetailByGoodsId(Integer id);
	/**
	 * 商品审核操作
	 * @param merchantCheckGoodsParam
	 * @return
	 */
	public Boolean checkMerchantActivityGoodsByParam(MerchantCheckGoodsParam merchantCheckGoodsParam);
	/**
	 * 查询商家活动商品
	 * @param checkGoodsParam
	 * @return
	 */
	public PagingVO<MerchantActivityGoodsVO> searchMerchantCheckActivityGoodsByParam(CheckGoodsParam checkGoodsParam);
	/**
	 * 审核活动列表的 审核操作
	 * @param checkMerchantActivityParam
	 * @return
	 */
	public Boolean checkMerchantActivityList(CheckMerchantActivityParam checkMerchantActivityParam);

	/**
	 * 通过商场 查询商场下所有审核活动和商品的数量
	 * @param relevanId
	 * @param relevanType
	 * @return
	 */
	public CheckActivityCountVO searchCheckMerchantActivityCount(String relevanId,Integer relevanType);
	/**
	 * 查询审核的活动列表
	 * @param merchantActivityCheckListParam
	 * @return
	 */
	public PagingVO<MerchantActivityListVO> searchCheckActivityList(MerchantActivityCheckListParam merchantActivityCheckListParam);

	/**
	 * 查询商家活动中已经报名的商品
	 * @param merchantActivityGoodsParam
	 * @return
	 */
	public PagingVO<MerchantActivityGoodsVO> searchMerchantActivityGoodsByParam(MerchantActivityGoodsParam merchantActivityGoodsParam);

	/**
	 * 查看撤销记录
	 * @param id
	 * @param status
	 * @return
	 */
 public List<MerchantRecordVo> searchMerchantRevokeRecord(Integer id,Integer status);

	/**
	 * 通过活动id 查询商家活动规则详情
	 * @param id
	 * @return
	 */
	public MerchantActivityCouponRuleVO selectMerchantActivityCouponRuleDetail(Integer id);

	/**
	 * 通过id 查询活动的详情
	 * @param id
	 * @return
	 */
	public MerchantActivityListVO selectMerchantActivityInfoById(Integer id);

	/**
	 * 申请撤销 或则 取消申请
	 * @param revokeOrCannelMerchantActivityParam
	 * @return
	 */
	public boolean revocationOrCannelMerchantActivity(RevokeOrCannelMerchantActivityParam revokeOrCannelMerchantActivityParam);

	/**
	 * 查询活动列表
	 * @param merchantActivityListParam
	 * @return
	 */
	public PagingVO<MerchantActivityListVO> searchMerchantActivityList(MerchantActivityListParam merchantActivityListParam);
    /**
     * 保存商家活动规则信息
     * @Param activityInfo
     * @return
     */
    public ActivityInfo saveMerchantCouponActivityInfo(ActivityInfo activityInfo);

    /**
     * 通过im消息发送信息
     * @param userIds
     * @param param
     */
    public void sendImMsg(String[] userIds,Map<String, String> param);

    /**
     * 通过商场 查询商场下所有活动总量
     * @param relevanId
     * @param relevanType
     * @return
     */
    public MerchantActivityCountVO searchMerchantCount(String relevanId,Integer relevanType);
    
    /**
	 * 修改报名的信息(参与价或参与库存)
	 * 
	 * @author wangjianhua
	 * 
	 * @param activityGoodsId
	 *            活动商品ID
	 * @param joinCount
	 *            参与库存数
	 * @param activityPrice
	 *            活动价
	 * @return 1：成功 0：失败
	 */
	public int updateEnrollGoodsSpec(int activityGoodsId, int joinCount, int activityPrice, String userName);

	/**
	 * 修改报名的信息（参与时间）
	 * 
	 * @author wangjianhua
	 * 
	 * @param activityGoodsId
	 *            活动商品ID
	 * @param joinStartDate
	 *            参与开始时间
	 * @param joinEndDate
	 *            参与结束时间
	 * @return 1：成功 0：失败
	 */
	public int updateEnrollGoodsJoinDate(int activityGoodsId, Date joinStartDate, Date joinEndDate, String userName);
	
	/**
	 * 追加库存
	 * 
	 * @author wangjianhua
	 * 
	 * @param activityGoodsId
	 *            活动商品ID
	 * @param count
	 *            库存数
	 * @return
	 */
	public int appendStock(int activityGoodsId, int count);
	
	/**
	 * 退回理由
	 * 
	 * @author wangjianhua
	 * 
	 * @param activityGoodsId
	 *            活动商品ID
	 * @return
	 */
	public ActivityGoodsCheckRecordVO refusedReason(int activityGoodsId);
	
	/**
	 * 申请撤销报名
	 * 
	 * @author wangjianhua
	 * @param activityGoodsId
	 * @param userName
	 * @return
	 */
	public int revokeEnroll(int activityGoodsId, String content, String userId, String userName);
	
	/**
	 * 取消报名
	 * 
	 * @author wangjianhua
	 * @param activityGoodsId
	 * @param userName
	 * @return
	 */
	public int cancelEnroll(int activityGoodsId, String userName);
	
	/**
	 * 判断当前商品是不是自营
	 * 
	 * @author wangjianhua
	 * @param activityGoodsId
	 * @param mallId
	 * @return
	 */
	public int isSelfGoods(int activityGoodsId, String mallId);
	
	/**
	 * 更新审核状态为待审核（仅仅当前退回状态）
	 * 
	 * @author wangjianhua
	 * @param activityGoodsId
	 * @return
	 */
	public int updateStatusToPending(int activityGoodsId, String userName);

	boolean updateMerchantActivityInfo(ActivityInfo activityInfo);
}