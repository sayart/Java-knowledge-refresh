package com.gmail.slartua.task1;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Input line for reverse");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuffer stringBuffer = new StringBuffer(input);
        StringBuilder stringBuilder = new StringBuilder(input);

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}