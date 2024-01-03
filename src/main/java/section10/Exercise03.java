package section10;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = leia.nextInt();

        String nomes[] = new String[n];
        int idades[] = new int[n];
        double altura[] = new double[n];
        double soma = 0;
        int contIdade = 0;
        for (int i = 0; i < n; i++){
            System.out.printf("Dados da %da pessoa: \n", i+1);
            leia.nextLine();
            System.out.print("Nome: ");
            nomes[i] = leia.nextLine();
            System.out.print("Idade: ");
            idades[i] = leia.nextInt();
            System.out.print("Altura: ");
            altura[i] = leia.nextDouble();

            soma += altura[i];

            if(idades[i]<16){
                contIdade++;
            }
        }
        System.out.printf("Altura média: %.2f\n",  soma/n);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", (contIdade * 100.0 / n));

        for (int i = 0; i < n; i++){
            if (idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }
    }
}
