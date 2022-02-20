package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CorrectAnswer2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_answer2);

        Button correctNextQuestion2 = (Button) findViewById(R.id.correctNextQuestion2);
        correctNextQuestion2.setOnClickListener(v1 -> openTriviaQuestion3());
    }
    public void openTriviaQuestion3() {
        TriviaApplicationContext.getInstance().incrementTriviaScore();
        Intent intent = new Intent(this, TriviaQuestion3.class);
        startActivity(intent);
    }
}