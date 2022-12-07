package com.example.myapplication;

import android.graphics.Path;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentSelectLevelBinding;

import java.util.ArrayList;


public class selectLevelFragment extends Fragment {
    FragmentSelectLevelBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String topic = getArguments().getString("topic");
        ArrayList<Question> de = getArguments().getParcelableArrayList("de");
        ArrayList<Question> tb = getArguments().getParcelableArrayList("tb");
        ArrayList<Question> kho = getArguments().getParcelableArrayList("kho");
        binding = FragmentSelectLevelBinding.inflate(inflater,container,false);
        // Inflate the layout for this fragment

        FragmentSelectLevelBinding binding= FragmentSelectLevelBinding.inflate(inflater,container,false);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recyclerView.setAdapter(new levelAdapter(itemMenu.levelArr,de,tb,kho,topic));
        return binding.getRoot();
    }
}