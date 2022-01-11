package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PersonalityQuestion2 extends AppCompatActivity {
    int introvertCount;
    int extrovertCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_question2);
        Button persQuestionTwoHappy = findViewById(R.id.persQuestionTwoOverwhelmed);
        Button persQuestionTwoOverwhelmed = findViewById(R.id.persQuestionTwoHappy);
        persQuestionTwoHappy.setOnClickListener(v1 -> openPersonalityQuestion3e());
        persQuestionTwoOverwhelmed.setOnClickListener(v1 -> openPersonalityQuestion3i());
    }

    public void openPersonalityQuestion3e() {
        this.extrovertCount++;
        Intent intent = new Intent(this, PersonalityQuestion3.class);
        startActivity(intent);
    }
    public void openPersonalityQuestion3i() {
        this.introvertCount++;
        Intent intent = new Intent(this, PersonalityQuestion3.class);
        startActivity(intent);
    }
}