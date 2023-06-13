package com.gmail.slartua.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of a circle:");
        double radius = (double) sc.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        System.out.print("Area of the circle: ");
        System.out.printf("%.2f", area);
    }
}
