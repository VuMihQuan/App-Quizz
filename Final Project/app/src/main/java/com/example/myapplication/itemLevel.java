package com.example.myapplication;

import java.util.ArrayList;
import java.util.Arrays;

public class itemLevel {
    private String level;
    private int color;
    public static ArrayList<itemLevel> levelArr = new ArrayList<>(
            Arrays.asList(
                    new itemLevel("Dễ",R.drawable.green),
                    new itemLevel("Trung bình",R.drawable.yellow),
                    new itemLevel("Khó",R.drawable.red)
            )
    );

    public itemLevel(String level, int color) {
        this.level = level;
        this.color = color;
    }

    public String getLevel() {
        return level;
    }

    public int getColor() {
        return color;
    }
}
