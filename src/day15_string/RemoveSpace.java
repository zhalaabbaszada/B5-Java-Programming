package day15_string;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "  loopcamp    ";
        //#9 - "".trim(); - removes empty spaces from the beginning and end.
        System.out.println(str.trim());
        System.out.println(str);
        str = str.trim();
        System.out.println(str);
        System.out.println("-----------------");

        String str2 = " java is nice programming";
        System.out.println(str2.trim());
        System.out.println("----------------------------");

        String str3 = "\tThrusday"; // 1 tabs == 4 spaces
        System.out.println(str3.length()); //9
        String str4 = "    Thrusday"; //12
        System.out.println(str4.length());

    }
}
