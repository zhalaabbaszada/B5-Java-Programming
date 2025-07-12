package day30_a_arraylist;
import java.util.ArrayList;
import java.util.Arrays;

/*

        Input: "Java", "Saturday", "SoftSkills", "Weekend"
        Out: ArrayList --- >  which removed all the String which has length more than 7 characters
 */

public class RemoveLongString {
    static ArrayList <String> removeLongString (ArrayList <String> list) {

        ArrayList <String> listCopy = new ArrayList<>(list);  // ["Java", "Saturday", "SoftSkills", "Weekend"]

        listCopy.removeIf( each -> (each.length() > 7) );

        return listCopy;

    }


    public static ArrayList <String> removeContainingA (ArrayList <String> list) {

        ArrayList <String> listCopy = new ArrayList<>(list);  // ["Java", "Saturday", "SoftSkills", "Weekend"]

        listCopy.removeIf( each -> (each.contains("a") || each.contains("A")) );

        return listCopy;

    }
}
