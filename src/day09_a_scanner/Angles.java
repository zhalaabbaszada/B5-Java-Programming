package day09_a_scanner;

import java.util.Scanner;

/*
    Write a program that asks the user to enter 3 angle numbers ( can be decimal numbers )
    Determine if the angles make a triangle,
        which means the angles add to 180.0
    and Determine if the angles make a circle,
        which means the angles add to 360.0
 */
public class Angles {
    public static void main  (String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println ("Please, enter 3 angles:");
        double angle1 = keyboard.nextDouble();
        double angle2 = keyboard.nextDouble();
        double angle3 = keyboard.nextDouble();

        double sumOfAngles = angle1 + angle2 + angle3;

        boolean isTriangle = sumOfAngles == 180;

        boolean isCircle = sumOfAngles ==360;

        System.out.println("Is it triangle: " + isTriangle);
        System.out.println("Is it circle: " + isCircle);
    }
}
