package com.twise.marvelquiz;

public class Question {

    private int mTextResId;
    private String mAnswer;
    private Boolean mCorrect;
    private Boolean mCompleted;

    public Question(int textResId, String answer) {
        mTextResId = textResId;
        mAnswer = answer;
        mCorrect = false;
        mCompleted = false;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public String getAnswer() {
        return mAnswer;
    }
}
