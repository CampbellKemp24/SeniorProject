package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TriviaQuestion2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia_question2);

        Button trivQuestionTwoChina = (Button) findViewById(R.id.trivQuestionTwoChina);
        Button trivQuestionTwoBelgium = (Button) findViewById(R.id.trivQuestionTwoBelgium);
        Button trivQuestionTwoFrance = (Button) findViewById(R.id.trivQuestionTwoFrance);
        Button trivQuestionTwoJapan = (Button) findViewById(R.id.trivQuestionTwoJapan);
        trivQuestionTwoChina.setOnClickListener(v1 -> openCorrectAnswer2());
        trivQuestionTwoBelgium.setOnClickListener(v1 -> openWrongAnswer2());
        trivQuestionTwoFrance.setOnClickListener(v1 -> openWrongAnswer2());
        trivQuestionTwoJapan.setOnClickListener(v1 -> openWrongAnswer2());
    }
    public void openWrongAnswer2() {
        Intent intent = new Intent(this, WrongAnswer2.class);
        startActivity(intent);
    }
    public void openCorrectAnswer2() {
        Intent intent = new Intent(this, CorrectAnswer2.class);
        startActivity(intent);
    }
}