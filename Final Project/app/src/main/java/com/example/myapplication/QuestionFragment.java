package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentQuestionBinding;

import java.util.ArrayList;


public class QuestionFragment extends Fragment implements OnCllickItem {
    private FragmentQuestionBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String topic = getArguments().getString("topic");
        String level = getArguments().getString("level");
        ArrayList<Question> data = getArguments().getParcelableArrayList("data");
        // Inflate the layout for this fragment
        binding=FragmentQuestionBinding.inflate(inflater,container,false);

        FragmentQuestionBinding binding= FragmentQuestionBinding.inflate(inflater,container,false);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.textView.setText(data.get(0).getQuestionText());
        binding.recyclerView.setAdapter(new QuestionAdapter(itemMenu.QuestionArr, data,topic,level, new OnCllickItem() {
            @Override
            public void onClickitem(ArrayList<Question> data, int id) {
                    binding.textView.setText(data.get(id).getQuestionText());
                    int current = binding.progressBar.getProgress();
                    binding.progressBar.setProgress(current+1);
                }
        }));
        return binding.getRoot();

    }
    @Override
    public void onClickitem(ArrayList<Question> arr, int id) {

    }
}