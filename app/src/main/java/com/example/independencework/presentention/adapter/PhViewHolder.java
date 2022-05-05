package com.example.independencework.presentention.adapter;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.independencework.R;
import com.example.independencework.domain.Callback;
import com.example.independencework.domain.Model;

public class PhViewHolder extends RecyclerView.ViewHolder {
    public PhViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public void bind(Model model, Callback callback){

        TextView title = itemView.findViewById(R.id.mavzu_text);
        TextView topic = itemView.findViewById(R.id.name_topics);
        ImageButton button = itemView.findViewById(R.id.openTopicsBtn);

        title.setText(model.title);
        topic.setText(model.topic);

        button.setOnClickListener(e -> {
            callback.pressed(getAdapterPosition());
        });
    }


}
