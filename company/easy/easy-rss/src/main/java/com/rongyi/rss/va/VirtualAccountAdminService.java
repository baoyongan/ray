/** 
* @Title: VirtualAccountAdminService.java 
* @Package com.rongyi.rss.va 
* @Description: 虚拟账号管理接口
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月27日 上午10:45:58 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.rss.va;

import com.rongyi.easy.va.entity.VirtualAccountEntity;

/**
 * @author ZhengYl
 *
 */
public interface VirtualAccountAdminService {
	/**
	 * 账号创建
	 * 
	 * @author ZhengYl
	 * @date 2015年5月27日 上午10:51:34 
	 * @param account 虚拟账号实体
	 * @return
	 */
	public boolean virtualAccountCreate(VirtualAccountEntity account);
}
