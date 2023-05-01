package com.example.oopformula1quizapp;

public class QuestionList {

    private String question, ans1, ans2, ans3, ans4, answer, userAnswer;

    public QuestionList(String question, String ans1, String ans2, String ans3, String ans4, String answer, String userAnswer) {
        this.question = question;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
        this.answer = answer;
        this.userAnswer = userAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public String getAns1() {
        return ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public String getAnswer() {
        return answer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }
}
