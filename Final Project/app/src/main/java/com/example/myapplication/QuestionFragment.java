package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.databinding.FragmentQuestionBinding;
import com.example.myapplication.databinding.FragmentSelectLevelBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class QuestionFragment extends Fragment {
    private FragmentQuestionBinding binding;
    private int questionIndex=1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<Question> data = getArguments().getParcelableArrayList("data");
        // Inflate the layout for this fragment
        binding=FragmentQuestionBinding.inflate(inflater,container,false);
        FragmentQuestionBinding binding= FragmentQuestionBinding.inflate(inflater,container,false);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recyclerView.setAdapter(new QuestionAdapter(itemMenu.QuestionArr,data));
        binding.textView.setText(data.get(0).getQuestionText());
        return binding.getRoot();
    }


}