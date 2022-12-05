package com.example.myapplication;

import java.util.ArrayList;
import java.util.Arrays;

public class itemMenu {
    static int a =0 ;

    private final String topic;
    private final int idImage;
    public static ArrayList<itemMenu> menuArr = new ArrayList<>(
            Arrays.asList(
                    new itemMenu("Toán",R.drawable.math),
                    new itemMenu("Địa lý",R.drawable.geography),
                    new itemMenu("Lịch sử",R.drawable.history),
                    new itemMenu("sinh học",R.drawable.biological)
            )
    );
    public static ArrayList<itemMenu> QuestionArr = new ArrayList<itemMenu>(
            Arrays.asList(
                    new itemMenu("Đúng",R.drawable.checkgreen),
                    new itemMenu("Sai",R.drawable.checkred)

            )
    );
    public static ArrayList<itemMenu> levelArr = new ArrayList<>(
            Arrays.asList(
                    new itemMenu("Dễ",R.drawable.green),
                    new itemMenu("Trung bình",R.drawable.yellow),
                    new itemMenu("Khó",R.drawable.red)
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
