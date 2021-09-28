package com.crashcourse.questionsix;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("Area of rectangle 1: " + 4*5);
        System.out.println("Area of rectangle 2: " + 5*8);

        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(5,8);

        System.out.println(r1.calculateArea());
        System.out.println(r2.calculateArea());



    }
}
