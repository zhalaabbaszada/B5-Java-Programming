package day14_string;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        String day = "Thursday";

        System.out.println(day);

        // #4 "".toUpperCase(); --> converts the String to ALL UPPERCASE and returns String

        System.out.println(day.toUpperCase());
        System.out.println(day);
        day = day.toUpperCase(); // Re-Assigned new ALL uppercase version to "day" refence
        System.out.println(day);

        // #5 "".toLowerCase(); --> converts the String to all lowercase and returns String
        System.out.println(day);
        day.toLowerCase(); // I made it lower case but did not use (did not re-assigned or use in print)
        System.out.println(day);
        day = day.toLowerCase();
        System.out.println(day);

        System.out.println();

        String word = "ToDaY Is GoOd Day#@!";
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());

    }
}
