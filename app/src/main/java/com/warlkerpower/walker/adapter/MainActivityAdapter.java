package com.warlkerpower.walker.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.warlkerpower.walker.R;
import com.warlkerpower.walker.fragment.DiscoverFragment;
import com.warlkerpower.walker.fragment.MessageFragment;
import com.warlkerpower.walker.fragment.ProfileFragment;
import com.warlkerpower.walker.tabview.indicator.IndicatorViewPager;

/**
 * Created by weiqinxiao on 15/11/8.
 */
public class MainActivityAdapter extends IndicatorViewPager.IndicatorFragmentPagerAdapter {
    private final static int[] tabNames = {
            R.string.tab_home,
            R.string.tab_message,
            R.string.tab_discover,
            R.string.tab_profile};
    private final static int[] tabIcons = {
            R.drawable.tab_icon_home_selector,
            R.drawable.tab_icon_message_selector,
            R.drawable.tab_icon_discover_selector,
            R.drawable.tab_icon_profile_selector };

    private LayoutInflater inflater;
    private Context context;

    public MainActivityAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return tabNames.length;
    }

    @Override
    public View getViewForTab(int position, View convertView, ViewGroup container) {
        if (convertView == null) {
            convertView = (TextView) inflater.inflate(R.layout.tab_main, container, false);
        }
        TextView textView = (TextView) convertView;
        textView.setText(tabNames[position]);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, tabIcons[position], 0, 0);
        return textView;
    }

    @Override
    public Fragment getFragmentForPage(int position) {
        Fragment mainFragment = null;
        switch (position) {
            case 1:
                mainFragment = new MessageFragment();
                break;
            case 2:
                mainFragment = new DiscoverFragment();
                break;
            case 3:
                mainFragment = new ProfileFragment();
                break;
        }
        return mainFragment;
    }
}
