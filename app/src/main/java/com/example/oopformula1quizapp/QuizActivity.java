package com.example.oopformula1quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {

    private TextView questions;
    private TextView question;
    private Button option1, option2, option3, option4;
    private Button nextButton;
    private Timer quizTimer;

    private int totalTimeInMins = 1;
    private int seconds = 0;

    private List<QuestionList> questionList;

    private int currentQuestionPos = 0;

    private String selectedOptionByUser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final ImageView backButton = findViewById(R.id.backbtn);
        final TextView timer = findViewById(R.id.timer);
        final TextView chosenLevelName = findViewById(R.id.levelName);

        questions = findViewById(R.id.questions);
        question = findViewById(R.id.question);

        option1 = findViewById(R.id.opt1);
        option2 = findViewById(R.id.opt2);
        option3 = findViewById(R.id.opt3);
        option4 = findViewById(R.id.opt4);
        nextButton = findViewById(R.id.nextButton);

        final String getChosenLevelName = getIntent().getStringExtra("chosenLevel");

        chosenLevelName.setText(getChosenLevelName);
        questionList = QuestionData.getQuestions(getChosenLevelName);
        startTimer(timer);

        questions.setText((currentQuestionPos+1)+ "/" +questionList.size());
        question.setText(questionList.get(0).getQuestion());
        option1.setText(questionList.get(0).getAns1());
        option2.setText(questionList.get(0).getAns2());
        option3.setText(questionList.get(0).getAns3());
        option4.setText(questionList.get(0).getAns4());

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quizTimer.purge();
                quizTimer.cancel();

                startActivity(new Intent(QuizActivity.this, MainActivity.class));
                finish();
            }
        });

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option1.getText().toString();

                    option1.setBackgroundResource(R.drawable.roundred10);
                    option1.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionList.get(currentQuestionPos).setUserAnswer(selectedOptionByUser);
                }
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option2.getText().toString();

                    option2.setBackgroundResource(R.drawable.roundred10);
                    option2.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionList.get(currentQuestionPos).setUserAnswer(selectedOptionByUser);
                }
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option3.getText().toString();

                    option3.setBackgroundResource(R.drawable.roundred10);
                    option3.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionList.get(currentQuestionPos).setUserAnswer(selectedOptionByUser);
                }
            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option4.getText().toString();

                    option4.setBackgroundResource(R.drawable.roundred10);
                    option4.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionList.get(currentQuestionPos).setUserAnswer(selectedOptionByUser);
                }
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    Toast.makeText(QuizActivity.this, "Please choose an option first!", Toast.LENGTH_SHORT).show();
                }

                else{
                    loadNewQuestion();
                }
            }
        });



    }


    private void loadNewQuestion(){
        currentQuestionPos++;

        if((currentQuestionPos+1)==questionList.size()){
            nextButton.setText("Finish Quiz");
        }

        if(currentQuestionPos < questionList.size()){
            selectedOptionByUser = "";

            option1.setBackgroundResource(R.drawable.option_stroke);
            option1.setTextColor(Color.BLACK);

            option2.setBackgroundResource(R.drawable.option_stroke);
            option2.setTextColor(Color.BLACK);

            option3.setBackgroundResource(R.drawable.option_stroke);
            option3.setTextColor(Color.BLACK);

            option4.setBackgroundResource(R.drawable.option_stroke);
            option4.setTextColor(Color.BLACK);

            questions.setText((currentQuestionPos+1) +"/" +questionList.size());
            question.setText(questionList.get(currentQuestionPos).getQuestion());
            option1.setText(questionList.get(currentQuestionPos).getAns1());
            option2.setText(questionList.get(currentQuestionPos).getAns2());
            option3.setText(questionList.get(currentQuestionPos).getAns3());
            option4.setText(questionList.get(currentQuestionPos).getAns4());


        }

        else{
            Intent intent = new Intent(QuizActivity.this, Results.class);
            intent.putExtra("correct", getCorrectAnswers());
            intent.putExtra("wrong", getWrongAnswers());
            startActivity(intent);

            quizTimer.purge();
            quizTimer.cancel();


            finish();
        }
    }
    private void startTimer(TextView timerTextView) {
        quizTimer = new Timer();

        quizTimer.scheduleAtFixedRate(new TimerTask() {
            int totalTimeInSeconds = totalTimeInMins * 60;

            @Override
            public void run() {
                if (totalTimeInSeconds == 0) {
                    quizTimer.cancel();
                    finish();
                    startActivity(new Intent(QuizActivity.this, TimeOverResult.class));
                    return;
                }

                int minutes = totalTimeInSeconds / 60;
                int seconds = totalTimeInSeconds % 60;

                String formattedTime = String.format("%02d:%02d", minutes, seconds);

                runOnUiThread(() -> timerTextView.setText(formattedTime));

                totalTimeInSeconds--;
            }
        }, 0, 1000);
    }

    private int getCorrectAnswers(){
        int correctAnswers = 0;

        for(int i = 0; i < questionList.size(); i++){

            final String getUserAnswer = questionList.get(i).getUserAnswer();
            final String getAnswer = questionList.get(i).getAnswer();

            if(getUserAnswer.equals(getAnswer)){
                correctAnswers++;
            }

        }
        return correctAnswers;
    }

    private int getWrongAnswers(){
        int wrongAnswers = 0;

        for(int i = 0; i < questionList.size(); i++){

            final String getUserAnswer = questionList.get(i).getUserAnswer();
            final String getAnswer = questionList.get(i).getAnswer();

            if(!getUserAnswer.equals(getAnswer)){
                wrongAnswers++;
            }

        }
        return wrongAnswers;
    }

    @Override
    public void onBackPressed(){
        quizTimer.purge();
        quizTimer.cancel();

        startActivity(new Intent(QuizActivity.this, MainActivity.class));
        finish();
    }

    private void revealAnswer(){
        final String getCorrectAnswer = questionList.get(currentQuestionPos).getAnswer();

        if(option1.getText().toString().equals(getCorrectAnswer)){
            option1.setBackgroundResource(R.drawable.roundgreen10);
            option1.setTextColor(Color.WHITE);
        }

        else if(option2.getText().toString().equals(getCorrectAnswer)){
            option2.setBackgroundResource(R.drawable.roundgreen10);
            option2.setTextColor(Color.WHITE);
        }

        else if(option3.getText().toString().equals(getCorrectAnswer)){
            option3.setBackgroundResource(R.drawable.roundgreen10);
            option3.setTextColor(Color.WHITE);
        }

        else if(option4.getText().toString().equals(getCorrectAnswer)){
            option4.setBackgroundResource(R.drawable.roundgreen10);
            option4.setTextColor(Color.WHITE);
        }
    }


}