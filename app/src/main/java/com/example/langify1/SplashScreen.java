package com.example.langify1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    //copy and paste splash screen
    TextView welcome,learning;
    private static int Splash_timeout=5000;
    //splash screen

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //copy and paste splash screen
        welcome = findViewById(R.id.textview1);
        learning = findViewById(R.id.textview2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashintent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(splashintent);
                finish();
            }
        },Splash_timeout);
        Animation myanimation1 = AnimationUtils.loadAnimation(SplashScreen.this,R.anim.animation2);
        welcome.startAnimation(myanimation1);

        Animation myanimation2 = AnimationUtils.loadAnimation(SplashScreen.this,R.anim.animation1);
        learning.startAnimation(myanimation2);
        //splash screen

    }
}