package com.crashcourse.questionone;

import java.util.Random;

public class Question1 {

    // Final Keyword marked a variable as constant
    public static final int MIN_PASSWORD_LENGTH = 8;
    public static final int MAX_PASSWORD_LENGTH = 14;
    public static final String POSSIBLE_CHARACTER = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#?]";

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println(generatePassword());
        }
    }

    private static String generatePassword() {
        String password = "";
        int passwordLength = (int) Math.floor(Math.random() * (MAX_PASSWORD_LENGTH - MIN_PASSWORD_LENGTH + 1) + MIN_PASSWORD_LENGTH);
        for (int i = 0; i < passwordLength - 1; i++) {
            Random random = new Random();
            int index = random.nextInt(POSSIBLE_CHARACTER.length()) - 1;
            password = password + POSSIBLE_CHARACTER.charAt(index);
        }
        return password;
    }
}
