package com.gmail.slartua.task3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(32);
        person.setName("Artem");
        person.setAdress("Zagreb, Croatia");
        System.out.println(person.getName() + ", age " + person.getAge() + ", adress: " + person.getAdress());
    }
}
