package section06.part1;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int x = leia.nextInt();

        while (x != 4){

            if(x == 1){
                alcool++;
            }
            if (x == 2) {
                gasolina++;
            }
            if ( x == 3){
                diesel++;
            }

            x = leia.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }
}
