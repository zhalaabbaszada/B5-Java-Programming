package day09_a_scanner;
/*
    Ask them to enter their favorite book
    Ask the user to enter their age (byte),
    and ask them to enter their favorite number (long),

    Print all the values from the inputs

 */

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter your favorite book: ");
        String book = key.nextLine();

        System.out.println("This is the book you like: " + book);

        System.out.print("Please, enter your age: ");
        byte age = key.nextByte();

        System.out.print("Please, enter your favorite number: ");
        long favNum = key.nextLong();
    }
}
