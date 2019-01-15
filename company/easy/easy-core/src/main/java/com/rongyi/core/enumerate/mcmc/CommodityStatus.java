package com.rongyi.core.enumerate.mcmc;

/**
 * 商品状态
 * @author xiaobo
 *
 */
public enum CommodityStatus{
	/**
	 * 上架
	 */
	ON(1),

	/**
	 * 下架
	 */
	OFF(0),

	/**
	 * 删除
	 */
	DELETE(2),

	/**
	 * 待上架
	 */
	PENDING(3);

	private int value;
	
	private CommodityStatus(int value) {
		this.value = value;
	}

	/**
	 * 获取值
	 * 
	 * @return
	 */
	public int getValue() {
		return value;
	}
}
