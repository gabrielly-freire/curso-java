package section06.part2;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();

        for (int i = 0; i < n; i++){
            double n1 = leia.nextDouble();
            double n2 = leia.nextDouble();
            double n3 = leia.nextDouble();

            double media = (n1*2 + n2*3 + n3*5)/10;

            System.out.printf("%.1f\n",media);
        }
    }
}
