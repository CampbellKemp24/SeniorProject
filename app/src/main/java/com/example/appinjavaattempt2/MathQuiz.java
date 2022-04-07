package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MathQuiz extends AppCompatActivity {

    Button mathStartButton, mathAnswerZero, mathAnswerOne, mathAnswerTwo, mathAnswerThree, mathBackToHomescreenButton;
    TextView secondsLeftText, mathScoreText, mathQuestionText, mathBottomText;
    ProgressBar mathProgressBar;

    mathApplicationContextGame g = new mathApplicationContextGame();

    int secondsRemaining = 30;

    CountDownTimer timer = new CountDownTimer(30000, 1000) {
        //millisInFuture is in miliseconds and it is the time the user has left
        //countDown interval is the period between ticks
        @Override
        public void onTick(long millisUntilFinished) {
            //events everytime the clock ticks until the time goes out
            secondsRemaining--;
            secondsLeftText.setText(secondsRemaining + " secs");
            mathProgressBar.setProgress(30 - secondsRemaining);
        }

        @Override
        public void onFinish() {
            mathAnswerZero.setEnabled(false);
            mathAnswerOne.setEnabled(false);
            mathAnswerTwo.setEnabled(false);
            mathAnswerThree.setEnabled(false);
            mathBottomText.setText("Time is up!" + g.getNumberCorrect() + "/" + (g.getTotalQuestions() - 1));
            //handlers serve as a delay.  For this, the button is going to come up at a delay.  That is what this handler is for.
            final Handler handler = new Handler();
            //it is final, there is only one handler in the application.
            handler.postDelayed(() -> {
                mathBackToHomescreenButton.setVisibility(View.VISIBLE);
            }, 4000);
            //make sure you have a comma here or it will show up with lines of errors
            //4000 miliseconds is how long the delay will last
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_quiz);

        mathStartButton = findViewById(R.id.mathStartButton);
        mathAnswerZero = findViewById(R.id.mathAnswerZero);
        mathAnswerOne = findViewById(R.id.mathAnswerOne);
        mathAnswerTwo = findViewById(R.id.mathAnswerTwo);
        mathAnswerThree = findViewById(R.id.mathAnswerThree);
        mathBackToHomescreenButton = findViewById(R.id.mathBackToHomescreenButton);

        secondsLeftText = findViewById(R.id.secondsLeftText);
        mathScoreText = findViewById(R.id.mathScoreText);
        mathQuestionText = findViewById(R.id.mathQuestionText);
        mathBottomText = findViewById(R.id.mathBottomText);

        mathProgressBar = findViewById(R.id.mathProgressBar);

        secondsLeftText.setText("0sec");
        mathQuestionText.setText("");
        mathBottomText.setText("Press Go");
        mathScoreText.setText("0pts");
        mathProgressBar.setProgress(0);

        mathStartButton.setVisibility(View.VISIBLE);
        mathBackToHomescreenButton.setOnClickListener(v1 -> mathOpenMainActivity());

        View.OnClickListener mathStartButtonClickListener = v -> {
            Button mathStartButton = (Button) v;
            mathStartButton.setVisibility(View.INVISIBLE);
            mathBackToHomescreenButton.setVisibility(View.INVISIBLE);
            secondsRemaining = 30;
            g = new mathApplicationContextGame();
            nextTurn();
            timer.start();
        };

        View.OnClickListener answerButtonClickListener = v -> {
            Button buttonClicked = (Button) v;
            int answerSelected = Integer.parseInt(buttonClicked.getText().toString());
            g.checkAnswer(answerSelected);
            mathScoreText.setText(Integer.toString(g.getScore()));
            nextTurn();
        };

        mathStartButton.setOnClickListener(mathStartButtonClickListener);
        mathAnswerZero.setOnClickListener(answerButtonClickListener);
        mathAnswerOne.setOnClickListener(answerButtonClickListener);
        mathAnswerTwo.setOnClickListener(answerButtonClickListener);
        mathAnswerThree.setOnClickListener(answerButtonClickListener);
    }

    private void nextTurn() {
        g.makeNewQuestion();
        int [] answer = g.getCurrentQuestion().getAnswerArray();
        mathAnswerZero.setText(Integer.toString(answer[0]));
        mathAnswerOne.setText(Integer.toString(answer[1]));
        mathAnswerTwo.setText(Integer.toString(answer[2]));
        mathAnswerThree.setText(Integer.toString(answer[3]));

        mathQuestionText.setText(g.getCurrentQuestion().getQuestionPhrase());
        mathAnswerZero.setEnabled(true);
        mathAnswerOne.setEnabled(true);
        mathAnswerTwo.setEnabled(true);
        mathAnswerThree.setEnabled(true);
        mathBottomText.setText(g.getNumberCorrect() + "/" + (g.getTotalQuestions() - 1));
    }
    public void mathOpenMainActivity() {
        Intent intent = new Intent (this, HomeScreen.class);
        startActivity(intent);
    }
}