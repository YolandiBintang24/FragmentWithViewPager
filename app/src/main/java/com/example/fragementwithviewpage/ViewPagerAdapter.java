package com.example.fragementwithviewpage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

//class viewpageradapter adalah kelas untuk inisialisasi fragment
public class ViewPagerAdapter extends FragmentPagerAdapter {

    public final int PAGE_COUNT = 4;
    public String tabTitles[] = new String[]{"CHATS", "STATUS", "CALLS","OpenWeb"};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fr = null;
        switch (position) {
            case 0:
                fr = new CHAT();
                break;
            case 1:
                fr = new STATUS();
                break;
            case 2:
                fr = new PANGGILAN();
                break;
            case 3:
                fr = new WebFragment();
                break;

        }

        return fr;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
