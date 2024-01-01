package section06.part2;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();

        for (int i = 0; i < n; i++){
            double n1 = leia.nextDouble();
            double n2 = leia.nextDouble();

            if (n2 == 0){
                System.out.println("divisao impossivel");
            }else {
                System.out.printf("%.1f\n", n1/n2);
            }
        }

    }
}
