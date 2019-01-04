package com.stone.it.rcms.site.vo;

/**
 * 栏目类
 */
public class SiteVO extends BaseVO{

    private static final long serialVersionUID = -1L;

    //栏目ID
    private int siteId;
    //栏目名称
    private String siteName;
    //栏目URI
    private String siteUri;
    //打开方式
    private String target;

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteUri() {
        return siteUri;
    }

    public void setSiteUri(String siteUri) {
        this.siteUri = siteUri;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
