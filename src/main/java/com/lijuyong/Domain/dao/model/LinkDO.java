package com.lijuyong.Domain.dao.model;

import sun.awt.image.ImageWatched;

import java.util.Date;

/**
 * Created by john on 2017/2/11.
 */
public class LinkDO {
    private String url;
    private Date crawlDate;

    public String getUrl(){
        return  url;
    }
    public  Date getCrawDate(){
        return  crawlDate;
    }
    public LinkDO(String url,Date crawlDate){
        this.url =url;
        this.crawlDate = crawlDate;
    }
    public  LinkDO(){
        url = null;
        crawlDate = new Date();
    }

}
