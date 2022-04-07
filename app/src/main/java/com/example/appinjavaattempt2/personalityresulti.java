package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class personalityresulti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalityresulti);
        Button introvertReturnButton = findViewById(R.id.introvertReturnButton);
        introvertReturnButton.setOnClickListener(v1 -> introvertReturnButton());
    }
    public void introvertReturnButton() {
        ApplicationContext.getInstance().backToZeroPersonality();
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
}