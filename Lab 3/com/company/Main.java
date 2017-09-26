package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int mpg = 1;
        double tankCap = (int)1;
        double tankPercent = (int)1;


        while (true) {
            System.out.println("Enter you car's MPG (miles/gallon) as a positive integer:");
            mpg = scan.nextInt();
            if (mpg <= 0) {
                System.out.println("Only positive integers accepted for MPG");
                break;
            }
            System.out.println("Enter you car's tank capacity (gallons) as a positive decimal:");
            tankCap = scan.nextDouble();
            if (tankCap <= 0) {
                System.out.println("Only positive decimal numbers accepted for tank capcacity");
                break;
            }
            System.out.println("Enter percentage of gas tank that is currently filled (0-100%):");
            tankPercent = scan.nextDouble();
            if (tankPercent < 0 || tankPercent > 100){
                System.out.println("Percentage must be decimal number in range of 0-100 (inclusive)!!!");
            break;
        }

            int rawRange = (int) (mpg * tankCap * tankPercent * .01)*1;

            if (rawRange <= 25) {
                System.out.println("Attention! Your estimated range is running low:" + rawRange + " " + "miles left");
            } else {
                System.out.println("Keeep driving! Your current estimated range is:" + rawRange + " " + "miles!");
            }




        }













    }
}
