package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TriviaQuestion3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia_question3);

        Button trivQuestionThree70 = (Button) findViewById(R.id.trivQuestionThree70);
        Button trivQuestionThree120 = (Button) findViewById(R.id.trivQuestionThree120);
        Button trivQuestionThree30 = (Button) findViewById(R.id.trivQuestionThree30);
        Button persQuestionThree15 = (Button) findViewById(R.id.persQuestionThree15);
        trivQuestionThree30.setOnClickListener(v1 -> openCorrectAnswer3());
        trivQuestionThree70.setOnClickListener(v1 -> openWrongAnswer3());
        persQuestionThree15.setOnClickListener(v1 -> openWrongAnswer3());
        trivQuestionThree120.setOnClickListener(v1 -> openWrongAnswer3());
    }
    public void openWrongAnswer3() {
        Intent intent = new Intent(this, WrongAnswer3.class);
        startActivity(intent);
    }
    public void openCorrectAnswer3() {
        Intent intent = new Intent(this, CorrectAnswer3.class);
        startActivity(intent);
    }
}