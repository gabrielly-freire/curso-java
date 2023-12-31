package section04;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int codigo1, codigo2, qtdPecas1, qtdPecas2;
        double valor1, valor2, total;

        codigo1 = leia.nextInt();;
        qtdPecas1 = leia.nextInt();
        valor1 = leia.nextDouble();

        codigo2 = leia.nextInt();;
        qtdPecas2 = leia.nextInt();
        valor2 = leia.nextDouble();

        total = (valor1*qtdPecas1)+(valor2*qtdPecas2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);

    }
}
