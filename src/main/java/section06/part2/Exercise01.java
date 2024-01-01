package section06.part2;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();

        if (n >= 1 && n <= 1000){
            for (int i = 0; i < n; i++){
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        }else {
            System.out.println("Fora do intevalor");
        }

    }
}
