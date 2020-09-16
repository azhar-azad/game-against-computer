package com.azad.petproj.java;

public class Service {

    public void showGameRules() {

        println("Welcome to the Game");
        println("=======================");
        println("GAME RULES: Single Player");
        println("## You will play against the Computer.");
        println("## Choice available for both you and the Computer is 1 or 2 and initially 'Game Status' will be 0.");
        println("## First, the Computer will choose (1 or 2).");
        println("## 'Game Status' will then be updated by adding the Computer choice to the previous value of 'Game Status'.");
        println("## Then, you will choose (1 or 2).");
        println("## 'Game Status' will be updated again.");
        println("## 'Game Status' will be increasing and finally if it reaches 20, game will be over");
        println("## If your choice make the 20 then you win, otherwise, you lose");
        println("");
        println("");
    }

    public int getDifficultyChoice() {

        println("Choose the difficulty level.");
        println("## EASY (press 1) -- [ If you are a human, you will win !! ]");
        println("## MEDIUM (press 2) -- [ You need a brain to win !! ]");
        println("## HARD (press 3) -- [ I dare you to win !! ]");

        int difficultyChoice;
        do {
            print("Enter game difficulty choice (1, 2 or 3): ");
            difficultyChoice = Util.getIntegerInput("Negative/Non-integer input is invalid.");
        } while (difficultyChoice < 1 || difficultyChoice > 3);

        return difficultyChoice;
    }

    private int getPlayerChoice() {

        int playerChoice;
        do {
            print("Enter your choice (1 or 2): ");
            playerChoice = Util.getIntegerInput("Negative/Non-integer input is invalid.");
        } while (playerChoice != 1 && playerChoice != 2);
        println("");

        return playerChoice;
    }

    private int showGameStatus(String name, int choice, int status) {

        println(name + " choice: " + choice);
        status += choice;
        println("Game Status: " + status);
        return status;
    }

    public void easyGameplay() {

        println("\nGame Difficulty: EASY\n");

        int gameStatus = 0;

        for (;;) {

            int compChoice;
            if (gameStatus == 19)
                compChoice = 1;
            else
                compChoice = Util.getRandomChoice();

            gameStatus = showGameStatus("Computer's", compChoice, gameStatus);
            if (gameStatus >= 20) {
                println("You SUCK !!");
                break;
            }

            println("");

            int playerChoice = getPlayerChoice();

            gameStatus = showGameStatus("Your", playerChoice, gameStatus);
            if (gameStatus >= 20) {
                println("You WON !!");
                break;
            }

            println("");
        }

    }

    public void mediumGameplay() {

        println("\nGame Difficulty: MEDIUM\n");


    }

    public void hardGameplay() {
        println("Hard");
    }

    public void print(String msg) {
        System.out.print(msg);
    }

    public void println(String msg) {
        System.out.println(msg);
    }
}
