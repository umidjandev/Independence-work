package com.example.independencework.presentention.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.independencework.R;
import com.example.independencework.domain.Callback;
import com.example.independencework.domain.Model;

import java.util.List;

public class ImageContext_Adapter extends RecyclerView.Adapter<TopicsViewHolder> {

    private List<Model> items;
    private Callback callback;

    public ImageContext_Adapter(List<Model> items, Callback callback) {
        this.items = items;
        this.callback = callback;
    }


    @NonNull
    @Override
    public TopicsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View template = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_models,parent,false);
        return new TopicsViewHolder(template);
    }

    @Override
    public void onBindViewHolder(@NonNull TopicsViewHolder holder, int position) {
        holder.bind(items.get(position),callback);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
