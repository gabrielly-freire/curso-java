package section10;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = leia.nextInt();

        int vetorA[] = new int[n];
        int vetorB[] = new int[n];
        int vetorC[] = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++){
            vetorA[i] = leia.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++){
            vetorB[i] = leia.nextInt();
        }

        for(int i = 0; i < n; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < n; i++){
            System.out.println(vetorC[i]);
        }


    }
}
