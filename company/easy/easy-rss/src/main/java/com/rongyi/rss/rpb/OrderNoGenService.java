package com.rongyi.rss.rpb;

/**	
 * @Author:  柯军
 * @Description: 订单号service 
 * @datetime:2015年7月6日下午3:18:27
 *
 **/
public interface OrderNoGenService {

	/**	
	 * @Description: 生成订单号 (即将废弃)
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年7月6日下午3:18:16
	 **/
	@Deprecated
	public String getOrderNo();
	
	/**	
	 * @Description: 新新版本订单号生成规则(MMdd+8位随机号+HHmm) 
	 * @param type 0:交易流水号,1:商品订单首字符，2:优惠券订单首字符,3:结算系统对账单号首字符,4:购物车订单首字符，5:返佣流水号首字符 ,6:现金付款支付事件流水号
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月1日下午5:26:29
	 **/
	public String getOrderNo(String type);
	
}
