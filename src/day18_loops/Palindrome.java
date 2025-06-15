package day18_loops;
/*
     Palindrome: it is the same reading from the beginning and end

     Ex:
         mom
         racecar
         Anna
         madam

     Task: Check if a word is palindrome
 */

public class Palindrome {
    public static void main(String[] args) {
        String word = "ANA";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--){
            reverse += word.charAt(i);
        }
        System.out.println("Originl word: " + word);
        System.out.println("Reversed word: " + reverse);

        if (word.equalsIgnoreCase(reverse)){
            System.out.println("It is palindrome");
        }else {
            System.out.println("It is not Palindrome");
        }
    }
}
