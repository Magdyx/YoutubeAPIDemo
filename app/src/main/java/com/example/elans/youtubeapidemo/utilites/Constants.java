package com.example.elans.youtubeapidemo.utilites;

/**
 * Created by elans on 8/25/2016.
 */
public class Constants {
    public static final String YOUTUBE_API_KEY = "AIzaSyCzvDpTSMU3IQKsrW-D8om5YJoc_lrlYec";
    public static final String BASE_URL = "https://www.googleapis.com/youtube/v3/search?part=id,snippet&q=android&maxResults=50&type=video&key=" + YOUTUBE_API_KEY + "&q=";
    public static final String ACTION_SEARCH_YOUTUBE = "com.example.elans.youtubeapidemo.ACTION_SEARCH_YOUTUBE";
    public static final String SEARCH_QUERY_KEY = "com.example.elans.youtubeapidemo.SEARCH_QUERY_KEY";
}
