package day09_a_scanner;
/*
    Task

    create Scanner object
    ask the user to enter their first name - next
    ask the user to enter their last name - next
    ask the user if they are employed - boolean
    ask the user if they are a student - boolean

 */
import java.util.Scanner;

public class WorkStatus {
    public static void main(String [] args){
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter your first name: ");
        String firstName = key.next();

        System.out.print("Please, enter your last name: ");
        String lastName = key.next();

        System.out.print("Are you employed? (true/false): ");
        boolean isEmployed = key.nextBoolean();

        System.out.print("Are you student? (true/false): ");
        boolean isStudent = key.nextBoolean();

        String infoAboutPerson = "The person with first name " + firstName + " and last name : " + lastName + " currently employed: " + isEmployed + " is student; " + isStudent;



    }
}
