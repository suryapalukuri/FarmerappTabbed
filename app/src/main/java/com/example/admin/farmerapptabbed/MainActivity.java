package com.example.admin.farmerapptabbed;

import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    AppBarLayout appBarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new Tab1(), "Tab1");
        adapter.AddFragment(new Tab2(), "Tab2");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> fragmentList=new ArrayList<>();
        private final List<String> fragmentListTitle=new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return fragmentList.get(i);
        }

        @Override
        public int getCount() {
            return fragmentListTitle.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position)  {

            return fragmentListTitle.get(position);
        }

        public void AddFragment(Fragment fragment, String title) {
            fragmentList.add(fragment);
            fragmentListTitle.add(title);

        }
    }
    }

