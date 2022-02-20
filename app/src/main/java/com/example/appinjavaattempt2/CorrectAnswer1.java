package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CorrectAnswer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_answer1);

        Button correctNextQuestion1 = (Button) findViewById(R.id.correctNextQuestion1);
        correctNextQuestion1.setOnClickListener(v1 -> openTriviaQuestion2());
    }
    public void openTriviaQuestion2() {
        TriviaApplicationContext.getInstance().incrementTriviaScore();
        Intent intent = new Intent(this, TriviaQuestion2.class);
        startActivity(intent);
    }
}