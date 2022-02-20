package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CorrectAnswer4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_answer_4);

        Button correctNextQuestion4 = (Button) findViewById(R.id.correctNextQuestion4);
        correctNextQuestion4.setOnClickListener(v1 -> openTriviaQuestion5());
    }
    public void openTriviaQuestion5() {
        TriviaApplicationContext.getInstance().incrementTriviaScore();
        Intent intent = new Intent(this, TriviaQuestion5.class);
        startActivity(intent);
    }
}