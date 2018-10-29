package com.anky.swiperefresh;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Toast;

import com.anky.swiperefresh.widget.DefaultItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SwipeRecyclerView recycler;
    private List<String> initDatas(){
        ArrayList<String> data = new ArrayList<>();
        for (int i=1;i<31;i++){
            data.add("item "+i);
        }
        return data;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler=findViewById(R.id.recycler);
        recycler.setAutoLoadMore(true);
        recycler.addItemDecoration(new DefaultItemDecoration(ContextCompat.getColor(this, R.color.divider_color)));
        recycler.useDefaultLoadMore(); // 使用默认的加载更多的View。
        recycler.setLoadMoreListener(new SwipeRecyclerView.LoadMoreListener() {
            @Override
            public void onLoadMore() {
                Toast.makeText(MainActivity.this, "more...", Toast.LENGTH_SHORT).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        recycler.loadMoreFinish(true,false);
                    }
                },2000);
            }
        }); // 加载更多的监听。
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(new MyAdapter(this,initDatas()));
        recycler.loadMoreFinish(false,true);
    }

}
