package com.k_diary.diary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.k_diary.R;
import com.k_diary.SplashActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        startActivity(new Intent(this, SplashActivity.class)); //SplashActivity 실행

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
