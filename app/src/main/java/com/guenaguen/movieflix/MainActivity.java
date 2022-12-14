package com.guenaguen.movieflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    private static final int SPLASH_TIMER_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(this::run, SPLASH_TIMER_OUT);
    }
    private void run() {
        Intent signinIntent;
        signinIntent = new Intent(MainActivity.this,
              onbordActivity.class);
        startActivity(signinIntent);
        finish();
    }
}
