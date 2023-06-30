package com.gmail.slartua.task3;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        // Enqueue elements to the Queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
        queue.add("Mango");

        // Dequeue and print the elements
        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println(element);
        }
    }
}
