package section05;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int codigo, qtd;
        double valor = 0, total;

        codigo = leia.nextInt();
        qtd = leia.nextInt();

        switch (codigo){
            case 1:
                valor = 4.0;
                break;
            case 2:
                valor = 4.5;
                break;
            case 3:
                valor = 5.0;
                break;
            case 4:
                valor = 2.0;
                break;
            case 5:
                valor = 1.5;
                break;
        }

        total = qtd * valor;

        System.out.printf("Total: R$ %.2f", total);

    }
}
