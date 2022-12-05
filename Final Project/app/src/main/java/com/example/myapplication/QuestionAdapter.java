package com.example.myapplication;

import android.media.MediaExtractor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.FragmentQuestionBinding;
import com.example.myapplication.databinding.ItemMenuBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder>{
    private final ArrayList<itemMenu> QuestionArr;
    public FragmentQuestionBinding bin;
    public int questionIndex=1;
    private ArrayList<Question> data;
    public QuestionAdapter(ArrayList<itemMenu> questionArr,ArrayList<Question> data) {
        this.QuestionArr = questionArr;
        this.data=data;

    }
    public static class QuestionViewHolder extends RecyclerView.ViewHolder {
        ItemMenuBinding binding;
        public QuestionViewHolder(ItemMenuBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
    @NonNull
    @Override
    public QuestionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflate = LayoutInflater.from(parent.getContext());
        ItemMenuBinding binding = ItemMenuBinding.inflate(inflate,parent,false);
        return new QuestionViewHolder(binding);
    }
    @Override
    public void onBindViewHolder(@NonNull QuestionViewHolder holder, int position) {
        itemMenu itemquestion = QuestionArr.get(position);
        if(itemquestion == null) return;
        holder.binding.textTopic.setText(itemquestion.getTopic());
        holder.binding.imageView.setImageResource(itemquestion.getIdImage());
        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public int getItemCount() {
        return QuestionArr.size();
    }
}
