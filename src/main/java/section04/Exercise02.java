package section04;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double raio, area;
        final double PI = 3.14159;

        raio = leia.nextDouble();

        area = Math.pow(raio, 2) * PI;

        System.out.printf("A = %f", area);
    }
}
