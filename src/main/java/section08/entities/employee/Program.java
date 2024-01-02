package section08.entities.employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Name: ");
        String name = leia.nextLine();
        System.out.print("Gross salary: ");
        double grossSalary = leia.nextDouble();
        System.out.print("Tax: ");
        double tax = leia.nextDouble();

        System.out.println();
        Employee employee = new Employee(name, grossSalary, tax);
        System.out.println("Employee: " + employee);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = leia.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println();
        System.out.println("Updated data: " + employee);


    }
}
