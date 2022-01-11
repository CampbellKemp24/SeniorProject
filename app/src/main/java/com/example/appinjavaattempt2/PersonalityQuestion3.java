package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class PersonalityQuestion3 extends AppCompatActivity {
    int extrovertCount;
    int introvertCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_question3);
        Button persQuestionThreeFalse = findViewById(R.id.persQuestionThreeFalse);
        Button persQuestionThreeTrue = findViewById(R.id.persQuestionThreeTrue);
        persQuestionThreeFalse.setOnClickListener(v1 -> openPersonalityQuestion4i());
        persQuestionThreeTrue.setOnClickListener(v1 -> openPersonalityQuestion4e());
    }

    public void openPersonalityQuestion4e() {
        this.extrovertCount++;
        Intent intent = new Intent(this, PersonalityQuestion4.class);
        startActivity(intent);
    }
    public void openPersonalityQuestion4i() {
        this.introvertCount++;
        Intent intent = new Intent(this, PersonalityQuestion4.class);
        startActivity(intent);
    }
}