package com.crashcourse.game;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("----------WELCOME TO PAPER, ROCK & SCISSORS----------------");
        System.out.println("-----------------------------------------------------------");

        Scanner sc = new Scanner(System.in);
        boolean gameOn = true;
        while (gameOn) {
            System.out.println("Enter one of the following");
            System.out.println("1:Paper\n2:Rock\n3:Scissors\n4:Quit");
            int userInput = sc.nextInt();

            if (userInput == 4) {
                gameOn = false;
                break;
            }

            Random random = new Random();
            int computerInput = random.nextInt(3) + 1;
            if (computerInput == 1) {
                System.out.println("The computer chooses Paper");
            } else if (computerInput == 2) {
                System.out.println("The computer chooses Rock");
            } else if (computerInput == 3) {
                System.out.println("The computer chooses Scissors");
            }

            whoWin(userInput, computerInput);
            System.out.println("");
        }


        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------THE END-----------------------");
        System.out.println("-----------------------------------------------------------");

    }

    private static void whoWin(int myMove, int computerMove) {
        if (myMove == computerMove) {
            System.out.println("It's a draw");
        } else if (myMove == 2 && computerMove == 3) {
            System.out.println("You win");
        } else if (myMove == 2 && computerMove == 1) {
            System.out.println("The computer wins");
        } else if (myMove == 3 && computerMove == 2) {
            System.out.println("The computer wins");
        } else if (myMove == 3 && computerMove == 1) {
            System.out.println("You win");
        } else if (myMove == 1 && computerMove == 3) {
            System.out.println("The computer wins");
        } else if (myMove == 1 && computerMove == 2) {
            System.out.println("You win");
        } else {
            System.out.println("The problem is between you and me");
        }
    }
}
