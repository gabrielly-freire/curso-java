package section05;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double numero;

        numero = leia.nextDouble();

        if((numero >= 0) && (numero <= 25)){
            System.out.println("Intevalor  " + "[0,25]");
        } else if ((numero > 25) && (numero <= 50)){
            System.out.println("Intevalor  " + "(25, 50]");
        } else if ((numero>50) && (numero<=75)) {
            System.out.println("Intevalor  " + "(50, 75]");
        } else if ((numero>75) && (numero<=100)) {
            System.out.println("Intevalor  " + "(75, 100]");
        }else{
            System.out.println("Fora de intervalo");
        }

    }
}
