package day09_a_scanner;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int userNumber = keyboard.nextInt();

        boolean isEven = userNumber % 2 == 0;
        boolean isOdd = userNumber % 2 != 0; // OR you can use --> boolean isOdd = !isEven

        System.out.println(userNumber + " is even " + isEven);
        System.out.println(userNumber + " is odd " + isOdd);

    }
}
