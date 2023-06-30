package com.gmail.slartua.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++)
            set.add((int) (Math.random() * (10 - 1) + 1));
        for (int i : set)
            System.out.print(i + " ");

        Scanner sc = new Scanner(System.in);
        System.out.println("input number to find");
        int number = sc.nextInt();

        System.out.println("Number exist in list: " + set.contains(number));
    }
}
