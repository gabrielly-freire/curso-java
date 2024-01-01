package section06.part1;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int x, y;

        x = leia.nextInt();
        y = leia.nextInt();

        while (x != 0 && y != 0){

            if(x >= 0 && y >= 0){
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }else {
                System.out.println("quarto");
            }

            x = leia.nextInt();
            y = leia.nextInt();

        }

    }
}
