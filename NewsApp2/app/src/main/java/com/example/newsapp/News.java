package com.example.newsapp;

public class News {

    private String mSectionName;
    private String mDate;
    private String mWebTitle;
    private String mWebUrl;

    public News(String section, String date, String title, String url) {
        this.mSectionName = section;
        this.mDate = date;
        this.mWebTitle = title;
        this.mWebUrl = url;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getDate() {
        return mDate;
    }

    public String getWebTitle() {
        return mWebTitle;
    }

    public String getWebUrl() {
        return mWebUrl;
    }

}
