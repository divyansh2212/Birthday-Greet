package com.example.anapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Surprise extends AppCompatActivity {
TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surprise);
        display = findViewById(R.id.display);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        display.setText("Happy Birthday "+name);
    }
}