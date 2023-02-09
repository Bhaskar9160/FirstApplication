package com.akhm.firstapplication;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface API {

    @POST("user/save")
    Call<UserEntity> insertUser (
            @Body UserEntity userEntity
    );

    @POST("user/login")
     Call<UserEntity> getUser (@Body UserEntity userEntity
            );

}
