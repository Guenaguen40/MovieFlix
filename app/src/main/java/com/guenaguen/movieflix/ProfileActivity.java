package com.guenaguen.movieflix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import android.content.Intent;
import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;


public class ProfileActivity extends AppCompatActivity {
    ChipNavigationBar bottom_nav_bar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        viewPager = findViewById(R.id.frame);
        tabLayout = findViewById(R.id.tablayout);

        viewPagerAdapter = new ViewPagerAdapter(
                getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        bottom_nav_bar = findViewById(R.id.bottom_nav_bar);
        bottom_nav_bar.setItemSelected(R.id.User_nav,
                true);
        bottom_nav_bar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int id) {

                switch (id){
                    case R.id.Home_nav:
                        Intent intent = new Intent(ProfileActivity.this, HomeActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.Groups_nav:
                        Intent intent1 = new Intent(ProfileActivity.this,GroupsActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.User_nav:
                        Intent intent2 = new Intent(ProfileActivity.this, ProfileActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.Search_nav:
                        Intent intent3 = new Intent(ProfileActivity.this, SearchActivity.class);
                        startActivity(intent3);
                        break;

                }


            }
        });
        
        
        





    }
}