package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentEndGameBinding;


public class endGameFragment extends Fragment {
    FragmentEndGameBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentEndGameBinding binding = FragmentEndGameBinding.inflate(inflater,container,false);
        int n = getArguments().getInt("n");
        String nn = String.valueOf(n);
        binding.textView3.setText(n+"/5");
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_endGameFragment_to_menuFragment);
            }
        });
        // Inflate the layout for this fragment
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Tôi đã trả lời đúng"+n+" số câu");
                sendIntent.setType("*/*");
                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
            }
        });
        return binding.getRoot();

    }
}