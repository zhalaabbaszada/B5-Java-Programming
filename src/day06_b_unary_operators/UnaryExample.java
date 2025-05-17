package day06_b_unary_operators;

public class UnaryExample {
    public static void main(String[] args){
        int y = 5;
        y = -y; // I re-assigned Y to its previous value by making it negative
        System.out.println(y);
        y = -20; // (+1 * -20) = -20
        System.out.println(y);

        y= -y; // -1 * -20
        System.out.println(y);
        System.out.println("----------------------------");

        int x = 0;
        System.out.println(x);
        x = x+1; // Incremented x by adding 1 to its previous value and re-assinged to x
        System.out.println(x);


    }
}
