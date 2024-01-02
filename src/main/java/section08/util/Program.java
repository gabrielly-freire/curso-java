package section08.util;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        double dollarPrice = leia.nextDouble();
        System.out.print("How many dollars will be bought: ");
        double dollarsToBuy = leia.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.dollarToReal(dollarPrice, dollarsToBuy));
    }
}
