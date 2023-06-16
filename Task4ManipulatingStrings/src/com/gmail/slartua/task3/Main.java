package com.gmail.slartua.task3;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input line");
        String inputString = sc.nextLine();

        StringBuilder sb = new StringBuilder(inputString);
        Set<Character> characterSet = new LinkedHashSet<>();
        for (int i = 0; i < sb.length(); i++)
            characterSet.add(sb.charAt(i));

        for (char ch : characterSet)
            System.out.print(ch);
    }
}
