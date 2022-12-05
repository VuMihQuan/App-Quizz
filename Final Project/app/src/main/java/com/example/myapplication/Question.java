package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question implements Parcelable {
    private final String questionText;
    private final Boolean questionAnswer;

    public Question(String questionText, Boolean questionAnswer) {
        this.questionText = questionText;
        this.questionAnswer = questionAnswer;
    }


    protected Question(Parcel in) {
        questionText = in.readString();
        byte tmpQuestionAnswer = in.readByte();
        questionAnswer = tmpQuestionAnswer == 0 ? null : tmpQuestionAnswer == 1;
    }

    public static final Creator<Question> CREATOR = new Creator<Question>() {
        @Override
        public Question createFromParcel(Parcel in) {
            return new Question(in);
        }

        @Override
        public Question[] newArray(int size) {
            return new Question[size];
        }
    };

    public String getQuestionText() {
        return questionText;
    }

    public Boolean getQuestionAnswer() {
        return questionAnswer;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(questionText);
        dest.writeByte((byte) (questionAnswer == null ? 0 : questionAnswer ? 1 : 2));
    }
}
