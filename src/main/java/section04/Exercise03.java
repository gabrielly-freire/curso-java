package section04;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int num1, num2, num3, num4, diferenca;

        num1 = leia.nextInt();
        num2 = leia.nextInt();
        num3 = leia.nextInt();
        num4 = leia.nextInt();

        diferenca = (num1*num2 - num3*num4);

        System.out.printf("DIFERENCA = %d", diferenca);
    }
}
