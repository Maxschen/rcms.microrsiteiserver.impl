package com.stone.it.rcms.site.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础类
 */
public class BaseVO implements Serializable{

    private static final long serialVersionUID = -1L;

    //创建人
    private String createBy;
    //更新人
    private String updateBy;
    //创建时间
    private Date createDate;
    //更新时间
    private Date updateDate;

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}
