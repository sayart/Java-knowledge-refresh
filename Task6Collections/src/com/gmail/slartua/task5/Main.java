package com.gmail.slartua.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        list.add(new Human("Artem", 31));
        list.add(new Human("Petya", 18));
        list.add(new Human("Misha", 30));
        list.add(new Human("Vasia", 25));

        System.out.println("Befor sorting");
        for( Human human: list)
            System.out.println(human);

        Collections.sort(list);
        System.out.println("After sorting by age");
        for( Human human: list)
            System.out.println(human);
    }
}
