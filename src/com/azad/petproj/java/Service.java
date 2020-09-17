package com.azad.petproj.java;

public class Service {

    public void showGameRules() {

        println("Welcome to the Game");
        println("=======================");
        println("GAME RULES: Single Player");
        println("## You will play against the Computer.");
        println("## Choice available for both you and the Computer is 1 or 2 and initially 'Game Status' will be 0.");
        println("## First, any player (you or computer) will choose (1 or 2).");
        println("## 'Game Status' will then be updated by adding the choice to the previous value of 'Game Status'.");
        println("## Then, another player will choose (1 or 2).");
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

    public void gameplay(String difficultyLevel) {

        println("\nGame Difficulty: " + difficultyLevel + "\n");

        char tossWinner = runCoinToss() ? 'p' : 'c';

        int gameStatus = 0;

        for (;;) {

            if (tossWinner == 'c') {
                int compChoice = Util.getCompChoice(difficultyLevel, gameStatus);

                gameStatus = showGameStatus("Computer's", compChoice, gameStatus);
                if (gameStatus >= 20) {
                    println("You've lost the game !!");
                    break;
                }
                println("");

                int playerChoice = getPlayerChoice();

                gameStatus = showGameStatus("Your", playerChoice, gameStatus);
                if (gameStatus >= 20) {
                    println("You've WON !!");
                    break;
                }
                println("");
            }

            else {

                int playerChoice = getPlayerChoice();

                gameStatus = showGameStatus("Your", playerChoice, gameStatus);
                if (gameStatus >= 20) {
                    println("You've WON !!");
                    break;
                }
                println("");

                int compChoice = Util.getCompChoice(difficultyLevel, gameStatus);

                gameStatus = showGameStatus("Computer's", compChoice, gameStatus);
                if (gameStatus >= 20) {
                    println("You've lost the game !!");
                    break;
                }
                println("");
            }
        }
    }

    public boolean runCoinToss() {

        println("Coin toss is running....");
        println("Call HEAD (press 1) or TAIL (press 2)");
        int tossChoice;
        do {
            print("Enter (1 or 2): ");
            tossChoice = Util.getIntegerInput("Negative/Non-integer input is invalid.");
        } while (tossChoice != 1 && tossChoice != 2);

        println("");

        int tossResult = getCoinTossResult();

        if (tossChoice == tossResult) {
            println("You've won the toss. You will choose first.");
            return true;
        }

        else {
            println("You've lost the toss. Computer will choose first.");
            return false;
        }

    }

    public int getCoinTossResult() {
        return Util.getRandomChoice();
    }

    public void print(String msg) {
        System.out.print(msg);
    }

    public void println(String msg) {
        System.out.println(msg);
    }
}
