package com.example.alu53380881c.interfacesmenulateral;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MiFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[] =
            new String[]{"El Sol", "Tab Dos", "Tab Tres"};

    public MiFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment f = null;
        switch (position) {
            case 0:
                f = new SunFragment();
                break;
            case 1:
                f = new Fragment1();
                break;
            case 2:
                f = new Fragment2();
                break;
        }
        return f;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}