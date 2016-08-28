package com.example.elans.youtubeapidemo.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by elans on 8/28/2016.
 */
public class Item {

    @SerializedName("id")
    private id id;

    @SerializedName("snippet")
    private Snippet snippet;

    public com.example.elans.youtubeapidemo.response.id getId() {
        return id;
    }

    public void setId(com.example.elans.youtubeapidemo.response.id id) {
        this.id = id;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }

}
