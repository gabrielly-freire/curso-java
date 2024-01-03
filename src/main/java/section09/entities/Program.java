package section09.entities;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String number = leia.next();
        System.out.print("Enter account holder: ");
        String holder = leia.next();
        leia.next();
        System.out.print("Is there a initial deposit (y/n)? ");
        char response = leia.next().charAt(0);

        Account account;

        if ( response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = leia.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double amount = leia.nextDouble();
        account.deposit(amount);
        System.out.println("Update account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        amount = leia.nextDouble();
        account.withdraw(amount);
        System.out.println("Update account data: ");
        System.out.println(account);

    }
}
