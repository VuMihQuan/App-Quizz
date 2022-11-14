package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ItemMenuBinding;

import java.util.ArrayList;

public class menuAdapter extends RecyclerView.Adapter<menuAdapter.menuViewHolder>{
    public static class menuViewHolder extends RecyclerView.ViewHolder {
        ItemMenuBinding binding;

        public menuViewHolder(ItemMenuBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(com.example.myapplication.itemMenu item) {
            binding.imageView.setImageResource(item.getIdImage());
            binding.textTopic.setText(item.getTopic());
        }
    }
    private final ArrayList<itemMenu> menuArr;
    public menuAdapter(ArrayList<com.example.myapplication.itemMenu> menuArr) {
        this.menuArr = menuArr;
    }

    @NonNull
    @Override
    public menuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflate = LayoutInflater.from(parent.getContext());
        ItemMenuBinding binding = ItemMenuBinding.inflate(inflate,parent,false);
        return new menuViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull menuViewHolder holder, int position) {
        itemMenu itemmenu = menuArr.get(position);
        if(itemmenu == null) return;
        holder.bind(itemmenu);

    }

    @Override
    public int getItemCount() {
        return menuArr.size();
    }
}
