package section05;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;

        numero = leia.nextInt();

        if(numero >= 0){
            System.out.println("NAO NEGATIVO");
        } else{
            System.out.println("NEGATIVO");
        }

    }
}
