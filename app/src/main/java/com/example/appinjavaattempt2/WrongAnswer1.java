package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class WrongAnswer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong_answer1);

        Button wrongNextQuestion1 = (Button) findViewById(R.id.wrongNextQuestion1);
        wrongNextQuestion1.setOnClickListener(v1 -> openTriviaQuestion2());
    }
    public void openTriviaQuestion2() {
        Intent intent = new Intent(this, TriviaQuestion2.class);
        startActivity(intent);
    }
}