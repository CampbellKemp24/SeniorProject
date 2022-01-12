package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class PersonalityQuestion3 extends AppCompatActivity {

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

        int currentExtrovertCount = ApplicationContext.getInstance().getExtrovertCount();
        currentExtrovertCount++;
        ApplicationContext.getInstance().setExtrovertCount(currentExtrovertCount);

        Intent intent = new Intent(this, PersonalityQuestion4.class);
        startActivity(intent);
    }
    public void openPersonalityQuestion4i() {

        int currentIntrovertCount = ApplicationContext.getInstance().getIntrovertCount();
        currentIntrovertCount++;
        ApplicationContext.getInstance().setIntrovertCount(currentIntrovertCount);

        Intent intent = new Intent(this, PersonalityQuestion4.class);
        startActivity(intent);
    }
}