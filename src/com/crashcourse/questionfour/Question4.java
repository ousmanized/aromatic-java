package com.crashcourse.questionfour;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        System.out.println("input your date");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        sc.close();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
            Date date = sdf.parse(userInput);
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            System.out.println(getDayFromDayOfTheWeek(c.get(Calendar.DAY_OF_WEEK)));
        } catch (ParseException e){
            System.out.println("Parse error");
        }
    }

    public static String getDayFromDayOfTheWeek(int dayOfTheWeek) {
        String day = "";
        switch (dayOfTheWeek) {
            case 1:
                day = "SUNDAY";
                break;
            case 2:
                day = "MONDAY";
                break;
            case 3:
                day = "TUESDAY";
                break;
            case 4:
                day = "WEDNESDAY";
                break;
            case 5:
                day = "THURSDAY";
                break;
            case 6:
                day = "FRIDAY";
                break;
            case 7:
                day = "SATURDAY";
                break;
            default:
                day = "NO DAY";
                break;
        }
        return day;
    }
}