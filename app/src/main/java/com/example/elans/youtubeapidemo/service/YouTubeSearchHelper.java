package com.example.elans.youtubeapidemo.service;

import android.util.Log;

import com.example.elans.youtubeapidemo.models.video;
import com.example.elans.youtubeapidemo.response.ApiResponse;
import com.example.elans.youtubeapidemo.response.ErrorResponse;
import com.example.elans.youtubeapidemo.response.Item;

/**
 * Created by elans on 8/28/2016.
 */
public abstract class YouTubeSearchHelper {

    private static final String TAG = YouTubeSearchHelper.class.getName();

    public static void searchVideos(String searchQuery){
        YouTubeApiClient.searchYouTube(searchQuery, new YouTubeApiClient.ApiCallBack(){

            @Override
            public void onSuccess(ApiResponse apiResponse) {
                if(apiResponse != null) {
                    Log.d(TAG, "Items Size " + VideoItemWrapper.getVideoList(apiResponse).size());
                    for(com.example.elans.youtubeapidemo.models.video video:VideoItemWrapper.getVideoList(apiResponse)){
                        Log.d(TAG,video.getTitle());
                    }
                }
            }

            @Override
            public void onError(ErrorResponse errorResponse) {
                if(errorResponse != null) {
                    Log.d(TAG, errorResponse.getError().getMessage());
                }
            }
        });
    }
}
