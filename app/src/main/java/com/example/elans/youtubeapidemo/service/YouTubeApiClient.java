package com.example.elans.youtubeapidemo.service;

import com.example.elans.youtubeapidemo.response.ApiResponse;
import com.example.elans.youtubeapidemo.response.Error;
import com.example.elans.youtubeapidemo.response.ErrorResponse;
import com.example.elans.youtubeapidemo.utilites.Constants;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by elans on 8/28/2016.
 */
public abstract class YouTubeApiClient {

    public static void searchYouTube(String searchQuery, ApiCallBack apiCallBack){
        try{
            String encodeSearchQuery = URLEncoder.encode(searchQuery, "UTF-8");
            URL url = new URL(Constants.BASE_URL + encodeSearchQuery);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Contact-Type","application/json");

            int code = httpURLConnection.getResponseCode();
            Gson gson = new Gson();
            if(code == 200 || code == 201){
                if(apiCallBack != null) {
                    apiCallBack.onSuccess(gson.fromJson(getBodyString(httpURLConnection.getInputStream()), ApiResponse.class));
                }
            }else{
                if(apiCallBack != null){
                    apiCallBack.onError(gson.fromJson(getBodyString(httpURLConnection.getErrorStream()), ErrorResponse.class));
                }
            }
        }catch (IOException ex){
            ex.printStackTrace();
            if(apiCallBack != null){
                apiCallBack.onError(getErrorResponse(1111, ex));
            }
        }
    }

    private static String getBodyString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String inputLine;
        StringBuilder stringBuilder = new StringBuilder();

        while((inputLine = bufferedReader.readLine() )!= null){
            stringBuilder.append(inputLine);
        }
        return stringBuilder.toString();
    }

    private static ErrorResponse getErrorResponse(int code, Exception e){
        ErrorResponse errorResponse = new ErrorResponse();
        Error error = new Error();

        error.setCode(code);
        error.setMessage(e.getMessage());
        errorResponse.setError(error);

        return errorResponse;
    }

    public interface ApiCallBack{

        void onSuccess(ApiResponse apiResponse);

        void onError(ErrorResponse errorResponse);
    }
}
