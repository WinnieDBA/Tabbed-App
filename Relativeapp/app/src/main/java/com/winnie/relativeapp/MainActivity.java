package com.winnie.relativeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView titleOne;
    Button mButton1,mButton2;
    ImageView imageOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titleOne=findViewById(R.id.tvtitle);
        mButton1=findViewById(R.id.btnone);
        mButton2=findViewById(R.id.btntwo);
        imageOne=findViewById(R.id.imageView);
        titleOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Mbona unanigusa", Toast.LENGTH_SHORT).show();
            }
        });
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "mbili", Toast.LENGTH_SHORT).show();
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "tatu", Toast.LENGTH_SHORT).show();
            }
        });
        imageOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "picha yangu", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
