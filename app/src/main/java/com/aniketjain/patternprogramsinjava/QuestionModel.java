package com.aniketjain.patternprogramsinjava;

public class QuestionModel {
    String ques, n, code;
    int imageView, imageView_ans;

    public QuestionModel(String ques, String n, int image, int image_ans, String code) {
        this.ques = ques;
        this.n = n;
        this.imageView = image;
        this.imageView_ans = image_ans;
        this.code = code;
    }

    public String getQues() {
        return "Pattern " + ques;
    }

    public String getN() {
        return "where n = " + n;
    }

    public int getImageView() {
        return imageView;
    }

    public int getImageView_ans() {
        return imageView_ans;
    }

    public String getCode() {
        return code;
    }

}
