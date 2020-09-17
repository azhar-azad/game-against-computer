package com.azad.petproj.java;

public class Controller {

    private Service service = new Service();

    public void runGame() {

        service.showGameRules();

        int difficultyChoice = service.getDifficultyChoice();

        switch (difficultyChoice) {
            case 1:
                service.gameplay("EASY");
                break;

            case 2:
                service.gameplay("MEDIUM");
                break;

            case 3:
                service.gameplay("HARD");
                break;

            default:
                break;
        }
    }
}
