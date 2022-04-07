package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);

        Button homeScreenButtonPersonality = findViewById(R.id.homescreenbuttonpersonality);
        Button homeScreenButtonTrivia = findViewById(R.id.homescreenbuttontrivia);
        Button homeScreenButtonMath = findViewById(R.id.homescreenbuttonmath);
        homeScreenButtonPersonality.setOnClickListener(v1 -> openPersonalityQuestion1());
        homeScreenButtonTrivia.setOnClickListener(v1 -> openTriviaQuestion1());
        homeScreenButtonMath.setOnClickListener(v1 -> openMathQuiz());
    }
    public void openPersonalityQuestion1() {
        Intent intent = new Intent(this, PersonalityQuestion1.class);
        startActivity(intent);
    }
    public void openTriviaQuestion1() {
        Intent intent = new Intent(this, TriviaQuestion1.class);
        startActivity(intent);
    }
    public void openMathQuiz() {
        Intent intent = new Intent(this, MathQuiz.class);
        startActivity(intent);
    }
}