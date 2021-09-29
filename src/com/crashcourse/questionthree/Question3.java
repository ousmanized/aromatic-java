package com.crashcourse.questionthree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<String> colours = new ArrayList<>();
        colours.add("White");
        colours.add("Red");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Brown");
        colours.add("Cream");
        colours.add("Black");
        System.out.println(colours.size());
        System.out.println(colours.get(4));

        System.out.println("The unsorted list: " + colours);

        Collections.sort(colours);

        System.out.println("The sorted list: " + colours);

        colours.sort(Collections.reverseOrder());

        System.out.println("The descending sorted list: " + colours);


    }
}
