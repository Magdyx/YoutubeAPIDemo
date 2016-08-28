package com.example.elans.youtubeapidemo.service;

import android.app.IntentService;
import android.content.Intent;

import com.example.elans.youtubeapidemo.utilites.Constants;

/**
 * Created by elans on 8/25/2016.
 */
public class ListFetchService extends IntentService {

    public ListFetchService() {
        super("List loading service");

    }

    @Override
    protected void onHandleIntent(Intent intent) {
        switch (intent.getAction()){
            case Constants.ACTION_SEARCH_YOUTUBE:
                YouTubeSearchHelper.searchVideos(intent.getStringExtra(Constants.SEARCH_QUERY_KEY));
                break;
        }
    }
}
