package com.example.samuray.myapplication;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DjangoApi {

    String DJANGO_SITE = "http://192.168.8.101:8000/post/";


    @GET("list/")
    Call<List<PostModel>> getAllPostsVoditelSort();

}
