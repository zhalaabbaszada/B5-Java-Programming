package day11_if_statements;

public class Ternary {
    public static void main(String[] args) {
        int a = 71;
        String result;

        // Option 1 - with regular IF-ELSE statement

        if (a % 2 == 0){
           // System.out.println("Even");
            result = "Even";
        }else {
            //System.out.println("Odd");
            result = "Odd";
        }
        System.out.println(result);
        System.out.println("--------------------------");

        //Option 2 - Ternary

        String result2 = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(result2);

        System.out.println("----------------------------");
        System.out.println((5 > 2) ? "5 is bigger than 2" : -100);


    }
}
