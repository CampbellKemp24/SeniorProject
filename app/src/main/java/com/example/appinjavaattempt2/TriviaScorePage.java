package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class TriviaScorePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia_score_page);

        Button triviaReturn = findViewById(R.id.triviaReturn);
        triviaReturn.setOnClickListener(v1 -> triviaOpenMainActivity());
        Button triviaDisplayScore = findViewById(R.id.triviaDisplayScore);
        triviaDisplayScore.setOnClickListener(v1 ->changeText());

    }

    public void changeText() {
        if(TriviaApplicationContext.getInstance().getTriviaScore() == 0) {
            TextView displayTriviaScore = findViewById(R.id.displayTriviaScore);
            displayTriviaScore.setText(getString(R.string.zero));
        }
        if(TriviaApplicationContext.getInstance().getTriviaScore() == 1) {
            TextView displayTriviaScore = findViewById(R.id.displayTriviaScore);
            displayTriviaScore.setText(getString(R.string.one));
        }
        if(TriviaApplicationContext.getInstance().getTriviaScore() == 2) {
            TextView displayTriviaScore = findViewById(R.id.displayTriviaScore);
            displayTriviaScore.setText(getString(R.string.two));
        }
        if(TriviaApplicationContext.getInstance().getTriviaScore() == 3) {
            TextView displayTriviaScore = findViewById(R.id.displayTriviaScore);
            displayTriviaScore.setText(getString(R.string.three));
        }
        if(TriviaApplicationContext.getInstance().getTriviaScore() == 4) {
            TextView displayTriviaScore = findViewById(R.id.displayTriviaScore);
            displayTriviaScore.setText(getString(R.string.four));
        }
        if(TriviaApplicationContext.getInstance().getTriviaScore() == 5) {
            TextView displayTriviaScore = findViewById(R.id.displayTriviaScore);
            displayTriviaScore.setText(getString(R.string.five));
        }
    }

    public void triviaOpenMainActivity() {
        TriviaApplicationContext.getInstance().backToZeroTrivia();
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
}