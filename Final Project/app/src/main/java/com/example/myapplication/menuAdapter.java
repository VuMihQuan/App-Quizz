package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
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
            binding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Navigation.findNavController(v).navigate(R.id.action_menuFragment_to_selectLevelFragment2);
                }
            });
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
