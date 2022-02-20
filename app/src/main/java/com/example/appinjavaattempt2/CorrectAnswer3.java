package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CorrectAnswer3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_answer3);

        Button correctNextQuestion3 = (Button) findViewById(R.id.correctNextQuestion3);
        correctNextQuestion3.setOnClickListener(v1 -> openTriviaQuestion4());
    }
    public void openTriviaQuestion4() {
        TriviaApplicationContext.getInstance().incrementTriviaScore();
        Intent intent = new Intent(this, TriviaQuestion4.class);
        startActivity(intent);
    }
}