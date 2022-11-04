package com.aniketjain.patternprogramsinjava;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        splash_screen_anim();

    }

    void splash_screen_anim() {
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreenActivity.this, SelectionActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            SplashScreenActivity.this.startActivity(intent);
        }, 1000);
    }

}