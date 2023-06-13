package com.gmail.slartua.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows to draw triangle");

        int raws = sc.nextInt();

        for (int i = 0; i < raws; i++) {
            for (int j = 0; j < raws * 2 - 1; j++) {
                if (j >= raws - 1 - i && j < raws + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
