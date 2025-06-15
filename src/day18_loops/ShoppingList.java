package day18_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String shoppingList = "Your shopping list";
        String userAnswer;

        do {
            System.out.print("Please, enter the name of item: ");
            String itemName = key.nextLine();

            shoppingList += "\n\t" + itemName;

            System.out.print("Do you ant to add another item (yes or no): ");
            userAnswer = key.nextLine();
        } while (userAnswer.equalsIgnoreCase("yes"));



        System.out.println(shoppingList);

    }
}
