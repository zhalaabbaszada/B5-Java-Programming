package day15_string;

public class CharMethod {
    public static void main(String[] args) {
        String str = "loop";
        //Characters 1234
        // Index     0123

        //Index of ; is 0
        // Index of p is 3
        // index of the first o is 1

        System.out.println("Num of total characters: " + str.length());

        // 12 - "".charAt(int/index) - gives the char based on the given number at String index - returns char
        System.out.println(str.charAt(0)); // 'l'
        System.out.println(str.charAt(1)); // 'o'
        System.out.println(str.charAt(2)); // 'o'
        System.out.println(str.charAt(3)); // 'p'
        // System.out.println( str.charAt(4)  ); // StringIndexOutOfBoundsException

        //String chartAt0 = str.charAt(0);
        char chartAt0 = str.charAt(0); // 'l'
        String chartAtZero = "" + str.charAt(0); //Mote you cannot assign char to the String. After String concatination every thing // become String


        System.out.println("------------------------");
        String sentence = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";


        System.out.println(sentence.charAt(0)); // first character
        System.out.println(sentence.length()); // total 573 characters. -last index it 573 - 1
        System.out.println( sentence.charAt( sentence.length() - 1 )  ); // last character
        //System.out.println( sentence.charAt( 572 )  );

    }
}
