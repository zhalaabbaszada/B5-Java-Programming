package day09_a_scanner;

import java.util.Scanner;

public class UsingNextLine {
    public static void main (String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("What day is today: ");
        String day = key.next();

        System.out.print("What is your first name: ");
        String firstName = key.next();

        System.out.print("What is your last name: ");
        String lastName = key.next();

        System.out.print("Please, enter your address: ");
        String address = key.nextLine(); // when you put nextnile first time you need put another one before that in order to handle with enter

    }
}
