package day15_string;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter your name with title: ");
        String userNameWithTitle = key.nextLine().toLowerCase(); // Mr.Tom Jerry Sr

        if ( userNameWithTitle.startsWith("mr. ") || userNameWithTitle.startsWith("mister. ")){
            System.out.println("Hello Mister");
        } else if (userNameWithTitle.startsWith("ms. ") || userNameWithTitle.startsWith("miss. ") || userNameWithTitle.startsWith("madam. ")) {
            System.out.println("Hello Ma'am");
        } else if (userNameWithTitle.startsWith("dr. ")) {
            System.out.println("Hello Doctor");
        }

        if (userNameWithTitle.endsWith(" sr.")){
            System.out.println("Nice to meet you Senior");
        } else if (userNameWithTitle.endsWith(" jr.")) {
            System.out.println("Nice to meet you Junior");

        }


    }
}
