package section10;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = leia.nextInt();

        double vetor[] = new double[n];
        double soma = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = leia.nextDouble();
            soma += vetor[i];
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++){
            System.out.print(vetor[i]+ " ");
        }

        System.out.printf("\nSOMA = %.2f\n",  soma);
        System.out.printf("MEDIA = %.2f", soma/n);

    }
}
