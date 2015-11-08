package com.warlkerpower.walker.fragment;

import android.os.Bundle;

import com.warlkerpower.walker.R;
import com.warlkerpower.walker.tabview.LazyFragment;

/**
 * Created by weiqinxiao on 15/11/8.
 */
public class ProfileFragment extends LazyFragment {
    @Override
    protected void onCreateViewLazy(Bundle savedInstanceState) {
        setContentView(R.layout.fragment_profile);
        super.onCreateViewLazy(savedInstanceState);
    }

    @Override
    protected void onDestroyViewLazy() {
        super.onDestroyViewLazy();
    }
}
