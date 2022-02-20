package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TriviaQuestion1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia_question1);

        Button trivQuestionOneYes = (Button) findViewById(R.id.trivQuestionOneYes);
        Button trivQuestionOneNo = (Button) findViewById(R.id.trivQuestionOneNo);
        trivQuestionOneYes.setOnClickListener(v1 -> openWrongAnswer1());
        trivQuestionOneNo.setOnClickListener(v1 -> openCorrectAnswer1());
    }
    public void openWrongAnswer1() {
        Intent intent = new Intent(this, WrongAnswer1.class);
        startActivity(intent);
    }
    public void openCorrectAnswer1() {
        Intent intent = new Intent(this, CorrectAnswer1.class);
        startActivity(intent);
    }
}