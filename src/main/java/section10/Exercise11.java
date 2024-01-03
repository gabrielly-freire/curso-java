package section10;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = leia.nextInt();

        double alturas[] = new double[n];
        char generos[] = new char[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Altura da %da pessoa: ", i+1);
            alturas[i] = leia.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i+1);
            generos[i] = leia.next().charAt(0);
        }
        double menor = alturas[0];
        double maior = alturas[0];
        double media = 0;
        int contM = 0;
        for (int i = 0; i < n; i++){
            if (alturas[i] < menor){
                menor = alturas[i];
            }
            if (alturas[i] > maior){
                maior = alturas[i];
            }
            media += alturas[i]/n;
            if (generos[i] == 'M') {
                contM++;
            }
        }

        System.out.printf("Menor altura = %.2f\n", menor);
        System.out.printf("Maior altura = %.2f\n", maior);
        System.out.printf("Media das alturas das mulheres = %.2f\n", media);
        System.out.println("Numero de homens = " + contM);

    }
}
