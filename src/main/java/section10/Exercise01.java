package section10;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = leia.nextInt();

        int vetor[] = new int[n];
        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = leia.nextInt();
        }
        for (int i = 0; i < n; i++){
           if(vetor[i] < 0){
               System.out.println(vetor[i]);
           }
        }
    }
}
