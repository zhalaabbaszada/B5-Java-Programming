package day13_String;
/*
    Given a day number, find and print the day related to the number

    1- Monday
    2- Tuesday

    6- Saturday
    7- Sunday

    any other number: Not a day
 */

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please, enter a number that represents day of week (between 1 - 7): ");
        int userInput = scan.nextInt();
       // String dayFromNum = ""; // assigned empty value to String
        String dayFromNum ;       // String does not have anu value at all

        switch (userInput){
            case 1:
               // System.out.println("Monday");
                dayFromNum = "Monday";
                break;
            case 2:
               // System.out.println("Tuesday");
                dayFromNum = "Tuesday";
                break;
            case 3:
                //System.out.println("Wednesday");
                dayFromNum = "Wednesday";
                break;
            case 4:
                //System.out.println("Thursday");
                dayFromNum = "Thursday";
                break;
            case 5:
               // System.out.println("Friday");
                dayFromNum = "Friday";
                break;
            case 6:
                //System.out.println("Saturday");
                dayFromNum = "Saturday";
                break;
            case 7:
                //System.out.println("Sunday");
                dayFromNum = "Sunday";
                break;
            default:
                //System.out.println("Not a day");
                dayFromNum = "Not a day";
        }
        System.out.println(dayFromNum);

    }
}
