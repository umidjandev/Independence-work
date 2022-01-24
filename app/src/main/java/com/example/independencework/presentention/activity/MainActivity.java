package com.example.independencework.presentention.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import com.example.independencework.Main222;
import com.example.independencework.R;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton startBtn = findViewById(R.id.startBtn);
        startBtn.setOnClickListener(e -> {
            Intent intent = new Intent(this, Main222.class);
            startActivity(intent);
        });

    }
}