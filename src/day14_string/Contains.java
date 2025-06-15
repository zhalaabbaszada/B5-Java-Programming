package day14_string;

public class Contains {
    public static void main(String[] args) {

        // "".contains(""); --> will check if exact ("") is in anywhere in the "". If yes, returns TRUE, if not FALSE
        String str = "Today's Java topic is all about String methods";

        System.out.println(str.contains("Javatopic")); //false
        System.out.println(str.contains("Java topic")); // true
        System.out.println(str.contains("o")); // true
        System.out.println(str.contains(" ")); // true
        System.out.println(str.contains(".")); // false

        System.out.println();
        System.out.println(str.contains("Java") && str.contains("methods") && str.contains("all")); //true

        System.out.println(str.contains("Java && methods")); // false


    }
}
