package com.example.oopformula1quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String chosenLevelName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button easy = findViewById(R.id.easyButton);
        final Button medium = findViewById(R.id.mediumButton);
        final Button hard = findViewById(R.id.hardButton);
        final Button start = findViewById(R.id.startButton);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chosenLevelName = "easy";

                easy.setBackgroundResource(R.drawable.roundedstroke);
                medium.setBackgroundResource(R.drawable.rounded2);
                hard.setBackgroundResource(R.drawable.rounded3);
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chosenLevelName = "medium";

                medium.setBackgroundResource(R.drawable.roundedstroke2);
                easy.setBackgroundResource(R.drawable.rounded);
                hard.setBackgroundResource(R.drawable.rounded3);
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chosenLevelName = "hard";

                hard.setBackgroundResource(R.drawable.roundedstroke3);
                medium.setBackgroundResource(R.drawable.rounded2);
                easy.setBackgroundResource(R.drawable.rounded);
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chosenLevelName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please select level!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this,QuizActivity.class );
                    intent.putExtra("chosenLevel", chosenLevelName);
                    startActivity(intent);
                }
            }
        });
    }
}