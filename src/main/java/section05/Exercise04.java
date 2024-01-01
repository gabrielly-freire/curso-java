package section05;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int inicio, fim, calculo;

        inicio = leia.nextInt();
        fim = leia.nextInt();

        if (inicio >= fim){
            calculo = 24 - inicio + fim;
        }else {
            calculo = fim - inicio;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", calculo);
    }
}
