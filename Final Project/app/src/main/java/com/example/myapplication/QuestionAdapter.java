package com.example.myapplication;

import android.media.MediaExtractor;
import android.os.Bundle;
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
import java.util.concurrent.BrokenBarrierException;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder>{
    private OnCllickItem listener = null;
    int n=0;
    private final ArrayList<itemMenu> QuestionArr;
    private final ArrayList<Question> data;
    String topic;
    String level;
    public int questionIndex = 0;
    public QuestionAdapter(ArrayList<itemMenu> questionArr,ArrayList<Question> data,String topic,String level,OnCllickItem listener) {
        this.QuestionArr = questionArr;
        this.data=data;
        this.listener=listener;
        this.topic=topic;
        this.level=level;

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
        int id = holder.getAdapterPosition();
        itemMenu itemquestion = QuestionArr.get(position);
        if(itemquestion == null) return;
        holder.binding.textTopic.setText(itemquestion.getTopic());
        holder.binding.imageView.setImageResource(itemquestion.getIdImage());
        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(boolToInt(data.get(questionIndex).getQuestionAnswer())!=id){
                    n++;
                }
                if(questionIndex < 4){
                    questionIndex+=1;
                    listener.onClickitem(data,questionIndex);
                }else{
                    Bundle bundle = new Bundle();
                    bundle.putString("topic",topic);
                    bundle.putString("level",level);
                    bundle.putInt("n",n);
                    Navigation.findNavController(v).navigate(R.id.action_questionFragment_to_endGameFragment,bundle);
                }
            }
        });
    }
    public int boolToInt(boolean b) {
        return b ? 1 : 0;
    }
    @Override
    public int getItemCount() {
        return QuestionArr.size();
    }
}
