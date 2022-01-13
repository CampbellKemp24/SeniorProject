package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
public class PersonalityQuestion4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_question4);
        Button persQuestionFourFalse = findViewById(R.id.persQuestionFourFalse);
        Button persQuestionFourTrue = findViewById(R.id.persQuestionFourTrue);
        persQuestionFourTrue.setOnClickListener(v1 -> openPersonalityQuestion6e());
        persQuestionFourFalse.setOnClickListener(v1 -> openPersonalityQuestion6i());
    }

    public void openPersonalityQuestion6e() {

        ApplicationContext.getInstance().incrementExtrovertCount();

        Intent intent = new Intent(this, PersonalityQuestion6.class);
        startActivity(intent);
    }
    public void openPersonalityQuestion6i() {

        int currentIntrovertCount = ApplicationContext.getInstance().getIntrovertCount();
        currentIntrovertCount++;
        ApplicationContext.getInstance().setIntrovertCount(currentIntrovertCount);

        Intent intent = new Intent(this, PersonalityQuestion6.class);
        startActivity(intent);
    }
}