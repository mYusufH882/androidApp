package com.startup.zeroday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MyView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_view);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Google Pixel");
        }
    }
}