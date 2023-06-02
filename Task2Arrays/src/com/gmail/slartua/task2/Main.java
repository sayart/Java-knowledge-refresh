package com.gmail.slartua.task2;

public class Main {
    public static void main(String[] args) {
        int[] array = {12, 213, 12, 43, 657, 32, 4};
        int sum = 0;
        for (int i : array)
            sum += i;
        double average = (double) sum / array.length;
        System.out.print("Average =  ");
        System.out.printf("%.2f", average);
    }
}
