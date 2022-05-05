package com.example.independencework.presentention.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.independencework.R;
import com.example.independencework.domain.Callback;
import com.example.independencework.domain.Model;

import java.util.ArrayList;

public class PhoneAdapter extends RecyclerView.Adapter<PhViewHolder> {

    private ArrayList<Model> items ;
    private Callback callback;

    public PhoneAdapter(ArrayList<Model> items, Callback callback) {
        this.items = items;
        this.callback = callback;

    }

    @NonNull
    @Override
    public PhViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View template = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.item_models,parent,false);
        return new PhViewHolder(template);
    }

    @Override
    public void onBindViewHolder(@NonNull PhViewHolder holder, int position) {
        holder.bind(items.get(position),callback);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
