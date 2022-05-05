package com.example.independencework.presentention.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.independencework.databinding.ActivityFinalBinding;
import com.example.independencework.domain.DataTopics;
import com.example.independencework.domain.Model;

public class FinalActivity extends AppCompatActivity {

    ActivityFinalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFinalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        int pos = getIntent().getIntExtra("pos", 0);
        Model model = DataTopics.getList().get(pos);

        binding.topic.setText(model.topic);
        binding.imageFinal.setImageResource(model.image);
        binding.imageFinal2.setImageResource(model.image2);
        binding.firstText.setText(model.context);
        binding.secondText.setText(model.context2);

    }
}