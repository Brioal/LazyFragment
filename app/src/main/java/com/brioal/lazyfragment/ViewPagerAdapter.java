package com.brioal.lazyfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by brioal on 16-11-1.
 * Email : brioal@foxmail.com
 * Github : https://github.com/Brioal
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return BlankFragment.getInstance();
    }

    @Override
    public int getCount() {
        return 5;
    }
}
