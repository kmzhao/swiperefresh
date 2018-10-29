package com.anky.swiperefresh;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * @author: Anky
 * @time: 2018
 * @desc:
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private Context mContext;
    private List<String> mDatas;
    public MyAdapter(Context context, List<String> datas){
        this.mContext=context;
        this.mDatas=datas;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.adapter_my,parent,false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas==null?0:mDatas.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.tv);
        }
    }
}
