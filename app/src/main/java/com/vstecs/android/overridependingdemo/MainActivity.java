package com.vstecs.android.overridependingdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_go).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LeftActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_go2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RightActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_go3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BottomActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_go4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TopActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_go5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScaleActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_go6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FadeActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return null;
    }

}
