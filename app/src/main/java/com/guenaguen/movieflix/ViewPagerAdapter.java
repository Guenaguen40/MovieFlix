package com.guenaguen.movieflix;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter
        extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
            fragment = new FavoriteFragment();
        else if (position == 1)
            fragment = new WishFragment();
        else if (position == 2)
            fragment = new HistoryFragment();
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
            Title = "Favorite";
        else if (position == 1)
            Title = "Wishlist";
        else if (position == 2)
            Title = "History";
        return Title;
    }
}
