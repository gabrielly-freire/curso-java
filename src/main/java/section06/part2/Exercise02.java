package section06.part2;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++){
            int x = leia.nextInt();
            if(x >= 10 && x <= 20){
                in++;
            }else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

    }
}
