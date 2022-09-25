package com.guenaguen.movieflix;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import de.hdodenhof.circleimageview.CircleImageView;

public class GroupsActivity extends AppCompatActivity {
    ChipNavigationBar bottom_nav_bar;
    CircleImageView circleImageView;
    private Object G_MoFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);

        circleImageView = findViewById(R.id.g_movi);
        circleImageView.setOnClickListener(v -> {
            Fragment fragment = new
                    G_SerFragment();
            FragmentTransaction
                    transaction = getFragmentManager().beginTransaction();
            transaction.add(R.id.containerviwerid, (android.app.Fragment) G_MoFragment);
            transaction.commit();
        });
        circleImageView = findViewById(R.id.g_tv);
        circleImageView = findViewById(R.id.g_seri);
        circleImageView = findViewById(R.id.g_anim);







        bottom_nav_bar = findViewById(R.id.bottom_nav_bar);
        bottom_nav_bar.setItemSelected(R.id.Groups_nav,
                true);
        bottom_nav_bar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int id) {

                switch (id){
                    case R.id.Home_nav:
                        Intent intent = new Intent(GroupsActivity.this, HomeActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.Groups_nav:
                        Intent intent1 = new Intent(GroupsActivity.this,GroupsActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.User_nav:
                        Intent intent2 = new Intent(GroupsActivity.this, ProfileActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.Search_nav:
                        Intent intent3 = new Intent(GroupsActivity.this, SearchActivity.class);
                        startActivity(intent3);
                        break;

                }


            }
        });

    }
}