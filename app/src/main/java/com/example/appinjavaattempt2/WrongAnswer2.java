package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class WrongAnswer2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong_answer2);

        Button wrongNextQuestion2 = (Button) findViewById(R.id.wrongNextQuestion2);
        wrongNextQuestion2.setOnClickListener(v1 -> openTriviaQuestion3());
    }
    public void openTriviaQuestion3() {
        Intent intent = new Intent(this, TriviaQuestion3.class);
        startActivity(intent);
    }
}