package day18_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a message: ");
        String sentence = key.nextLine().trim();

        //find the spaces - count of spaces +1 --> it will give you number of words


        int countSace = 0;

        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == ' '){
                countSace++;
            }
        }
        System.out.println("Count of Space: " + countSace);
        System.out.println("You have " + (countSace +1) + " words");
    }
}
