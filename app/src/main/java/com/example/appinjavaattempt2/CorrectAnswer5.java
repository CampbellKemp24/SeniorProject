package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CorrectAnswer5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_answer5);

        Button correctNextQuestion5 = (Button) findViewById(R.id.correctNextQuestion5);
        correctNextQuestion5.setOnClickListener(v1 -> openTriviaScorePage());
    }
    public void openTriviaScorePage() {
        TriviaApplicationContext.getInstance().incrementTriviaScore();
        Intent intent = new Intent(this, TriviaScorePage.class);
        startActivity(intent);
    }
}