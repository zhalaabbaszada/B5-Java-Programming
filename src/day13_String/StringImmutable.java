package day13_String;

public class StringImmutable {
    public static void main(String[] args) {
        String word1 = "Loop";
        String word2 = "Loop";

        System.out.println(word1);
        System.out.println(word2);

        word1 = word1 + "camp"; // String is Immutable - means-you cannot change it.  In this case you cannot change original string which is word1. This is another string which is we re-assigned to word1. we don't modify the exciting one
        System.out.println("---------------");
        System.out.println(word1);
        System.out.println(word2);
    }
}
