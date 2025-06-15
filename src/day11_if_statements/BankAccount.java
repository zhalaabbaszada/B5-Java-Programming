package day11_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance;
        double withdraw;

        System.out.println("What is your balance: ");
        balance = scanner.nextDouble();

        System.out.println("How much do you want to withdraw: ");
        withdraw = scanner.nextDouble();

        if (balance >= withdraw){
            balance -= withdraw;
            System.out.println("Your new balance is: " + balance);
        } else
            System.out.println("Not enough balance");



        System.out.println();
    }
}
