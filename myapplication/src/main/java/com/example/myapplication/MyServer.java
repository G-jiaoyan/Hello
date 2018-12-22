package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MyServer {
    @GET("home/v4/moreAnchor.android?&type=0&index=0")
    Call<LiveBean> getData();

    @GET("play/v1/preLoading.android")
    Call<RoomBean> getRoom(@Query("roomId")String roomId);
}
