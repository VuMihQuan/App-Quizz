package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentEndGameBinding;


public class endGameFragment extends Fragment {
    FragmentEndGameBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int n = getArguments().getInt("n");
        String topic = getArguments().getString("topic");
        String level = getArguments().getString("level");

        binding = FragmentEndGameBinding.inflate(inflater,container,false);
        FragmentEndGameBinding binding = FragmentEndGameBinding.inflate(inflater,container,false);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recyclerView.setAdapter(new endGameAdapter(itemEndGame.Arr,n, this,topic,level));
        binding.textView2.setText(n+"/5");

        // Inflate the layout for this fragment

        return binding.getRoot();

    }

}