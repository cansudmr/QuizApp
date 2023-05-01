package com.example.oopformula1quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TimeOverResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_over_result);

        final Button startNewBtn = findViewById(R.id.startNewTimeOver);

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TimeOverResult.this, MainActivity.class ));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(TimeOverResult.this, MainActivity.class ));
        finish();
    }
}