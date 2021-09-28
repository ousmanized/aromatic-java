package com.crashcourse.questiontwo;

import java.util.Random;

public class Question2 {

    public static void main(String[] args) {
        int[] marks = new int[10];
        for (int i = 0; i < marks.length; i++) {
            Random random = new Random();
            marks[i] = random.nextInt(100);
        }

        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        System.out.println(sum/marks.length);


    }
}
