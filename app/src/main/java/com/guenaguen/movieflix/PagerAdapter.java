package com.guenaguen.movieflix;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
            fragment = new MoviesFragment();
        else if (position == 1)
            fragment = new SeriesFragment();
        else if (position == 2)
            fragment = new Tv_showsFragment();
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String Title = null;
        if (position == 0)
            Title = "Movies";
        else if (position == 1)
            Title = "Series";
        else if (position == 2)
            Title = "TV_Shows";
        return Title;
    }

}
