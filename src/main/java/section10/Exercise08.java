package section10;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = leia.nextInt();

        int vetor[] = new int[n];
        double media = 0;
        int cont = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = leia.nextInt();

            if(vetor[i] % 2 == 0){
                cont++;
                media += vetor[i];
            }
        }

        if (media > 0){
            System.out.println("MEDIA DOS PARES = " + media/cont);
        }else{
            System.out.println("NENHUM NUMERO PAR ");
        }
    }
}
