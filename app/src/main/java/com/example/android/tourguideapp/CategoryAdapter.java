package com.example.android.tourguideapp;

/**
 * Created by natasam on 05/12/2017.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate Fragment for a view pager.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ToSeeFragment();
        } else if (position == 1){
            return new ForKidsFragment();
        } else if (position == 2) {
            return new ToEatFragment();
        } else {
            return new ToBuyFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_tosee);
        } else if (position == 1) {
            return mContext.getString(R.string.category_forkids);
        } else if (position == 2) {
            return mContext.getString(R.string.category_toeat);
        } else {
            return mContext.getString(R.string.category_tobuy);
        }
    }
}
