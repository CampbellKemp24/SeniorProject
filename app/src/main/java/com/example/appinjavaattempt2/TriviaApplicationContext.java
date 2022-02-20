package com.example.appinjavaattempt2;

public class TriviaApplicationContext {

    private static TriviaApplicationContext instance;

    private int triviaScore;

    public static TriviaApplicationContext getInstance() {
        if (instance == null) {
            instance = new TriviaApplicationContext();
        }
        return instance;
    }

    private TriviaApplicationContext() {
        this.triviaScore = 0;
    }

    public int getTriviaScore() {
        return triviaScore;
    }

    public void setTriviaScore(int triviaScore) {
        this.triviaScore = triviaScore;
    }

    public void incrementTriviaScore() {
        this.triviaScore++;
    }


    public void backToZeroTrivia() {
        this.triviaScore = 0;
    }
}
