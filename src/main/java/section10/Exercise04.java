package section10;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = leia.nextInt();

        int vetor[] = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = leia.nextInt();
        }

        System.out.println("NUMEROS PARES: ");
        int cont = 0;
        for (int i = 0; i < n; i++){
            if (vetor[i]%2 == 0){
                System.out.print(vetor[i]+" ");
                cont++;
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = "+cont);
    }
}
