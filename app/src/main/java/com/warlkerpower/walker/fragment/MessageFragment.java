package com.warlkerpower.walker.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.warlkerpower.walker.R;
import com.warlkerpower.walker.adapter.MessageFragmentAdapter;
import com.warlkerpower.walker.listview.PullToRefreshListView;
import com.warlkerpower.walker.tabview.LazyFragment;

/**
 * Created by weiqinxiao on 15/11/8.
 */
public class MessageFragment extends LazyFragment implements
        PullToRefreshListView.OnRefreshListener, AdapterView.OnItemClickListener {
    private PullToRefreshListView listView;
    private MessageFragmentAdapter adapter;

    @Override
    protected void onFragmentStartLazy() {
        super.onFragmentStartLazy();
    }

    @Override
    protected void onFragmentStopLazy() {
        super.onFragmentStopLazy();
    }

    @Override
    protected void onCreateViewLazy(Bundle savedInstanceState) {
        setContentView(R.layout.fragment_message);
        listView = (PullToRefreshListView)findViewById(R.id.refresh_listview);
        listView.setOnRefreshListener(this);
        listView.setOnItemClickListener(this);
        adapter = new MessageFragmentAdapter(this.getApplicationContext());
        listView.setAdapter(adapter);
        listView.onRefresh();
        listView.setLastUpdated("上次刷新: 10:00");
        super.onCreateViewLazy(savedInstanceState);
    }

    @Override
    protected void onDestroyViewLazy() {
        super.onDestroyViewLazy();
    }

    @Override
    public void onRefresh() {
        adapter.loadData();
        listView.postDelayed(new Runnable() {
            @Override
            public void run() {
                listView.onRefreshComplete();
            }
        }, 400);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
