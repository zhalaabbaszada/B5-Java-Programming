package day07_relational_operators;

public class OperatorPractice {
    public static void main(String[] args){
        int b = 12;
        b++; // POST increment: b = b + 1; b = 13;
        System.out.println(b); //13

        ++b; // PRE Increment: b = b + 1;
        System.out.println(b);

        b--;

        System.out.println(b);

        int t = 100;
        int p = --t;
         System.out.println(t);
         System.out.println(p);
    }
}
