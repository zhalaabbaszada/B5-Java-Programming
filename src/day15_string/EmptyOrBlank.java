package day15_string;

public class EmptyOrBlank {
    public static void main(String[] args) {
        String str = "new method";

        System.out.println(str.isEmpty()); // It has some characters. So NOT EMPTY
        System.out.println(str.length() != 0);

        System.out.println();

        str = "";
        System.out.println(str.isEmpty());
        System.out.println(str.length());
        System.out.println(str.length() != 0);

        System.out.println("-----------------");

        str = " ";
        System.out.println(str.isEmpty());
        System.out.println(str.length());
        System.out.println(str.isBlank()); // it checks if String is only made out of " " - spaces
        str = "              ";
        System.out.println(str.isBlank());

        System.out.println("---------------");

        str = "  java softskills";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());

    }
}
