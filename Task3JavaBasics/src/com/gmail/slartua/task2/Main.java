package com.gmail.slartua.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter score 1 - 100:");
        int score = sc.nextInt();

        String grade;

        if (score >= 90)
            grade = "A";
        else if (score >= 80)
            grade = "B";
        else if (score >= 70)
            grade = "C";
        else if (score >= 60)
            grade = "D";
        else
            grade = "F";

        System.out.println("For score: "+ score +". The grade is: " + grade);
    }
}
