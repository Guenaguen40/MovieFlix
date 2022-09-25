package com.guenaguen.movieflix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class HomeActivity extends AppCompatActivity {
    ChipNavigationBar bottom_nav_bar;

    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        viewPager = findViewById(R.id.viewpager1);
        tabLayout = findViewById(R.id.tablayout2);

        pagerAdapter = new PagerAdapter(
                getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);





        bottom_nav_bar = findViewById(R.id.bottom_nav_bar);
        bottom_nav_bar.setItemSelected(R.id.Home_nav,
                true);
        bottom_nav_bar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int id) {

                switch (id){
                    case R.id.Home_nav:
                        Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.Groups_nav:
                        Intent intent1 = new Intent(HomeActivity.this,GroupsActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.User_nav:
                        Intent intent2 = new Intent(HomeActivity.this, ProfileActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.Search_nav:
                        Intent intent3 = new Intent(HomeActivity.this, SearchActivity.class);
                        startActivity(intent3);
                        break;

                }


            }
        });

    }
}