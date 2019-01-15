package com.rongyi.rss.shop;

import java.util.List;

import com.rongyi.core.framework.exception.InvalidParameterException;
import com.rongyi.easy.entity.BrandEntity;
import com.rongyi.easy.rmmm.entity.BrandInfoEntity;
import com.rongyi.easy.solr.BrandDocument;

public interface IBrandService {
	/**
	 * 模糊查询品牌
	 * @param name
	 * @param currpage
	 * @param pageSize
	 * @return
	 */
	public List<BrandEntity> searchBrand(String name,int type,int currpage,int pageSize);
	
	/**
	 * 模糊查询品牌数量
	 * @param name
	 * @return
	 */
	public Long searchBrandCount(String name);
	/**
	 * 根据id查询品牌
	 * @param id
	 * @return
	 */
	public BrandEntity searchBrandById(String id);
	
	/**
	 *
	* @Title: selectBrandByMongoId 
	* @Description: 查询品牌的mysql表信息
	* @param @param brandMid
	* @param @return    设定文件 
	* @return BrandInfoEntity    返回类型 
	* @throws
	 */
	public BrandInfoEntity selectBrandByMongoId(String brandMid);


	/**
	 * 获取品牌总数插入到solr库中
	 * @return
	 */
	public long getBrandCount();

	/**
	 * 分页获取品牌solr对象
	 * @param skip
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public List<BrandDocument> getBrandDocumentList(int skip,int pageSize) throws Exception;

	/**
	 * 品牌mongo转solr
	 * @param brandMid
	 * @return
	 * @throws Exception
	 */
	public BrandDocument getBrandDocument(String brandMid) throws Exception;

	public List<BrandEntity> getBrandList(int skip,int pageSize);

	/**
	 * 根据类目名称过滤品牌
	 * @param name
	 * @param brandEntityList
	 * @return
	 */
	public List<BrandEntity> addFilterBrandByCategoryName(String name, List<BrandEntity> brandEntityList);

	/**
	 * 根据店铺id查询品牌
	 * @param shopId
	 *
	 * @return brand document list
	 * @throws InvalidParameterException shopId is invalid
	 * @throws RuntimeException the shop is null
	 *
	 */
	List<BrandDocument> searchBrandByShopId(String shopId);
	
	/**
	 * 根据品牌名称查询品牌
	 * @param id
	 * @return
	 */
	public List<BrandEntity> searchBrandByName(String name) throws Exception;
}