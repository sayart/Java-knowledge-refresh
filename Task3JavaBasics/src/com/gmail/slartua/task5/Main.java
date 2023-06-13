package com.gmail.slartua.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first variable:");
        int var1 = sc.nextInt();

        System.out.println("Enter second variable:");
        int var2 = sc.nextInt();

        System.out.println("Before swapping: var_1: " + var1 + ", var_2: " + var2);

        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;

        System.out.println("After swapping: var_1: " + var1 + ", var_2: " + var2);
    }
}
