package com.gmail.slartua.task3;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number from -2,147,483,648 to 2,147,483,647");
        int num1 = sc.nextInt();

        System.out.println("Enter second number from -2,147,483,648 to 2,147,483,647");
        int num2 = sc.nextInt();

        System.out.println("Enter first number from -2,147,483,648 to 2,147,483,647");
        int num3 = sc.nextInt();

        int max = num1;
        if (num2 > max)
            max = num2;
        if (num3 > max)
            max = num3;

        System.out.println("Max number = " + max);
    }
}
