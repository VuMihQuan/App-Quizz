package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ItemendBinding;

import java.util.ArrayList;

public class endGameAdapter extends RecyclerView.Adapter<endGameAdapter.endGameViewHolder>{
    int n;
    String topic;
    String level;
    private endGameFragment context;
    private final ArrayList<itemEndGame> arr;
    public endGameAdapter(ArrayList<itemEndGame> arr, int n, endGameFragment context,String topic, String level) {
        this.arr = arr;
        this.n=n;
        this.context=context;
        this.topic=topic;
        this.level=level;
    }
    @NonNull
    @Override
    public endGameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflate = LayoutInflater.from(parent.getContext());
        ItemendBinding binding = ItemendBinding.inflate(inflate,parent,false);
        return new endGameViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull endGameViewHolder holder, int position) {
        int Id = holder.getAdapterPosition();
        itemEndGame item = arr.get(position);
        if(item == null)return;
        holder.binding.textTopic.setText(item.getTitle());
        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Id == 0){
                    Navigation.findNavController(v).navigate(R.id.action_endGameFragment_to_menuFragment);
                }
                else{
                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT, "Tôi đã trả lời đúng "+n+" câu cấp độ " + level + " ở chủ đề " +topic);
                    sendIntent.setType("*/*");
                    Intent shareIntent = Intent.createChooser(sendIntent, null);
                    context.startActivity(shareIntent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    public static class endGameViewHolder extends RecyclerView.ViewHolder{
        ItemendBinding binding;
        public endGameViewHolder(ItemendBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
