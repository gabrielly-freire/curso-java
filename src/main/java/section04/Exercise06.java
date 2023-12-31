package section04;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double a, b, c;

        a = leia.nextDouble();
        b = leia.nextDouble();
        c = leia.nextDouble();

        double triangulo = a * c / 2.0;
        double circulo = 3.14159 * c * c;
        double trapezio = (a + b) / 2.0 * c;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
    }
}
