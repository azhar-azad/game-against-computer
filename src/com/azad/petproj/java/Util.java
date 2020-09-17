package com.azad.petproj.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Util {

    public static Scanner scanner = new Scanner(System.in);

    // Safe-convert user input to integer value
    public static int getIntegerInput(String msg) {
        String str = scanner.nextLine();
        for (;;) {
            if (isInteger(str))
                return Integer.parseInt(str);
            else {
                System.out.println(msg);
                str = scanner.nextLine();
            }
        }
    }

    // Safe-convert user input to double value
    public static double getDoubleInput(String msg) {
        String str = scanner.nextLine();
        for (;;) {
            if (isDouble(str))
                return Double.parseDouble(str);
            else {
                System.out.println(msg);
                str = scanner.nextLine();
            }
        }
    }

    public static String getStringInput() {
        return scanner.nextLine();
    }

    // Check if user input is positive-integer or not
    public static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;

//        if (str.charAt(0) == '-') {
//            System.out.println("Negative value is invalid for this property.");
//            return false;
//        }

        for (; i < length; i++) {
            char c = str.charAt(i);

            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    // Check if user input is positive-double or not
    public static boolean isDouble(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;

//        if (str.charAt(0) == '-') {
//            System.out.println("Negative value is invalid for this property.");
//            return false;
//        }

        for (; i < length; i++) {
            char c = str.charAt(i);

            if ((c < '0' || c > '9') && c != '.') {
                return false;
            }
        }
        return true;
    }

    // Get a random choice between 1 and 2
    public static int getRandomChoice() {

        Random random = new Random();

        return random.nextInt(2) + 1;
    }

    public static int getCompChoice(String difficultyLevel, int gameStatus) {

        if (difficultyLevel.equals("EASY"))
            return getRandomChoice();

        List<Integer> winChoices = getWinChoiceList(difficultyLevel);

        for (int i: winChoices) {
            if ((i - 1) == gameStatus)
                return 1;
            if ((i - 2) == gameStatus)
                return 2;
        }

        return getRandomChoice();
    }

    private static List<Integer> getWinChoiceList(String difficultyLevel) {

        List<Integer> winChoiceList = new ArrayList<>();

        int firstItem ;
        if (difficultyLevel.equals("MEDIUM"))
            firstItem = 11;
        else
            firstItem = 2;

        for (int i = firstItem; i <= 20; i += 3)
            winChoiceList.add(i);

        return winChoiceList;
    }
}
