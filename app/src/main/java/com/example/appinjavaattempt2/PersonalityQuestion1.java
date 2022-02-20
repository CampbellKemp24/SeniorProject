package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PersonalityQuestion1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ApplicationContext context = ApplicationContext.getInstance();
        context.setExtrovertCount(0);
        context.setIntrovertCount(0);

        Button persQuestionOneNo = findViewById(R.id.persQuestionOneNo);
        Button persQuestionOneYes = findViewById(R.id.persQuestionOneYes);
        persQuestionOneYes.setOnClickListener(v1 -> openPersonalityQuestion2i());
        persQuestionOneNo.setOnClickListener(v1 -> openPersonalityQuestion2e());
    }

    public void openPersonalityQuestion2e() {
        ApplicationContext.getInstance().incrementExtrovertCount();

        Intent intent = new Intent(this, PersonalityQuestion2.class);
        startActivity(intent);
    }
    public void openPersonalityQuestion2i() {
        ApplicationContext.getInstance().incrementIntrovertCount();

        Intent intent = new Intent(this, PersonalityQuestion2.class);
        startActivity(intent);
    }
}


