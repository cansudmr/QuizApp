package com.example.oopformula1quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        final Button startNewButton = findViewById(R.id.startNew);
        TextView trueAnswer = (TextView) findViewById(R.id.correctAnswers);
        final TextView wrongAnswer = findViewById(R.id.incorrectAnswers);

        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        final int getWrongAnswers = getIntent().getIntExtra("wrong", 0);

        trueAnswer.setText("Correct Answers:" + String.valueOf(getCorrectAnswers));

        wrongAnswer.setText(" Wrong Answers: "+String.valueOf(getWrongAnswers));

        startNewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Results.this, MainActivity.class ));
                finish();
            }
        });

    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(Results.this, MainActivity.class ));
        finish();
    }




}