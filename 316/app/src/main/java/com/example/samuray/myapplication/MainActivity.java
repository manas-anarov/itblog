package com.example.samuray.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updatePost();
    }


    private void updatePost() {

        String id_post = "1";
        String title      =  "222";
        String text      =  "2222222";

        PostModel postModel = new PostModel(title, text);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PostApi.MY_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PostApi postApi= retrofit.create(PostApi.class);
        Call<PostModel> call = postApi.updatePost(postModel, id_post);

        call.enqueue(new Callback<PostModel>() {
            @Override
            public void onResponse(Call<PostModel> call, Response<PostModel> response) {
                Log.d("good", "good");
            }
            @Override
            public void onFailure(Call<PostModel> call, Throwable t) {
                Log.d("fail", "fail");
            }
        });

    }
}
