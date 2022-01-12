package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Since this is the first question screen,
        //let's reset the contexts to 0 for both introvert and exterovert
        ApplicationContext context = ApplicationContext.getInstance();
        context.setExtrovertCount(0);
        context.setIntrovertCount(0);

        Button persQuestionOneNo = findViewById(R.id.persQuestionOneNo);
        Button persQuestionOneYes = findViewById(R.id.persQuestionOneYes);
        persQuestionOneYes.setOnClickListener(v1 -> openPersonalityQuestion2i());
        persQuestionOneNo.setOnClickListener(v1 -> openPersonalityQuestion2e());
    }

    public void openPersonalityQuestion2e() {
        int currentExtrovertCount = ApplicationContext.getInstance().getExtrovertCount();
        currentExtrovertCount++;
        ApplicationContext.getInstance().setExtrovertCount(currentExtrovertCount);

        Intent intent = new Intent(this, PersonalityQuestion2.class);
        startActivity(intent);
    }
    public void openPersonalityQuestion2i() {
        int currentIntrovertCount = ApplicationContext.getInstance().getIntrovertCount();
        currentIntrovertCount++;
        ApplicationContext.getInstance().setIntrovertCount(currentIntrovertCount);

        Intent intent = new Intent(this, PersonalityQuestion2.class);
        startActivity(intent);
    }
}


