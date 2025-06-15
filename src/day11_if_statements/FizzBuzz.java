package day11_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userNum = key.nextInt();

        if (userNum % 3 == 0 && userNum % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (userNum % 5 ==0) {
            System.out.println("Buzz");
        } else if (userNum % 3 == 0) {
            System.out.println("Fizz");
        }

        //Q: How

    }
}
