package day11_if_statements;

public class NestedIfExample {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        boolean c = true;
        boolean d = false;

        if (a){
            System.out.println(1);

            if (b){ // Nested if
                System.out.println(2);

            }
        }
    }
}
