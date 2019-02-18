package com.example.samuray.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import java.util.List;
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
        login();
    }


    private void login(){


        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(LoginApi.DJANGO_SITE)
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();


        LoginApi loginApi = retrofit.create(LoginApi.class);

        String str_username      =  "samuray";
        String str_password      =  "qwerty12345";

        Login login = new Login(str_username, str_password);

        Call<User> call = loginApi.login(login);
        call.enqueue(new Callback<User>() {

            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.isSuccessful()){


                    if (response.body() != null) {

                        String token = response.body().getToken();
                        Toast.makeText(getApplicationContext(), token, Toast.LENGTH_SHORT).show();
                        showPost(token);
                    }

                }else {
                    Log.d("fail","fail");
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.d("fail","fail");
            }
        });
    }








    private void showPost(String token) {


        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(LoginApi.DJANGO_SITE)
                .addConverterFactory(GsonConverterFactory.create());
                Retrofit retrofit = builder.build();


        LoginApi login= retrofit.create(LoginApi.class);

        String Token_request = "Token " + token;

        Call<List<Posts>> call = login.getPost(Token_request);

        call.enqueue(new Callback<List<Posts>>() {
            @Override
            public void onResponse(Call<List<Posts>> call, Response<List<Posts>> response) {

                if(response.isSuccessful()){

                    if (response.body() != null) {

                        List<Posts> heroList = response.body();

                        for(Posts h:heroList){

                            String title = h.getTitle();
                            Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();

                            String text = h.getText();
                            Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
                        }
                        
                    }

                }else {
                    Log.d("fail", "fail");
                }

            }

            @Override
            public void onFailure(Call<List<Posts>> call, Throwable t) {
                Log.d("fail","fail");
            }

        });

    }

}
