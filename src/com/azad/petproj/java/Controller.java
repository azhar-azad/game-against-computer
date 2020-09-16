package com.azad.petproj.java;

public class Controller {

    private Service service = new Service();

    public void runGame() {

        service.showGameRules();

        int difficultyChoice = service.getDifficultyChoice();
    }
}
