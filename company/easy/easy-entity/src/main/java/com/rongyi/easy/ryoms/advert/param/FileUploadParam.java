package com.rongyi.easy.ryoms.advert.param;

import java.io.Serializable;

public class FileUploadParam implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -5709702304605862570L;
	private String maxSize;
	private String width;
	private String height;
	private String module_type;
	/**
	 * @return the maxSize
	 */
	public String getMaxSize() {
		return maxSize;
	}
	/**
	 * @param maxSize the maxSize to set
	 */
	public void setMaxSize(String maxSize) {
		this.maxSize = maxSize;
	}
	/**
	 * @return the width
	 */
	public String getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(String width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}
	/**
	 * @return the module_type
	 */
	public String getModule_type() {
		return module_type;
	}
	/**
	 * @param module_type the module_type to set
	 */
	public void setModule_type(String module_type) {
		this.module_type = module_type;
	}
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年2月26日 下午2:38:44
	* @throws 
	*/
	@Override
	public String toString() {
		return "FileUploadParam [maxSize=" + maxSize + ", width=" + width + ", height=" + height + ", module_type="
				+ module_type + "]";
	}
}