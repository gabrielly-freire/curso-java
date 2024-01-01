package section06.part2;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.printf("%d ", i);
            System.out.printf("%.0f ", Math.pow(i, 2));
            System.out.printf("%.0f\n",Math.pow(i, 3));
        }

    }
}
