package com.example.elans.youtubeapidemo.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by elans on 8/28/2016.
 */
public class Error {

    @SerializedName("code")
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @SerializedName("message")
    private String message;
}
