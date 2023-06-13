package com.gmail.slartua.task1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int year = 2000;
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeapYear = year % 400 == 0;
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}