package section14.exercises.exercise02.application;

import section14.exercises.exercise02.entities.ImportedProduct;
import section14.exercises.exercise02.entities.Product;
import section14.exercises.exercise02.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = leia.nextInt();

        List<Product> products = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            System.out.printf("Product #%d data:\n", i);
            System.out.print("Common, used or imported (c/u/i)? ");
            char op = leia.next().charAt(0);
            leia.nextLine();
            System.out.print("Name: ");
            String name = leia.nextLine();
            System.out.print("Price: ");
            double price = leia.nextDouble();

            Product product;

            if (op == 'c'){
                product = new Product(name, price);
            } else if (op == 'i') {
                System.out.print("Customs fee: ");
                double customsFree = leia.nextDouble();
                product = new ImportedProduct(name, price, customsFree);
            }else {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                leia.nextLine();
                LocalDate manufacture = LocalDate.parse(leia.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                product = new UsedProduct(name, price, manufacture);
            }
            products.add(product);
        }

        System.out.printf("\nPRICE TAGS:\n");
        for (Product p : products){
            System.out.println(p.priceTag());
        }
    }
}
