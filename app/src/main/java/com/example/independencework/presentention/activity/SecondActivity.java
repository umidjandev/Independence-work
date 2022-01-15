package com.example.independencework.presentention.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.independencework.R;
import com.example.independencework.databinding.ActivitySecondBinding;
import com.example.independencework.domain.DataTopics;
import com.example.independencework.presentention.adapter.ImageContext_Adapter;
import com.example.independencework.presentention.fragment.TestFragment;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ImageContext_Adapter adapter = new ImageContext_Adapter(DataTopics.getList(),
                pos -> {
                    Intent intent = new Intent(this, TestFragment.class);
                    intent.putExtra("pos",pos);
                    startActivity(intent);
                });
        binding.recycleTopics.setAdapter(adapter);
        binding.recycleTopics.setLayoutManager(new LinearLayoutManager(this));


    }
}