package com.example.g_jiaoyan.live;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private Context mContext;
    private List<JsonBean.MessageBean.AnchorsBean> mBeanList;

    public RecyclerAdapter(Context context, List<JsonBean.MessageBean.AnchorsBean> beanList) {
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
        JsonBean.MessageBean.AnchorsBean bean = mBeanList.get(i);
        Picasso.with(mContext).load(bean.getPic51()).into(holder.iv);
        holder.tv.setText(bean.getName());
    }

    @Override
    public int getItemCount() {
        return mBeanList==null?0:mBeanList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView iv;
        public TextView tv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            iv = itemView.findViewById(R.id.iv);
            tv = itemView.findViewById(R.id.tv);
        }
    }
}
