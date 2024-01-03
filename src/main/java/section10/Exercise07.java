package section10;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = leia.nextInt();

        double vetor[] = new double[n];
        double media = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = leia.nextDouble();
            media += vetor[i]/n;
        }

        System.out.println("MEDIA DO VETOR = " + media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < n; i++){
            if(vetor[i] < media){
                System.out.println(vetor[i]);
            }
        }
    }
}
