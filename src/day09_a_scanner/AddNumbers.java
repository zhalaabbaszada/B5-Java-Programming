package day09_a_scanner;

import java.util.Scanner;

public class AddNumbers {
    public static void main (String [] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter 3 numbers: ");
        System.out.print("\tNumber 1: ");
        int num1 = keyboard.nextInt();
        System.out.print("\tNumber 2: ");

        int num2 = keyboard.nextInt();

        System.out.print("\tNumber 3: ");
        int num3 = keyboard.nextInt();

        int sumOfAll = num1 + num2 + num3;
        System.out.println("Sum of numbers: " + sumOfAll);

        int halfOfTotal = sumOfAll / 2;
        System.out.println("Half of total: " + halfOfTotal);



    }
}
