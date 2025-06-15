package day14_string;

public class StartAndEnd {
    public static void main(String[] args) {

        String str1 = "Loopcamp";
        String str2 = "LOOp";

        // #6.  "".startWith(""); will check if start or not with exact match - returns boolean
        System.out.println(str1.startsWith("Loop"));
        System.out.println(str1.startsWith("loop"));

        //Q; How would ignore the case sensitiveness and still check if it starts with same characters

        //take srt1 --> make all lowercase
        // take "loop" --> make all lowercase
        // then check if it .startWith()

        System.out.println(str1.toLowerCase().startsWith("Loop".toLowerCase()));
        System.out.println(str1.toUpperCase().startsWith("Loop".toUpperCase()));


        System.out.println(str1.startsWith("Loopcamp"));
        System.out.println(str1.startsWith("Loopcamp "));
        System.out.println(str1.startsWith("  Loopcamp"));

        System.out.println();

        String sentence = "Today is Java class day";
        System.out.println(sentence.startsWith("Today "));
        System.out.println(sentence.startsWith("Today is "));
        System.out.println(sentence.startsWith(" is "));
        System.out.println();


        // #7 - "".endsWith(""); will check if ends or not with exact watch - returns boolean

        System.out.println(sentence.endsWith("day"));
        boolean hasSameEnding = "loopcamp".endsWith("camp");
        System.out.println(hasSameEnding);
    }
}
