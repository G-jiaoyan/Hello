package com.example.g_jiaoyan.live;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface JsonServer {
    @GET("home/v4/moreAnchor.android?&type=0&index=0")
    Call<JsonBean> getData();

    @GET("play/v1/preLoading.android")
    Observable<JsonBean> getLive(@Query("roomId")int roomId);
}
