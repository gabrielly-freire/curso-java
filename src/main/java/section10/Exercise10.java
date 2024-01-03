package section10;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = leia.nextInt();

        String nomes[] = new String[n];
        double notas1[] = new double[n];
        double notas2[] = new double[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i+1);
            leia.nextLine();
            nomes[i] = leia.nextLine();
            notas1[i] = leia.nextDouble();
            notas2[i] = leia.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++){
            double media = (notas1[i] + notas2[i])/2;
            if (media >= 6){
                System.out.println(nomes[i]);
            }
        }
    }
}
