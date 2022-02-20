package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class WrongAnswer3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong_answer3);

        Button wrongNextQuestion3 = (Button) findViewById(R.id.wrongNextQuestion3);
        wrongNextQuestion3.setOnClickListener(v1 -> openTriviaQuestion4());
    }
    public void openTriviaQuestion4() {
        Intent intent = new Intent(this, TriviaQuestion4.class);
        startActivity(intent);
    }
}