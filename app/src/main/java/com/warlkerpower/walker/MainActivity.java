package com.warlkerpower.walker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.warlkerpower.walker.adapter.MainActivityAdapter;
import com.warlkerpower.walker.tabview.indicator.Indicator;
import com.warlkerpower.walker.tabview.indicator.IndicatorViewPager;
import com.warlkerpower.walker.tabview.viewpager.SViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(R.string.app_name);
        SViewPager viewPager = (SViewPager) findViewById(R.id.tab_viewPager);
        viewPager.setCanScroll(false);
        viewPager.setOffscreenPageLimit(4);
        Indicator indicator = (Indicator) findViewById(R.id.tab_indicator);
        MainActivityAdapter adapter = new MainActivityAdapter(getSupportFragmentManager(), this);
        IndicatorViewPager indicatorViewPager = new IndicatorViewPager(indicator, viewPager);
        indicatorViewPager.setAdapter(adapter);
    }
}
