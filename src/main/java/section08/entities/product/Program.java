package section08.entities.product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = leia.nextLine();
        System.out.print("Price: ");
        double price = leia.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = leia.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.printf("\nProduct data: %s\n\n",  product);

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = leia.nextInt();
        product.addProducts(quantity);
        System.out.printf("\nUpdated data: %s\n\n", product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = leia.nextInt();
        product.removeProducts(quantity);
        System.out.printf("\nUpdated data: %s", product);


    }
}
