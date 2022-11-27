package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ItemLevelBinding;

import java.util.ArrayList;

public class levelAdapter extends RecyclerView.Adapter<levelAdapter.levelViewHolder> {
    public final ArrayList<itemLevel> levelArr;
    public levelAdapter(ArrayList<itemLevel> levelArr) {
        this.levelArr = levelArr;
    }

    public static class levelViewHolder extends RecyclerView.ViewHolder{
        ItemLevelBinding binding;

        public levelViewHolder(ItemLevelBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }

        public void bind(itemLevel item){
            binding.textlevel.setText(item.getLevel());
            binding.imageView.setImageResource(item.getColor());


        }
    }
    @NonNull
    @Override
    public levelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflate =LayoutInflater.from(parent.getContext());
        ItemLevelBinding binding = ItemLevelBinding.inflate(inflate,parent,false);
        return new levelViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull levelViewHolder holder, int position) {
        itemLevel itemlevel = levelArr.get(position);
        if(itemlevel==null)return;
        holder.bind(itemlevel);
    }

    @Override
    public int getItemCount() {
        return levelArr.size();
    }


}
