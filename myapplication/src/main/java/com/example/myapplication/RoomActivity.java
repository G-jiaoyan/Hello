package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.king.view.flutteringlayout.FlutteringLayout;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RoomActivity extends AppCompatActivity {

    private FlutteringLayout flutteringLayout;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        initView();

        String roomId = (String) getIntent().getExtras().get("roomId");

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://qf.56.com/")
                .build();
        MyServer server = retrofit.create(MyServer.class);
        server.getRoom(roomId).enqueue(new Callback<RoomBean>() {
            @Override
            public void onResponse(Call<RoomBean> call, Response<RoomBean> response) {
                //进入直播间
            }

            @Override
            public void onFailure(Call<RoomBean> call, Throwable t) {

            }
        });

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flutteringLayout.addHeart();
            }
        });

    }

    private void initView() {
        flutteringLayout = (FlutteringLayout) findViewById(R.id.flutteringLayout);
        image = (ImageView) findViewById(R.id.image);
    }
}
