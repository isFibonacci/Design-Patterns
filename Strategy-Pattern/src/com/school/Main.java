package com.school;
import school.assessment.FillIn;
import school.assessment.MultipleChoice;
import school.assessment.Question;
import school.assessment.Quiz;
import java.util.Scanner;  // Import the Scanner class

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start testing...");
        Quiz quiz = new Quiz();
        ArrayList<String> answers = new ArrayList<>();

        // ----------------------- Question1 -----------------------
        ArrayList<String> question1Array = new ArrayList<String>();
        question1Array.add("Asia");
        question1Array.add("Africa");
        question1Array.add("Europe");
        String question1String = "On which continent is the country of India?";
        String question1Ans = "Asia";
        Question question1 = new MultipleChoice(question1String, question1Array, question1Ans);
        quiz.add(question1);

        // ----------------------- Question2 -----------------------
        String question2String = "CUESB is in the city of _______";
        String question2Ans = "Hayward";
        Question question2 = new FillIn(question2String, question2Ans);
        quiz.add(question2);

        // ----------------------- Answer the question -------------
        System.out.println("Question 1...");
        System.out.println( question1.toString());
        System.out.println("Your answer is");
        Scanner userInput1 = new Scanner(System.in);
        String myAns1 = userInput1.nextLine();
        answers.add(myAns1);

        System.out.println("Question 2...");
        System.out.println( question2.toString());
        System.out.println("Your answer is");
        Scanner userInput2 = new Scanner(System.in);
        String myAns2 = userInput2.nextLine();
        answers.add(myAns2);

        System.out.println("Your Garde is ");
        System.out.println(quiz.grade(answers));
    }
}
