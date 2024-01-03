package section10;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = leia.nextInt();

        double vetor[] = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = leia.nextDouble();
        }

        double maior = vetor[0];
        int indiceMaior = 0;

        for (int i = 0; i < n; i++){
            if(vetor[i]>maior){
                maior = vetor[i];
                indiceMaior = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + indiceMaior);

    }
}
