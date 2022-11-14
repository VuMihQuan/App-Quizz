package com.example.myapplication;

import java.util.ArrayList;
import java.util.Arrays;

public class itemMenu {
    private final String topic;
    private final int idImage;
    public static ArrayList<itemMenu> menuArr = new ArrayList<>(
            Arrays.asList(
                    new itemMenu("Toán",R.drawable.math),
                    new itemMenu("Địa lý",R.drawable.geography),
                    new itemMenu("Lịch sử",R.drawable.history),
                    new itemMenu("Công nghệ",R.drawable.technology),
                    new itemMenu("sinh học",R.drawable.biological),
                    new itemMenu("Khoa học",R.drawable.science),
                    new itemMenu("Nghệ thuật",R.drawable.art),
                    new itemMenu("Ngôn ngữ",R.drawable.languages)
            )
    );

    public itemMenu(String topic, int idImage) {
        this.topic = topic;
        this.idImage = idImage;
    }

    public String getTopic() {
        return topic;
    }

    public int getIdImage() {
        return idImage;
    }
}
