package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class personalityresulte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalityresulte);
        Button extrovertReturnButton = findViewById(R.id.extrovertReturnButton);
        extrovertReturnButton.setOnClickListener(v1 -> extrovertReturnButton());
    }
    public void extrovertReturnButton() {
        ApplicationContext.getInstance().backToZeroPersonality();
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
}