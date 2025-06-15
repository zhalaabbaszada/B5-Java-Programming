package day13_String;

public class StringMethods {
    public static void main(String[] args) {
        String name1 = "Tom";
        String name2 = "Tom";
        String name3 = new String("Tom");

        System.out.println(name1 == name2); // True
        System.out.println(name1 == name3); //False
        System.out.println(name2 == name3); //False
        // == --> this will compare MEMORY LOCATION(don't use this to compare value)
        System.out.println("---------------------------");

        //#1 - .equals(); this will compare the String VALUE (including the case sensitiveness)

        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(name2.equals(name3));
        System.out.println("Tom".equals(name1));
        System.out.println(name3.equals("Tom"));

        String name4 = new String("TOM");
        System.out.println(name1.equals(name4));
        System.out.println(new String("TOM").equals(name4));

        boolean isN1AsSameAsN3 = name1.equals(name3);
        System.out.println(isN1AsSameAsN3);


        // #2 - .equalIgnoreCase();this will compare the String VALUE (excluding the case sensitiveness)
        System.out.println("-------------------------");

        String str1 = "Wed";
        String str2 = "WED";

        System.out.println(str1.equals(str2));  //false
        System.out.println(str1.equalsIgnoreCase(str2)); //True

        System.out.println("---------------");
        // #3 - .length(); this will give us the number of the total characters

        String sentence = "I love Java";
        System.out.println("sentence.length() = " + sentence.length());

        /* Ask the user to enter a password.

        Check the password for the following rules:
        Must be at least 8 characters
        Must not contain the word "password" (case-insensitive)
        Must not contain spaces */

        /*
        Ask the user to enter an email.

        Check the following rules:
        Contains "@" and "."
        No spaces in the email
        Ends with .com, .net, or .org

         */

    }
}
