package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class WrongAnswer4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong_answer4);

        Button wrongNextQuestion4 = (Button) findViewById(R.id.wrongNextQuestion4);
        wrongNextQuestion4.setOnClickListener(v1 -> openTriviaQuestion5());
    }
    public void openTriviaQuestion5() {
        Intent intent = new Intent(this, TriviaQuestion5.class);
        startActivity(intent);
    }
}