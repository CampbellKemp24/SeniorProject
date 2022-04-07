package com.example.appinjavaattempt2;

import java.util.ArrayList;
import java.util.List;

public class mathApplicationContextGame {
    private List<MathApplicationContextQuestion>questions;
    private int numberCorrect;
    private int numberIncorrect;
    private int totalQuestions;
    private int score;

    private MathApplicationContextQuestion currentQuestion;

    public mathApplicationContextGame() {
        numberCorrect=0;
        numberIncorrect=0;
        totalQuestions=0;
        score=0;
        currentQuestion = new MathApplicationContextQuestion(12);
        questions = new ArrayList<MathApplicationContextQuestion>();

    }
//makes a new question
    public void makeNewQuestion() {
        currentQuestion = new MathApplicationContextQuestion(12);
        //makes the difficulty level higher as you answer more questions the formula is the -
        //number of current questions you have times 2 + 4
        totalQuestions++;
        //when you make a new question, the number of TOTAL question needs to go up
        questions.add(currentQuestion);
        //this adds the current question to the question list
    }

    public boolean checkAnswer(int submittedAnswer) {
        boolean isCorrect;
        if (currentQuestion.getAnswer() == submittedAnswer) {
            numberCorrect++;
            isCorrect=true;
        } else {
            numberIncorrect++;
            isCorrect=false;
        }
        //if the answer is correct, the numberCorrect score goes up by one
        //if the answer is NOT correct the numberIncorrect goes up
        //isCorrect is logic that states whether the user got the current question correct or not and then it returns this information at the end of the boolean
        score= numberCorrect - numberIncorrect;
        //The total score is the number of correct minus the number of incorrect
        // The original video said use "score= numberCorrect * 10 - numberIncorrect * 10;"
            //I changed this because I felt it was unfair and confusing.
        return isCorrect;
        //returns whether the user got the question right or not.
    }

    public List<MathApplicationContextQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<MathApplicationContextQuestion>questions) {
        this.questions = questions;
    }

    public int getNumberCorrect() {
        return numberCorrect;
    }

    public void setNumberCorrect(int numberCorrect) {
        this.numberCorrect = numberCorrect;
    }

    public int getNumberIncorrect() {
        return numberIncorrect;
    }

    public void setNumberIncorrect(int numberIncorrect) {
        this.numberIncorrect = numberIncorrect;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public MathApplicationContextQuestion getCurrentQuestion() {
        return currentQuestion;
    }

}
