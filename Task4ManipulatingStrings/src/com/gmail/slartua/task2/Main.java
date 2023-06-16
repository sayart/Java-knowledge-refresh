package com.gmail.slartua.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input line");
        String inputString = sc.nextLine();
        System.out.println("Input char to find");
        char inputChar = sc.next().charAt(0);

        StringBuilder sb = new StringBuilder(inputString);
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (inputString.charAt(i) == inputChar)
                count++;
        }
        System.out.println("'" + inputChar + "' found " + count + " times");

    }
}
