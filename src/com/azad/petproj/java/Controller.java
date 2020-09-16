package com.azad.petproj.java;

public class Controller {

    private Service service = new Service();

    public void runGame() {

        service.showGameRules();

        int difficultyChoice = service.getDifficultyChoice();

        switch (difficultyChoice) {
            case 1:
                service.easyGameplay();
                break;

            case 2:
                service.mediumGameplay();
                break;

            case 3:
                service.hardGameplay();
                break;

            default:
                break;
        }
    }
}
