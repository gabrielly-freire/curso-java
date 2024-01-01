package section05;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double renda = leia.nextDouble();
        double imposto;

        if (renda <= 2000.0) {
            imposto = 0.0;
        } else if (renda <= 3000.0) {
            imposto = (renda - 2000.0) * 0.08;
        } else if (renda <= 4500.0) {
            imposto = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
        }  else {
            imposto = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

    }
}
