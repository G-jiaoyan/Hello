package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {

    private Context mContext;
    private List<LiveBean.MessageBean.AnchorsBean> mBeanList;

    public MyRecyclerAdapter(Context context, List<LiveBean.MessageBean.AnchorsBean> beanList) {
        mContext = context;
        mBeanList = beanList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = View.inflate(mContext, R.layout.item, null);
        ViewHolder holder = new ViewHolder(inflate);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        Picasso.with(mContext).load(mBeanList.get(i).getPic51()).into(holder.iv);
        holder.tv.setText(mBeanList.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return mBeanList == null?0:mBeanList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView iv;
        public TextView tv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            iv = itemView.findViewById(R.id.iv);
            tv = itemView.findViewById(R.id.tv);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getLayoutPosition();
                    String roomid = mBeanList.get(position).getRoomid();
                    Intent intent = new Intent(mContext, RoomActivity.class);
                    intent.putExtra("roomId",roomid);
                    mContext.startActivity(intent);
                }
            });
        }
    }
}
