package com.guenaguen.movieflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class SearchActivity extends AppCompatActivity {
    ChipNavigationBar bottom_nav_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        bottom_nav_bar = findViewById(R.id.bottom_nav_bar);
        bottom_nav_bar.setItemSelected(R.id.Search_nav,
                true);
        bottom_nav_bar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int id) {

                switch (id){
                    case R.id.Home_nav:
                        Intent intent = new Intent(SearchActivity.this, HomeActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.Groups_nav:
                        Intent intent1 = new Intent(SearchActivity.this,GroupsActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.User_nav:
                        Intent intent2 = new Intent(SearchActivity.this, ProfileActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.Search_nav:
                        Intent intent3 = new Intent(SearchActivity.this, SearchActivity.class);
                        startActivity(intent3);
                        break;

                }


            }
        });

    }
}