package com.rongyi.easy.activitymanage.entity;

import com.google.inject.internal.Lists;
import com.rongyi.easy.mcmc.vo.CommodityBuyerVO;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by yangyang on 2016/5/10.
 * 场次信息表
 */
public class TemplateRound implements Serializable {
    private Integer id;
    private String bannerPic;
    private String name;
    /**活动模版id*/
    private Integer activityTemplateId;
    private String refIds;
    private int sort;
    /**创建时间*/
    private Date createAt;
    /**
     * 创建人id
     */
    private Integer createBy;
    /**修改时间*/
    private Date updateAt;
    /**修改时间*/
    private Integer updateBy;
    /**版本*/
    private Integer version;

    private List<SpeSale> speSales = Lists.newArrayList();

    public Integer getActivityTemplateId() {
        return activityTemplateId;
    }

    public void setActivityTemplateId(Integer activityTemplateId) {
        this.activityTemplateId = activityTemplateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBannerPic() {
        return bannerPic;
    }

    public void setBannerPic(String bannerPic) {
        this.bannerPic = bannerPic;
    }

    public String getRefIds() {
        return refIds;
    }

    public void setRefIds(String refIds) {
        this.refIds = refIds;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public List<SpeSale> getSpeSales() {
        return speSales;
    }

    public void setSpeSales(List<SpeSale> speSales) {
        this.speSales = speSales;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("bannerPic", bannerPic)
                .append("refIds", refIds)
                .append("sort", sort)
                .append("createAt", createAt)
                .append("createBy", createBy)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .append("updateBy", updateBy)
                .append("version", version)
                .append("activityTemplateId", activityTemplateId)
                .append("name", name)
                .append("speSales", speSales)
                .toString();
    }
}