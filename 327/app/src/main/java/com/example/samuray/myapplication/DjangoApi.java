package com.example.samuray.myapplication;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Path;

public interface DjangoApi {

    String DJANGO_SITE = "http://192.168.0.112:8000/post/";


    @DELETE("delete/{id}/")
    Call<RequestBody> deletePost(@Path(value = "id", encoded = true) String id);





}
