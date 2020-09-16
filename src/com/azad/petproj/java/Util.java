package com.azad.petproj.java;

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

    // Get a random choice between min and max
    public static int getRandomChoice() {

        Random random = new Random();

        return random.nextInt(2) + 1;
    }
}
