package com.guenaguen.movieflix;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class onbordActivity extends AppCompatActivity{
    Button button2 = findViewById(R.id.button2);
    TextView t_c = findViewById(R.id.t_c);
    TextView privacy = findViewById(R.id.privacy);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onbord);
        button2.setOnClickListener(view -> startActivity(new Intent(onbordActivity.this, HomeActivity.class)));

        t_c.setOnClickListener(view -> startActivity(new Intent(onbordActivity.this, TcActivity.class)));

        privacy.setOnClickListener(view -> startActivity(new Intent(onbordActivity.this, PrivacyActivity.class)));
    }

    }
