package com.warlkerpower.walker.fragment;

import android.os.Bundle;

import com.warlkerpower.walker.R;
import com.warlkerpower.walker.tabview.LazyFragment;

/**
 * Created by weiqinxiao on 15/11/8.
 */
public class DiscoverFirstFragment extends LazyFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onCreateViewLazy(Bundle savedInstanceState) {
        setContentView(R.layout.fragment_disconver_first);
        super.onCreateViewLazy(savedInstanceState);
    }
}
