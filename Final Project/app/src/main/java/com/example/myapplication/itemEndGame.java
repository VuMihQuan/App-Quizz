package com.example.myapplication;

import java.util.ArrayList;
import java.util.Arrays;

public class itemEndGame {
    public itemEndGame(String title) {
        this.title = title;
    }
    public static ArrayList<itemEndGame> Arr = new ArrayList<>(
            Arrays.asList(
                    new itemEndGame("Hoàn thành"),
                    new itemEndGame("Chia sẻ thành tích")
            )
    );

    private String title;

    public String getTitle() {
        return title;
    }
}
