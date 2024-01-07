package section14.exercises.exercise01.application;

import section14.exercises.exercise01.entities.Employee;
import section14.exercises.exercise01.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = leia.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            System.out.printf("Employee #%d data:\n", i);
            System.out.print("Outsourced (y/n)? ");
            char op = leia.next().charAt(0);
            leia.nextLine();

            System.out.print("Name: ");
            String name = leia.nextLine();
            System.out.print("Hours: ");
            int hours = leia.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = leia.nextInt();

            Employee employee;

            if(op == 'n'){
                employee = new Employee(name, hours, valuePerHour);
            }else {
                System.out.print("Additional charge: ");
                double additionalChange = leia.nextDouble();
                employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalChange);
            }
            employees.add(employee);
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee e : employees){
            System.out.println(e);
        }
    }
}
