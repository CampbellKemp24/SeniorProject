package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PersonalityQuestion6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_question6);
        Button persQuestionSixAlone = findViewById(R.id.persQuestionSixAlone);
        Button persQuestionSixGroup = findViewById(R.id.persQuestionSixGroup);
        persQuestionSixAlone.setOnClickListener(v1 -> openresulti());
        persQuestionSixGroup.setOnClickListener(v1 -> openresulte());

    }
    public void openresulti() {
        int currentIntrovertCount = ApplicationContext.getInstance().getIntrovertCount();
        currentIntrovertCount++;
        ApplicationContext.getInstance().setIntrovertCount(currentIntrovertCount);

        int currentExtrovertCount = ApplicationContext.getInstance().getExtrovertCount();

        if(currentExtrovertCount > currentIntrovertCount) {
            Intent intent = new Intent(this, personalityresulte.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this, personalityresulti.class);
            startActivity(intent);
        }
    }
    public void openresulte() {
        ApplicationContext.getInstance().incrementExtrovertCount();

        if( ApplicationContext.getInstance().getExtrovertCount() > ApplicationContext.getInstance().getIntrovertCount()) {
            Intent intent = new Intent(this, personalityresulte.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this, personalityresulti.class);
            startActivity(intent);
        }
    }
}