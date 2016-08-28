package com.example.elans.youtubeapidemo.response;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by elans on 8/28/2016.
 */
public class Snippet {

    @SerializedName("publishDate")
    private Date publishDate;

    @SerializedName("channelId")
    private String channelId;

    @SerializedName("title")
    private String title;

    @SerializedName("discription")
    private String discription;

    public void setPublishDate(Date publicDate) {
        this.publishDate = publicDate;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getChannelTitle() {
        return channelTitle;
    }

    public void setChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle;
    }

    public Thumbnails getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }

    @SerializedName("channelTitle")
    private String channelTitle;

    @SerializedName("thumbnails")
    private Thumbnails thumbnails;

    public Date getPublishDate() {
        return publishDate;
    }

}
