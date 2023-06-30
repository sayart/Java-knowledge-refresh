package com.gmail.slartua.task1;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            list.add((int) (Math.random() * (100 - 1) + 1));
        for (int i : list)
            System.out.print(i + " ");
        System.out.println();
        int maxElement = Collections.max(list);
        System.out.println("Max element: " + maxElement);

    }
}