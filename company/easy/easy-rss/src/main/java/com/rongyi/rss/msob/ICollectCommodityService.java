package com.rongyi.rss.msob;

import org.bson.types.ObjectId;

import com.rongyi.easy.rmmm.param.CollectCommodityParam;


public interface ICollectCommodityService {
	
	/**
	 * 收藏商品
	 * @param param
	 * @param userId
	 * @throws Exception
	 */
	public void collectCommodity(CollectCommodityParam param,String userId) throws Exception;
	
	/**
	 * 取消收藏商品
	 * @param param
	 * @param userId
	 * @throws Exception
	 */
	public void cancelcollectCommodity(CollectCommodityParam param,String userId) throws Exception;
}