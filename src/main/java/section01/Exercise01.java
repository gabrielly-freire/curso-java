package section01;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero1, numero2, soma;

        numero1 = leia.nextInt();
        numero2 = leia.nextInt();

        soma = numero1 + numero2;

        System.out.printf("SOMA = %d", soma);

    }
}