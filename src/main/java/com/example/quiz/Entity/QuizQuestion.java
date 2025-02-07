package com.example.quiz.Entity;

import java.util.List;

public class QuizQuestion {
    private String  question;
    private List<String> choices;
    private int correctIndex;
    private String imageUrl;

    public QuizQuestion(String question, List<String> choices, int correctIndex, String imageUrl) {
        this.question = question;
        this.choices = choices;
        this.correctIndex = correctIndex;
        this.imageUrl = imageUrl;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }

    public int getCorrectIndex() {
        return correctIndex;
    }

    public void setCorrectIndex(int correctIndex) {
        this.correctIndex = correctIndex;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
