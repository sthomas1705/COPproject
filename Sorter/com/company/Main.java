package com.company;
import com.sun.org.apache.bcel.internal.generic.ArrayType;

import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;


public class Main {

   public static int[]alphabeticalSort(String Alpha){
       char [] charInput  = Alpha.toCharArray();
       int[] intInput=new int[charInput.length];
       for(int i=0;i<charInput.length;i++){
           intInput[i]=charInput[i];
       }
       for(int j=0;j<intInput.length;j++){
           for(int i=j+1;i<intInput.length;i++){
            int holder=0;
            if(intInput[j]>intInput[i]){
                holder=intInput[j];
                intInput[j]=intInput[i];
                intInput[i]=holder;
            }

           }
       }


    return intInput;
   }

































    public static void main(String[] args) {

        int menuOpt = 0;

        System.out.println("Welcome to Character Sorter Program");
        System.out.println("Please input a string to be sorted");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println();




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
                menuOpt=scanner.nextInt();
            }
            while (menuOpt > 4 || menuOpt < 1) {
                System.out.println("Error, bad input, please enter a number 1-4");
                try {
                    menuOpt = scanner.nextInt();
                } catch (InputMismatchException bad) {
                    System.out.println("Error, bad input, please enter a number 1-4");
                    scanner.nextLine();
                    menuOpt = scanner.nextInt();
                }
            }




            if (menuOpt == 1) {
                int[]alphabeticalMethod=alphabeticalSort(userInput);
                int i=0;
                for(i=0;i<alphabeticalMethod.length;i++){
                    System.out.println("Frequency"+" "+alphabeticalMethod[i]+":");
                }
                System.out.println();
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