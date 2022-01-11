package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    int extrovertCount;
    int introvertCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        introvertCount= 0;
        extrovertCount= 0;
        Button persQuestionOneNo = findViewById(R.id.persQuestionOneNo);
        Button persQuestionOneYes = findViewById(R.id.persQuestionOneYes);
        persQuestionOneYes.setOnClickListener(v1 -> openPersonalityQuestion2i());
        persQuestionOneNo.setOnClickListener(v1 -> openPersonalityQuestion2e());
    }

    public void openPersonalityQuestion2e() {
        this.extrovertCount++;
        Intent intent = new Intent(this, PersonalityQuestion2.class);
        startActivity(intent);
    }
    public void openPersonalityQuestion2i() {
        this.introvertCount++;
        Intent intent = new Intent(this, PersonalityQuestion2.class);
        startActivity(intent);
    }
}


