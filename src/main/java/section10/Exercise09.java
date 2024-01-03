package section10;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = leia.nextInt();

        String nomes[] = new String[n];
        int idades[] = new int[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Dados da %da pessoa: \n", i+1);
            leia.nextLine();
            System.out.print("Nome: ");
            nomes[i] = leia.nextLine();
            System.out.print("Idade: ");
            idades[i] = leia.nextInt();
        }

        int maisVelha = idades[0];
        int indiceMaisVelha = 0;

        for (int i = 0; i < n; i++){
            if (idades[i] > maisVelha){
                maisVelha = idades[i];
                indiceMaisVelha = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: "  + nomes[indiceMaisVelha]);

    }
}
