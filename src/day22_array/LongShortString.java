package day22_array;

public class LongShortString {
    public static void main(String[] args) {
        String [] words = {"java", "softskills", "selenium", "mentors", "quiz"};
        System.out.println("Size of words: " + words.length);

        String longest = words[0];
        String shortest = words[0];

        for ( String  eachElem : words ){
            if (eachElem.length() > longest.length()){
                longest = eachElem;
            }

            if (eachElem.length() < shortest.length()){
                shortest = eachElem;
            }
        }

        System.out.println("Longest: " + longest);
        System.out.println("Shortest: " + shortest);



    }
}
