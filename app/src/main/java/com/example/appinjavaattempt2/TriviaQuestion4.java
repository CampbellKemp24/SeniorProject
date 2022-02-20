package com.example.appinjavaattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TriviaQuestion4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia_question4);

        Button trivQuestionFourHyperTextProtocol = (Button) findViewById(R.id.trivQuestionFourHyperTextProtocol);
        Button trivQuestionFourHypertextTransferProcess = (Button) findViewById(R.id.trivQuestionFourHypertextTransferProcess);
        Button trivQuestionFourHypertextTransmissionProtocol = (Button) findViewById(R.id.trivQuestionFourHypertextTransmissionProtocol);
        Button trivQuestionFourHypertextTransferProtocol = (Button) findViewById(R.id.trivQuestionFourHypertextTransferProtocol);
        trivQuestionFourHypertextTransferProtocol.setOnClickListener(v1 -> openCorrectAnswer4());
        trivQuestionFourHyperTextProtocol.setOnClickListener(v1 -> openWrongAnswer4());
        trivQuestionFourHypertextTransferProcess.setOnClickListener(v1 -> openWrongAnswer4());
        trivQuestionFourHypertextTransmissionProtocol.setOnClickListener(v1 -> openWrongAnswer4());
    }
    public void openWrongAnswer4() {
        Intent intent = new Intent(this, WrongAnswer4.class);
        startActivity(intent);
    }
    public void openCorrectAnswer4() {
        Intent intent = new Intent(this, CorrectAnswer4.class);
        startActivity(intent);
    }
}