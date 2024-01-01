package section05;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;

        numero = leia.nextInt();

        if(numero%2 == 0){
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }
    }
}
