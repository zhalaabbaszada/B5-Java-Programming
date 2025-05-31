package day09_a_scanner;

import java.util.Scanner;

public class DivisibleBy {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        System.out.print("Number 1 is: ");
        int number = keyboard.nextInt();

        boolean isEvenlyDivisibleBy2 = number % 2 ==0;
        boolean isEvenlyDivisibleBy3 = number % 3 ==0;
        boolean isEvenlyDivisibleBy5 = number % 5 ==0;

        boolean isEvenlyDivisible2_3_5 = isEvenlyDivisibleBy2 && isEvenlyDivisibleBy3 && isEvenlyDivisibleBy5;

        System.out.println(number + " is evenly divisible by 2, 3, and 5: " + isEvenlyDivisible2_3_5);

    }
}
