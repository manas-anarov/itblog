package com.example.samuray.myapplication;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface LoginApi {

    String DJANGO_SITE = "http://192.168.0.112:8000/blog/";

    @POST("api-token-auth/")
    Call<User> login(@Body Login login);

    @GET("post/")
    Call<List<Posts>> getPost(@Header("Authorization")  String djangoToken);

}
