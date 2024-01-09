package section15.exersice.application;

import section15.exersice.model.entities.Account;
import section15.exersice.model.exceptions.DomainException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = leia.nextInt();
        System.out.print("Holder: ");
        leia.nextLine();
        String holder = leia.nextLine();
        System.out.print("Initial balance: ");
        double balance = leia.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = leia.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);
        System.out.printf("\nEnter amount for withdraw: ");
        double amount = leia.nextDouble();

        try {
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        }catch (DomainException ex){
            System.out.println(ex.getMessage());
        }
    }
}
