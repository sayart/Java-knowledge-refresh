package com.gmail.slartua.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1");
        String stringOne = sc.nextLine();

        System.out.println("Enter String 2");
        String stringTwo = sc.nextLine();

        System.out.println(stringOne + stringTwo);
    }
}
