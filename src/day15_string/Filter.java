package day15_string;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String userMessage = key.nextLine();

        System.out.println("Original Message: " + userMessage);

        userMessage = userMessage.trim().toLowerCase();
        // String changedMessage = userMessage.trim(); if you want yo see original message you can to is this way
        System.out.println("Trimmed  message " + userMessage);
        boolean isBadWord = userMessage.contains("java is bad") || userMessage.contains("quit") || userMessage.contains("have fun") || userMessage.contains("crying");

        if (isBadWord){
            System.out.println("Message failed to send");
        }
    }
}
