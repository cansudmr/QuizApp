package com.example.oopformula1quizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionData {

    private static List<QuestionList> easyQuizQuestions(){
        final List<QuestionList> questionsLists = new ArrayList<>();

        final QuestionList q1 = new QuestionList("Which driver has the most wins?", "Lewis Hamilton", "Michael Schumacher", "Sebastian Vettel", "Fernando Alonso", "Lewis Hamilton", "");
        final QuestionList q2 = new QuestionList("How many championship does Lewis Hamilton have?", "4", "7", "8", "6", "7","");
        final QuestionList q3 = new QuestionList("How many championships does Niki Lauda have?", "0", "1", "2","3", "2", "");
        final QuestionList q4 = new QuestionList("Who is Ferrari’s last champion?", "Fernando Alonso", "Kimi Raikkonen", "Felipe Massa", "Michael Schumacher", "Kimi Raikkonen", "");
        final QuestionList q5 = new QuestionList("Who is Mclaren’s last winner?", "Lando Norris", "Jenson Button", "Daniel Ricciardo", "Fernando Alonso", "Daniel Ricciardo", "");
        final QuestionList q6 = new QuestionList("Who won the 2016 World Drivers Championship?", "Nico Rosberg", "Daniel Ricciardo", "Lewis Hamilton", "Sebastian Vettel", "Nico Rosberg", "");
        final QuestionList q7 = new QuestionList("Who won the 2021 Turkish Grand Prix?", "Lewis Hamilton", "Max Verstappen", "Valtteri Bottas", "Sergio Perez", "Valtteri Bottas", "" );
        final QuestionList q8 = new QuestionList("How many podiums does Nico Hulkenberg have?", "12", "8", "3", "0", "0", "");
        final QuestionList q9 = new QuestionList("Which team has the most wins in F1 history?", "McLaren", "Williams", "Ferrari", "Mercedes", "Ferrari", "");
        final QuestionList q10 = new QuestionList("Who is the Formula 1’s official tyre supplier at the moment?", "Bridgestone", "Pirelli", "Michelin", "Dunlop", "Pirelli", "");

        questionsLists.add(q1);
        questionsLists.add(q2);
        questionsLists.add(q3);
        questionsLists.add(q4);
        questionsLists.add(q5);
        questionsLists.add(q6);
        questionsLists.add(q7);
        questionsLists.add(q8);
        questionsLists.add(q9);
        questionsLists.add(q10);

        return questionsLists;

    }


    private static List<QuestionList> mediumQuizQuestions(){
        final List<QuestionList> questionsLists = new ArrayList<>();

        final QuestionList q1 = new QuestionList("Who has the most consecutive race starts?", "Daniel Ricciardo", "Lewis Hamilton", "Sebastian Vettel", "Fernando Alonso", "Lewis Hamilton", "");
        final QuestionList q2 = new QuestionList("Who is the only driver other than 2 Mercedes drivers that win a race in 2014?", "Sebastian Vettel", "Daniel Ricciardo", "Valtteri Bottas", "Fernando Alonso", "Daniel Ricciardo","");
        final QuestionList q3 = new QuestionList("Who has the most race starts?", "Fernando Alonso", "Kimi Raikkonen", "Lewis Hamilton","Michael Schumacher", "Fernando Alonso", "");
        final QuestionList q4 = new QuestionList("Which of the below is not a street circuit? ", "Albert Park Circuit(Australia)", "Baku City Circuit", "Circuit Gilles-Villeneuve(Canada)", "Autodromo Enzo e Dino Ferrari(Imola)", "Autodromo Enzo e Dino Ferrari(Imola)", "");
        final QuestionList q5 = new QuestionList("Which driver’s nickname is Honey Badger?", "Lando Norris", "Charles Leclerc", "Daniel Ricciardo", "Alex Albon", "Daniel Ricciardo", "");
        final QuestionList q6 = new QuestionList("Which of the following includes the 2019, 2020 and 2021 Monza winners, respectively?", "Leclerc, Gasly, Norris", "Vettel, Leclerc, Ricciardo", "Bottas, Verstappen, Hamilton", "Leclerc, Gasly, Ricciardo", "Leclerc, Gasly, Ricciardo", "");
        final QuestionList q7 = new QuestionList("How many points are awarded to the race winner of each Grand Prix?", "10", "15", "20", "25", "25", "" );
        final QuestionList q8 = new QuestionList("Which color flag during an F1 race indicates that the faster cars need to pass as they are being lapped?", "blue", "red", "green", "orange", "blue", "");
        final QuestionList q9 = new QuestionList("Who is the oldest F1 race winner?", "Alain Prost", "Kimi Raikkonen", "Juan Fangio", "Jim Clark", "Juan Fangio", "");
        final QuestionList q10 = new QuestionList("Who won the 2016 Monaco Grand Prix?", "Daniel Ricciardo", "Lewis Hamilton", "Sergio Perez", "Nico Rosberg", "Lewis Hamilton", "");

        questionsLists.add(q1);
        questionsLists.add(q2);
        questionsLists.add(q3);
        questionsLists.add(q4);
        questionsLists.add(q5);
        questionsLists.add(q6);
        questionsLists.add(q7);
        questionsLists.add(q8);
        questionsLists.add(q9);
        questionsLists.add(q10);

        return questionsLists;

    }


    private static List<QuestionList> hardQuizQuestions(){
        final List<QuestionList> questionsLists = new ArrayList<>();

        final QuestionList q1 = new QuestionList("How many parts are there in an F1 car?", "5000", "12000", "80000", "45000", "80000", "");
        final QuestionList q2 = new QuestionList("Which country hosted the first World Championship Grand Prix?", "Italy", "Britain", "Turkey", "France", "Britain","");
        final QuestionList q3 = new QuestionList("What is the halo made from? ", "Titanium", "Steel ", "Gold","Iron", "Titanium", "");
        final QuestionList q4 = new QuestionList("What year was the halo introduced?", "2020", "2015", "2018", "2017", "2018", "");
        final QuestionList q5 = new QuestionList("Who won the first Formula One World Driver's Championship?", "Juan Fangio", "Alberto Ascari", "Mike Hawtorn", "Giuseppe Farina", "Giuseppe Farina", "");
        final QuestionList q6 = new QuestionList("Who has the most consecutive wins and with how many wins?", "Sebastian Vettel-9", "Sebastian Vettel-11 ", "Nico Rosberg-7 ", "Lewis Hamilton-9", "Sebastian Vettel-9", "");
        final QuestionList q7 = new QuestionList("Where was the first Formula One race held at night? ", "Bahrain", "Abu Dhabi", "Singapore", "Jeddah", "Singapore", "" );
        final QuestionList q8 = new QuestionList("Who is the only woman to get points in an F1 World Championship race?", "Desire Wilson", "Susie Wolff", "Lella Lombardi", "Maria Teresa de Filippis", "Lella Lombardi", "");
        final QuestionList q9 = new QuestionList("Which movie was made about Niki Lauda’s racing career?", "Lauda", "Rush", "Crash", "Champion", "Rush", "");
        final QuestionList q10 = new QuestionList("Which circuit has a straight named Hamilton Straigth?", "Silverstone ", "Monza ", "Bahrain", "Albert Park", "Silverstone ", "");

        questionsLists.add(q1);
        questionsLists.add(q2);
        questionsLists.add(q3);
        questionsLists.add(q4);
        questionsLists.add(q5);
        questionsLists.add(q6);
        questionsLists.add(q7);
        questionsLists.add(q8);
        questionsLists.add(q9);
        questionsLists.add(q10);

        return questionsLists;

    }


    public static List<QuestionList> getQuestions(String chosenLevelName){
        switch(chosenLevelName){
            case "medium":
                return mediumQuizQuestions();
            case "hard":
                return hardQuizQuestions();
            default:
                return easyQuizQuestions();
        }
    }






}
