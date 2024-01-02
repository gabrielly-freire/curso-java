package section08.entities.rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");
        double width = leia.nextDouble();
        double height = leia .nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.printf("AREA = %.2f%n", rectangle.area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
    }
}
