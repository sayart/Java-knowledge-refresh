package com.gmail.slartua.task1;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number 1");
        int number1 = sc.nextInt();

        System.out.println("Input number 2");
        int number2 = sc.nextInt();

        try{
            System.out.println("result " + number1 / number2);
        } catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        } finally {
            System.out.println("That code will be anyway");
        }
    }



}