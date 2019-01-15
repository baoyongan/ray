package com.rongyi.rss.content;

import com.rongyi.easy.content_v2.entity.*;
import com.rongyi.easy.content_v2.param.ForumContentParam;
import com.rongyi.easy.content_v2.param.ForumContentStatusDelParam;
import com.rongyi.easy.content_v2.vo.*;

import java.util.List;

/**
 * 页面用的接口
 * @author lijing
 * @time 2015-09-07
 *
 */
public interface IIContentService {
	/**
	 * 查询内容管理首页的信息
	 * 
	 */
	public List<ForumHomeModelVo> findHomePage(int type);
	/**
	 * 插入位置
	 * @param list
	 * @return
	 */
	public Boolean savePostions(List<ForumPosition> list);

	/**
	 * 通过id查询首页信息
	 * @param id
	 * @return
	 */
	public ForumHomepage findHomepageById(Integer id);
	/**
	 * 修改顺序位置
	 * @param fhp
	 * @return
	 */
	public Boolean updateHomeSortIdx(ForumHomepage fhp) throws Exception;
	
	/**
	 * 修改内容首页状态
	 * @param fhp
	 * @return
	 */
	public Boolean updateHomeStatus(ForumHomepage fhp) throws Exception;
	
	/**
	 * 查询总条数
	 * @return 
	 */
	public int findHomePageCount(int type);
	
	/**
	 * 修改位置表的修改人
	 * @param fp
	 * @return
	 */
	public Boolean updatePositionUpdateUser(ForumPosition fp) throws Exception;
	
	/**
	 * 通过首页id查询每个模版的位置信息
	 * @param id
	 * @return
	 */
	public List<ForumPosition> findPositionAllByHomePId(Integer id);
	
	/**
	 * 通过查询条件 查询位置下的内容
	 * @param fcp
	 * @return
	 */
	public List<ForumContentListVo> findContentAllByParam(ForumContentParam fcp);
	
	/**
	 * 通过id删除内容信息
	 * @param fc
	 * @return
	 * @throws Exception
	 */
	public Boolean deleteContentById(ForumContentStatusDelParam fc) throws Exception;
	
	/**
	 * 通过id，status修改状态！
	 * @param fc
	 * @return
	 * @throws Exception
	 */
	public Boolean updateStatusContentByIdStatus(ForumContentStatusDelParam fc) throws Exception;
	
	/**
	 * 通过id查询内容详情
	 * @param id
	 * @return
	 */
	public ForumContent findContentOneById(Integer id);
	/**
	 * 通过位置id查询模版信息
	 * @param id
	 * @return
	 */
	public ForumPostiomModelVo findModelByPostionId(Integer id);
	/**
	 * 增加内容
	 * @param fc
	 * @return
	 * @throws Exception
	 */
	public Boolean saveContent(ForumContent fc)throws Exception;

	/**
	 * 新增类容
	 * @param fc
	 * @return
	 * @throws Exception
	 */
	public Boolean saveContents(List<ForumContent> fc)throws Exception;
	/**
	 * 删除内容
	 * @param fc
	 * @return
	 * @throws Exception
	 */
	public Boolean updateContent(ForumContent fc)throws Exception;
	
	/**
	 * 通过查询条件 查询位置下的内容 总数量
	 * @param fcp
	 * @return
	 */
	public Long findContentCountAllByParam(ForumContentParam fcp);
	/**
	 * 查询特卖的列表数量
	 * @param fcp
	 * @return
	 */
	public Long findContentAllByParamSpecailCount(ForumContentParam fcp);

	/**
	 * 判断在同一位置、同一区域、同一发布时间段内是否有内容
	 * @param fc
	 * @return
	 */
	List<String> hasContent(ForumContent fc);
	/**
	 * 修改 位置时间
	 * @param fp
	 * @return
	 */
	public Boolean updateOptionById(ForumPosition fp);

	/**
	 * 判断买手id 是否在同一位置，同一区域有
	 */
	List<String> hasBuyerLive(ForumContent fc);
	/**
	 * 修改置顶状态
	 */
	public Boolean updateStickById(ForumStick fs);
	/**
	 * 
	* @Title: findContentAllByParamSpecail 
	* @Description: 特卖查询列表接口
	* @param @param par
	* @param @return    设定文件 
	* @return List<ForumContentListVo>    返回类型 
	* @author shaozhou 
	* @date 2015年12月1日 下午2:36:46
	* @throws
	 */
	public List<ForumContentListVo> findContentAllByParamSpecail(ForumContentParam par);

	/**
	 * 查询模版列表
	 * @return
	 */
	public List<ForumTemplateVO> findTemplateList();


	/**
	 * 判断在同一位置、同一区域、同一发布时间段内是否有内容
	 * @param fc
	 * @return
	 */
	int hasContentNoTitle(ForumContent fc);

	/**
	 * 通过模版id 查询模版详情
	 * @param id
	 * @return
	 */
	public ForumTemplate findTemplateById(Integer id);


	/**
	 * 设置模版
	 * @param forumTemplate
	 * @return
	 */
	public boolean updateTemplateByParam(ForumTemplate forumTemplate);

	/**
	 * 通过模版id查询位置信息
	 * @param id
	 * @return
	 */
	public List<ForumPosition> findPositionByTemplateId(Integer  id);

	/**
	 * 通过城市id查询
	 * @param ids
	 * @return
	 */
	public List<TemplateListVO> findTemplateCityByCityId(List<String> ids);

	/**
	 * 通过模版列表判断城市是否存在
	 * @param templateId
	 * @param ids
	 * @return
	 */
	public List<ForumTemplateCity> hasTemplateCity(Integer templateId, List<String> ids);

	/**
	 * 关联城市
	 * @param templateId
	 * @param forumTemplateCities
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public boolean renvelCiyt(Integer templateId, List<ForumTemplateCity> forumTemplateCities, String userName) throws Exception;

	/**
	 * 通过模版id 查询城市信息
	 * @param id
	 * @return
	 */
	public List<TemplateCityVO> findTemplateCityList(Integer id);

	/**
	 * 每日秒杀的保存
	 * @param fc
	 * @return
	 * @throws Exception
	 */
	public ForumContent saveContentDailySale(ForumContent fc) throws Exception;
	
	/**
	 * 获取板块设置标签信息
	 * 
	 * @param homePageId
	 * @author wangjh7
	 * @return
	 */
	public List<ActivityModuleVO> selectActivityModule(int homePageId);
	
	/**
	 * 设置板块是否显示
	 * 
	 * @param moduleId
	 * @param isVisible 
	 * @author wangjh7
	 * @return
	 */
	public int updateActivityModuleVisible(int moduleId, boolean isVisible, int userId, String userName);
	
	/**
	 * 设置板块的位置
	 * 
	 * @param moduleId
	 * @param currentPosition
	 * @param type
	 * @author wangjh7
	 * @return
	 */
	public int updateActivityModulePosition(int moduleId, int currentPosition,int type, int userId, String userName) throws Exception;
	
	/**
	 * 保存板块的信息
	 * 
	 * @param list
	 * @author wangjh7
	 * @return
	 */
	public int saveActivityModule(List<ActivityModuleEntity> list) throws Exception;
	
	/**
	 * 获取板块的信息
	 * 
	 * @param moduleId
	 * @author wangjh7
	 * @return
	 */
	public ActivityModuleVO getActivityModuleInfo(int moduleId);
	
	/**
	 * 判断是否存在同一个时间段的广告(除自己外）
	 * 
	 * @param content
	 * @author wangjh7
	 * @return
	 */
	public boolean existSameLaunchAdvert(ForumContent content);
	/**
	 * 获取可见板块的信息
	 *
	 * @param moduleId
	 * @author wangjh7
	 * @return
	 */
	public int getVisibleActivityModuleBeyondId(int moduleId) ;

	/**
	 * 获取可见板块的信息
	 *
	 * @param contentParam
	 * @author wangjh7
	 * @return
	 */
	public List<ForumContent> getContentByModuleCode(ContentParam contentParam) ;

    /**
     * 根据code获取content的个数
     *
     * @param contentParam
     * @author wangjh7
     * @return
     */
    public Long getCountContentByModuleCode(ContentParam contentParam) ;

}