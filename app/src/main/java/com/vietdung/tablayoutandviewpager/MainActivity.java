package com.vietdung.tablayoutandviewpager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.vietdung.tablayoutandviewpager.fragment.FragmentOne;
import com.vietdung.tablayoutandviewpager.fragment.FragmentThree;
import com.vietdung.tablayoutandviewpager.fragment.FragmentTwo;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private static final int PAGE_LIMIT = 3;
    private static final int PAGE_ONE = 1;
    private static final int PAGE_TWO = 2;
    private static final int PAGE_THREE = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setupViewPager();
        mTabLayout.setupWithViewPager(mViewPager);
        setupTabIcon();
    }

    private void setupViewPager() {
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new FragmentOne(), getString(R.string.title_first));
        pagerAdapter.addFragment(new FragmentTwo(), getString(R.string.title_second));
        pagerAdapter.addFragment(new FragmentThree(), getString(R.string.title_three));
        mViewPager.setAdapter(pagerAdapter);
        mViewPager.setOffscreenPageLimit(PAGE_LIMIT);
    }

    private void initView() {
        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.view_pager);
    }

    public void setupTabIcon() {
        mTabLayout.getTabAt(PAGE_ONE).setIcon(R.mipmap.ic_launcher_round);
        mTabLayout.getTabAt(PAGE_TWO).setIcon(R.mipmap.ic_launcher_round);
        mTabLayout.getTabAt(PAGE_THREE).setIcon(R.mipmap.ic_launcher_round);

    }
}
