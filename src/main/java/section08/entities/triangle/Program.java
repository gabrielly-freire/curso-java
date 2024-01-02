package section08.entities.triangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = leia.nextDouble();
        x.b = leia.nextDouble();
        x.c = leia.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = leia.nextDouble();
        y.b = leia.nextDouble();
        y.c = leia.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }
    }
}
