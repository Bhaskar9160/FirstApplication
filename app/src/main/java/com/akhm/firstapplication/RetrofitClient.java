package com.akhm.firstapplication;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static  final String BASE_URL = "http://192.168.43.196:8090/api/v1/";
    private static RetrofitClient mInstance;
    private Retrofit retrofit;



    public RetrofitClient() {
        initializeRetrofit();
    }

    private void initializeRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
    }
    public static synchronized RetrofitClient getInstance() {
        if (mInstance == null) {
            mInstance = new RetrofitClient();
        }
        return mInstance;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    public API getAPI () {
        return retrofit.create(API.class);
    }


}

