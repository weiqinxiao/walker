package com.warlkerpower.walker.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.warlkerpower.walker.R;
import com.warlkerpower.walker.tabview.LazyFragment;
import com.warlkerpower.walker.tabview.indicator.Indicator;
import com.warlkerpower.walker.tabview.indicator.IndicatorViewPager;
import com.warlkerpower.walker.tabview.indicator.slidebar.ColorBar;
import com.warlkerpower.walker.tabview.indicator.slidebar.ScrollBar;

/**
 * Created by weiqinxiao on 15/11/8.
 */
public class DiscoverFragment extends LazyFragment {
    @Override
    protected void onCreateViewLazy(Bundle savedInstanceState) {
        super.onCreateViewLazy(savedInstanceState);
        setContentView(R.layout.fragment_discover);
        ViewPager viewPager = (ViewPager) findViewById(R.id.discover_viewPager);
        Indicator indicator = (Indicator) findViewById(R.id.discover_indicator);
        int selected = getResources().getColor(R.color.colorGray);
        indicator.setScrollBar(new ColorBar(getApplicationContext(), selected, 0, ScrollBar.Gravity.CENTENT_BACKGROUND));
        viewPager.setOffscreenPageLimit(4);

        IndicatorViewPager indicatorViewPager = new IndicatorViewPager(indicator, viewPager);
        indicatorViewPager.setAdapter(new PagerAdapter(getChildFragmentManager()));
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private class PagerAdapter extends IndicatorViewPager.IndicatorFragmentPagerAdapter {

        public PagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public View getViewForTab(int position, View convertView, ViewGroup container) {
            if (convertView == null) {
                LayoutInflater inflate =LayoutInflater.from(getApplicationContext());
                convertView = inflate.inflate(R.layout.tab_top, container, false);
            }
            return convertView;
        }

        @Override
        public Fragment getFragmentForPage(int position) {
            Fragment mainFragment = null;
            switch (position) {
                case 0:
                    mainFragment = new DiscoverFirstFragment();
                    break;
                case 1:
                    mainFragment = new DiscoverSecondFragment();
                    break;
            }
            return mainFragment;
        }
    }
}
