package com.example.elans.youtubeapidemo.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by elans on 8/28/2016.
 */
public class ApiResponse {

    @SerializedName("nextPageToken")
    private String nextPageToken;

    @SerializedName("regionCode")
    private String regionCode;

    @SerializedName("pageInfo")
    private PageInfo pageInfo;

    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    private List<Item> items;


}
