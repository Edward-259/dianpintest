package com.example.yjw.myapplication.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.yjw.myapplication.R;
import com.example.yjw.myapplication.constant.Constant;
import com.example.yjw.myapplication.unil.SPUtil;

public class SplashActivity extends AppCompatActivity {
    SPUtil spUtil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        spUtil = new SPUtil(this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent;

                if (true) {
                    intent = new Intent(SplashActivity.this, GuideActivity.class);
                    spUtil.setFirst(false);
                } else {
                    intent = new Intent(SplashActivity.this, MainActivity.class);
                }
                startActivity(intent);
                finish();
            }
        }, 1500);
    }
}
