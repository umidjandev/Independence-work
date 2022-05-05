package com.example.independencework.presentention.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.independencework.databinding.ActivitySecondBinding;
import com.example.independencework.domain.DataTopics;
import com.example.independencework.presentention.adapter.PhoneAdapter;


public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

     PhoneAdapter adapter = new PhoneAdapter(DataTopics.getList(),
                pos -> {
                    Intent intent = new Intent(this, FinalActivity.class);
                    intent.putExtra("pos",pos);
                    startActivity(intent);
                });
        binding.recycleTopics.setAdapter(adapter);
        binding.recycleTopics.setLayoutManager(new LinearLayoutManager(this));


    }
}