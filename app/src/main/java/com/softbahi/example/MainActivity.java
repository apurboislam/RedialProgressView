package com.softbahi.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.softbahi.radialprogressview.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadialProgressDialog.showRadialProgressDialog(MainActivity.this, true);
    }
}