package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PersonalityQuestion5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_question5);
        Button persQuestionSixAlone = findViewById(R.id.persQuestionSixAlone);
        Button persQuestionSixGroup = findViewById(R.id.persQuestionSixGroup);
        persQuestionSixAlone.setOnClickListener(v1 -> openresulti());
        persQuestionSixGroup.setOnClickListener(v1 -> openresulte());

    }
    public void openresulti() {
        ApplicationContext.getInstance().incrementIntrovertCount();

        if(ApplicationContext.getInstance().getExtrovertCount() > ApplicationContext.getInstance().getIntrovertCount()) {
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