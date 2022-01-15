package com.example.independencework.presentention.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.independencework.databinding.ItemModelsBinding;
import com.example.independencework.domain.Callback;
import com.example.independencework.domain.Model;

public class TopicsViewHolder extends RecyclerView.ViewHolder {

    private ItemModelsBinding binding;

    public TopicsViewHolder(@NonNull View itemView) {
        super(itemView);
        binding = ItemModelsBinding.bind(itemView);
    }

    public void bind(Model model, Callback callback){

        binding.mavzuText.setText("Mavzu " + model.id);
        binding.nameTopics.setText(model.title);


        binding.openTopicsBtn.setOnClickListener(e -> {
            callback.pressed(getAdapterPosition());
        });
    }


}
