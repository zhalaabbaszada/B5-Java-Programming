package day13_String;

public class StringMemory {
    public static void main(String[] args) {

        // Option 1 - By literals --> simple create by double quotation''
        String str1 = "Java";
        //  Stack  = Heap (inside the POOL) --> In the pool if you have exact same value like "Java" it doesn't create another one. It is just use same one.But if it has to be same.
        String str3 = "Java";

        // Option 2 - By "new keyword"
        String str2 = new String("Java");
        //   Stack  = Heap -- > By new key word. It doesn't matter if you already have a value it will create another one
        String str4 = new String("Java");


        String str6 = "java";
        String str7 = "java";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("---------------------------------------");

        System.out.println(str1 == str2); // -- > "==" We are comparing the memory location of string value
        System.out.println(str2 == str3); // false - diff location
        System.out.println(str1 == str3); // true - the same location

        //



    }
}
