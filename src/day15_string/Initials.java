package day15_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please,enter your first name: ");
        String userFirstName = key.next().toUpperCase().trim();
        key.nextLine();
        System.out.print("Please,enter your last name: ");
        String userLastName = key.nextLine().toUpperCase().trim();

       // userFirstName.charAt(0);
       // userLastName.charAt(0);

        String initials = "" + userFirstName.charAt(0) + userLastName.charAt(0);
        System.out.println("Your initial: " + initials);
    }
}
