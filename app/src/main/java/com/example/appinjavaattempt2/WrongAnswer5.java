package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class WrongAnswer5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong_answer5);

        Button wrongNextQuestion5 = (Button) findViewById(R.id.wrongNextQuestion5);
        wrongNextQuestion5.setOnClickListener(v1 -> openTriviaScorePage());
    }
    public void openTriviaScorePage() {
        Intent intent = new Intent(this, TriviaScorePage.class);
        startActivity(intent);
    }
}