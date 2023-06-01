package com.gmail.slartua.task2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.2, 9.1);
        Circle circle = new Circle(4.9);

        System.out.println("Rectangle area = " + rectangle.calculateArea());
        System.out.printf("Circle area = %.2f", circle.calculateArea());
    }
}

