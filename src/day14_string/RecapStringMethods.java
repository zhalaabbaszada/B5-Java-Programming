package day14_string;

public class RecapStringMethods {
    public static void main(String[] args) {
        String str1 = "loop"; // By literals
        String str2 = "loop"; // by literals
        String str3 = new String("loop"); // By "new" keyword
        String str4 = new String("loop"); // By "new" keyword

        //Comparing with "=="        ---> compares memory location
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str3 == str4); // False

        System.out.println("----------------------");

        // "".equals(""): ----> compares the value (exact characters)
        System.out.println(str1 .equals(str2)); // true
        System.out.println(str1 .equals(str3)); // true
        System.out.println(str3 .equals(str4)); // true
        System.out.println("loop" .equals(str3)); // true
        System.out.println(new String("loop") .equals("loop")); //true
        System.out.println();

        // '' .equalsIgnoreCase("") ---> compares the value (without case sensitiveness)
        String str5 = "loop";
        System.out.println(str1.equalsIgnoreCase(str5));
        boolean isSameWithoutCaseSensitiveness = "LoOp".equalsIgnoreCase(str5);

        System.out.println(isSameWithoutCaseSensitiveness);

        if (isSameWithoutCaseSensitiveness){
            System.out.println("These two string values are same without case sensitiveness");
        }else {
            System.out.println("These two string values are NOT same without case sensitiveness");
        }

        // "".length();---> counts how many characters there are and returns int

        System.out.println(str1.length());
        str1 = str1 + "camp"; // we made a new String (String is IMMUTABLE)
        System.out.println(str1.length());

        int num = 10;
        System.out.println(("" + 10).length()); // 2

        String str6 = "Loop";
        // Write a code that checks if the word has even or odd number characters

        if (str6.length() % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }






    }
}
