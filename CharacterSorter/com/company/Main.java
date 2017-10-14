package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        int menuOpt = 0;

        System.out.println("Welcome to Character Sorter Program");
        System.out.println("Please input a string to be sorted");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println();

        char[] charInput = userInput.toCharArray();


        while (menuOpt != 4) {
            System.out.println("Please select the option you would like to see");
            System.out.println("1.Display character frequencies alphabetically\n"
                    + "2. Display sorted frequencies\n" + "3. Show types of character frequencies\n"
                    + "4. Exit\n");

            try {
                menuOpt = scanner.nextInt();
            } catch (InputMismatchException bad) {
                System.out.println("Error, bad input, please enter a number 1-4");
                scanner.nextLine();
            }
            menuOpt = scanner.nextInt();
            if (menuOpt > 4 || menuOpt < 1) {
                System.out.println("Error, bad input, please enter a number 1-4");
                try {
                    menuOpt = scanner.nextInt();
                } catch (InputMismatchException bad) {
                    System.out.println("Error, bad input, please enter a number 1-4");
                    scanner.nextLine();
                }
                menuOpt = scanner.nextInt();
            }


            if (menuOpt == 1) {
                System.out.print("Freqency:");
            }
            if (menuOpt == 2) {
                System.out.print("freqency:");
            }
            if (menuOpt == 3) {
                System.out.print("freqency");
            }

        }


    }
}