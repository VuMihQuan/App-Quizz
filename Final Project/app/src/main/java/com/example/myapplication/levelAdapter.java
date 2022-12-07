package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ItemLevelBinding;

import java.util.ArrayList;

public class levelAdapter extends RecyclerView.Adapter<levelAdapter.levelViewHolder>{
    String topic;
    ArrayList<Question> de;
     ArrayList<Question> tb;
    ArrayList<Question> kho;
    public final ArrayList<itemMenu> levelArr;
    public levelAdapter(ArrayList<itemMenu> levelArr, ArrayList<Question> de, ArrayList<Question> tb, ArrayList<Question> kho,String topic) {
        this.levelArr = levelArr;
        this.de=de;
        this.tb=tb;
        this.kho=kho;
        this.topic=topic;
    }

    public static class levelViewHolder extends RecyclerView.ViewHolder{
        ItemLevelBinding binding;
        public levelViewHolder(ItemLevelBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
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
        itemMenu itemlevel = levelArr.get(position);
        if(itemlevel==null)return;
        holder.binding.imageView.setImageResource(itemlevel.getIdImage());
        holder.binding.textlevel.setText(itemlevel.getTopic());
        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int Id = holder.getAdapterPosition();
                Bundle bundle = new Bundle();
                bundle.putString("topic",topic);
                bundle.putString("level",itemlevel.getTopic());
                if(Id==0){
                    bundle.putParcelableArrayList("data",de);
                }
                if(Id==1){
                    bundle.putSerializable("data",tb);
                }
                if(Id==2){
                    bundle.putSerializable("data",kho);
                }
                Navigation.findNavController(v).navigate(R.id.action_selectLevelFragment2_to_questionFragment, bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return levelArr.size();
    }


}
