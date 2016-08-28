package com.example.elans.youtubeapidemo.service;


import com.example.elans.youtubeapidemo.models.video;
import com.example.elans.youtubeapidemo.response.ApiResponse;
import com.example.elans.youtubeapidemo.response.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elans on 8/28/2016.
 */
public class VideoItemWrapper {
    public static List<video> getVideoList(ApiResponse apiResponse){
        List<video> videos =  new ArrayList<>();

        for(Item item : apiResponse.getItems()){
            video video = new video();
            video.setId(item.getId().getVideoId());
            video.setPublishDate(item.getSnippet().getPublishDate());
            video.setChannelId(item.getSnippet().getChannelId());
            video.setChannelTitle(item.getSnippet().getChannelTitle());
            video.setThumbnail(item.getSnippet().getThumbnails().getHigh().getUrl());
            video.setDescription(item.getSnippet().getDiscription());
            video.setTitle(item.getSnippet().getTitle());
            videos.add(video);

        }
        return  videos;
    }
}
