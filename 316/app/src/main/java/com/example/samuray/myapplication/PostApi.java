package com.example.samuray.myapplication;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PostApi {

    String MY_URL = "http://192.168.0.174:8000/" + "rest/";

    @PUT("{id}/edit/")
    Call<PostModel> updatePost(@Body PostModel postModel, @Path(value = "id", encoded = true) String id);

}
