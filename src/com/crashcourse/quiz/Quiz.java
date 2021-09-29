package com.crashcourse.quiz;

import java.io.*;
import java.util.*;

public class Quiz {

    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        int score = 0;
        try {
            File file = new File("C:\\Users\\wahid-ousman.rughony\\IdeaProjects\\aromatic-java\\quiz.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splits = line.split(";");
                questions.add(new Question(splits[0], splits[1]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.shuffle(questions);

        for (int i = 0; i < 10; i++) {
            System.out.println("What is the capital of " + questions.get(i).getCountry() + "?");
            List<String> possibleAnswers = generateListOfPossibleAnswer(questions.get(i).getCapital(), questions);
            for (int j = 0; j < possibleAnswers.size(); j++) {
                System.out.println((j + 1) + ": " + possibleAnswers.get(j));
            }
            System.out.println("");

            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();
            while (userInput < 1 || userInput > 4) {
                System.out.println("Please enter a number between 1 - 4");
                userInput = sc.nextInt();
            }

            if (questions.get(i).getCapital().equalsIgnoreCase(possibleAnswers.get(userInput - 1))) {
                score = score + 1;
            } else {
//                System.out.println("The capital of " + questions.get(i).getCountry() + " is " + questions.get(i).getCapital() + ".");
                System.out.println(String.format("The capital of %s is %s.", questions.get(i).getCountry(), questions.get(i).getCapital()));
            }
            System.out.println("");
        }
//        System.out.println("Your score is " + score + "/10.");
        System.out.println(String.format("Your score is %d/10.", score));
    }

    private static List<String> generateListOfPossibleAnswer(String capital, List<Question> questions) {
        List<String> answer = new ArrayList<>();
        answer.add(capital);
        for (int i = 0; i < 3; i++) {
            Random rand = new Random();
            int index = rand.nextInt(questions.size() - 11) + 10;
            answer.add(questions.get(index).getCapital());
        }
        Collections.shuffle(answer);
        return answer;
    }
}
