package com.gmail.slartua.task1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = {12, 213, 12, 43, 657, 32, 4};
        int maxNumber = array[0];
        for (int i : array) {
            if(i > maxNumber)
                maxNumber = i;
        }

        System.out.println("Max namber in array = " + maxNumber);
    }
}