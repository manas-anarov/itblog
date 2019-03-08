package com.example.samuray.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;




public class MainActivity extends AppCompatActivity {

    private ArrayList<Integer> idPost = new ArrayList<>();
    private ArrayList<String> titlePost = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showAllPosts();
    }



    private void showAllPosts() {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DjangoApi.DJANGO_SITE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        DjangoApi postApi= retrofit.create(DjangoApi.class);



        Call<List<PostModel>> call = postApi.getAllPostsVoditelSort();

        call.enqueue(new Callback<List<PostModel>>() {
            @Override
            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {

                if(response.isSuccessful()){

                    if (response.body() != null) {

                        List<PostModel> heroList = response.body();

                        for(PostModel h:heroList){

                            Integer id_posta_voditel = h.getId();
                            idPost.add(id_posta_voditel);


                            String title = h.getTitle();
                            titlePost.add(title);

                        }

                        initRecyclerView();

                    }

                }else {
                    Log.d("fail", "fail");
                }


            }

            @Override
            public void onFailure(Call<List<PostModel>> call, Throwable t) {
                Log.d("fail", "fail");
            }

        });

    }


    private void initRecyclerView(){

        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerAdapter adapter = new RecyclerAdapter(this, idPost, titlePost);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}
