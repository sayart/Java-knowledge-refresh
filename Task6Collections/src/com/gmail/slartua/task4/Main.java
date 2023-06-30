package com.gmail.slartua.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] words = text.split("\\s+");

        Map<String, Integer> wordsMap = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();

            if (!word.isEmpty()) {
                int count = wordsMap.getOrDefault(word, 0);
                wordsMap.put(word, count + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);
        }
    }
}
