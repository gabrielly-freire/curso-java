package section05;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero1, numero2, aux;

        numero1 = leia.nextInt();
        numero2 = leia.nextInt();

        if(numero1 < numero2){
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }

        if (numero1%numero2==0){
            System.out.println("Sao Multiplos");
        } else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
