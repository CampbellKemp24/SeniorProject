package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TriviaQuestion5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia_question5);

        Button trivQuestionFiveP = (Button) findViewById(R.id.trivQuestionFiveP);
        Button trivQuestionFiveK = (Button) findViewById(R.id.trivQuestionFiveK);
        Button trivQuestionFiveAr = (Button) findViewById(R.id.trivQuestionFiveAr);
        Button trivQuestionFiveSi = (Button) findViewById(R.id.trivQuestionFiveSi);
        trivQuestionFiveK.setOnClickListener(v1 -> openCorrectAnswer5());
        trivQuestionFiveP.setOnClickListener(v1 -> openWrongAnswer5());
        trivQuestionFiveAr.setOnClickListener(v1 -> openWrongAnswer5());
        trivQuestionFiveSi.setOnClickListener(v1 -> openWrongAnswer5());
    }
    public void openWrongAnswer5() {
        Intent intent = new Intent(this, WrongAnswer5.class);
        startActivity(intent);
    }
    public void openCorrectAnswer5() {
        Intent intent = new Intent(this, CorrectAnswer5.class);
        startActivity(intent);
    }
}