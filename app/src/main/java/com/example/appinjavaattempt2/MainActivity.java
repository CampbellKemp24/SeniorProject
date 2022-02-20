package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button homeScreenButtonPersonality = (Button) findViewById(R.id.homescreenbuttonpersonality);
        Button homeScreenButtonTrivia = (Button) findViewById(R.id.homescreenbuttontrivia);
        homeScreenButtonPersonality.setOnClickListener(v1 -> openPersonalityQuestion1());
        homeScreenButtonTrivia.setOnClickListener(v1 -> openTriviaQuestion1());
    }
    public void openPersonalityQuestion1() {
        Intent intent = new Intent(this, TriviaQuestion1.class);
        startActivity(intent);
    }
    public void openTriviaQuestion1() {
        Intent intent = new Intent(this, TriviaQuestion1.class);
        startActivity(intent);
    }
}