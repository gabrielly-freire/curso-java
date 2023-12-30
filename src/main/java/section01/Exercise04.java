package section01;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int funcionarios, horas;
        double valorHora, salario;

        funcionarios = leia.nextInt();
        horas = leia.nextInt();
        valorHora = leia.nextDouble();

        salario = horas * valorHora;

        System.out.printf("NUMBER = %d\n", funcionarios);
        System.out.printf("SALARY = U$ %.2f", salario);

    }
}
