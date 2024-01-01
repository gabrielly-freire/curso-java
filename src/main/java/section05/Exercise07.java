package section05;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double x, y;

        x = leia.nextInt();
        y = leia.nextInt();

        if ((x>0) && (y>0)){
            System.out.println("Q1");
        } else if ((x<0) && (y>0)) {
            System.out.println("Q2");
        } else if ((x<0) && (y<0)) {
            System.out.println("Q3");
        }else if((x>0) && (y<0)){
            System.out.println("Q4");
        }else {
            System.out.println("Origem");
        }
    }
}
