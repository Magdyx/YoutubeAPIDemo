package com.example.elans.youtubeapidemo.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by elans on 8/28/2016.
 */
public class ErrorResponse {

    @SerializedName("error")
    private Error error;

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
