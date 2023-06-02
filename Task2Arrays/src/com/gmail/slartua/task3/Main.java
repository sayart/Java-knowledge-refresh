package com.gmail.slartua.task3;

public class Main {
    public static void main(String[] args) {
        int[] array = {12, 213, 12, 43, 657, 32, 4, 7, 9};
        System.out.println("First array:");
        for (int i : array)
            System.out.print(i + " ");

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.println();
        System.out.println("Reverse array:");
        for (int i : array)
            System.out.print(i + " ");
    }
}
