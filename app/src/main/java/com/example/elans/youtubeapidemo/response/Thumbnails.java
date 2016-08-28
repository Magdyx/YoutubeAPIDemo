package com.example.elans.youtubeapidemo.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by elans on 8/28/2016.
 */
public class Thumbnails {

    public High getHigh() {
        return high;
    }

    public void setHigh(High high) {
        this.high = high;
    }

    @SerializedName("high")

    private High high;
}
