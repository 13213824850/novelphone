/**
  * Copyright 2018 bejson.com 
  */
package com.novel.jsonbean;
import java.util.List;

/**
 * Auto-generated: 2018-04-27 16:40:51
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Data {

    private int isPublication;
    private int salesMode;
    private List<Vs> vs;
    private int chapterTotalCnt;
    private String firstChapterJumpurl;
    private int loginStatus;
    private int hasRead;
    public void setIsPublication(int isPublication) {
         this.isPublication = isPublication;
     }
     public int getIsPublication() {
         return isPublication;
     }

    public void setSalesMode(int salesMode) {
         this.salesMode = salesMode;
     }
     public int getSalesMode() {
         return salesMode;
     }

 

    public List<Vs> getVs() {
		return vs;
	}
	public void setVs(List<Vs> vs) {
		this.vs = vs;
	}
	public void setChapterTotalCnt(int chapterTotalCnt) {
         this.chapterTotalCnt = chapterTotalCnt;
     }
     public int getChapterTotalCnt() {
         return chapterTotalCnt;
     }

    public void setFirstChapterJumpurl(String firstChapterJumpurl) {
         this.firstChapterJumpurl = firstChapterJumpurl;
     }
     public String getFirstChapterJumpurl() {
         return firstChapterJumpurl;
     }

    public void setLoginStatus(int loginStatus) {
         this.loginStatus = loginStatus;
     }
     public int getLoginStatus() {
         return loginStatus;
     }

    public void setHasRead(int hasRead) {
         this.hasRead = hasRead;
     }
     public int getHasRead() {
         return hasRead;
     }

}