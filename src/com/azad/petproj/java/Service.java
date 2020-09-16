package com.azad.petproj.java;

public class Service {

    public void showGameRules() {

        println("Welcome to the Game");
        println("=======================");
        println("GAME RULES: Single Player");
        println("## The Player will play against the Computer.");
        println("## Choice available for both the Player and the Computer is 1 or 2.");
        println("## First, the Computer will choose (1 or 2).");
        println("## Then, the Player will choose (1 or 2), add it with the Computer's choice and input the result.");
        println("## For example, if the Computer chose 2, \n   then the player will choose (1 or 2) and will input the addition result like 3 (if 1) or 4 (if 2).");
        println("## Then the Computer will choose (1 or 2) and add it with the Player's input.");
        println("## The result will be increasing and finally if the Player reaches 20, he/she wins. Otherwise, loses.");
        println("");
        println("");
    }

    public int getDifficultyChoice() {

        println("Choose the difficulty level.");
        println("## EASY (press 1) -- [ If you are a human, you will win !! ]");
        println("## MEDIUM (press 2) -- [ If you can use your brain, you will win !! ]");
        println("## HARD (press 3) -- [ I dare you to win !! ]");

        int difficultyChoice;
        do {
            println("Enter your choice (1, 2 or 3)");
            difficultyChoice = Util.getIntegerInput("Negative/Non-integer input is invalid.");
        } while (difficultyChoice < 1 || difficultyChoice > 3);

        return difficultyChoice;
    }

    public void print(String msg) {
        System.out.print(msg);
    }

    public void println(String msg) {
        System.out.println(msg);
    }
}
