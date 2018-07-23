package com.myrp.a16023022.knowyourfacts;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MyFragmentAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments;

    public MyFragmentAdapter(FragmentManager fm, ArrayList<Fragment> al) {
        super(fm);
        fragments = al;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
