package section06.part1;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        while (leia.nextInt() != 2002){
            System.out.println("Senha Invalida");
        }

        System.out.println("Acesso Permitido");
    }
}
