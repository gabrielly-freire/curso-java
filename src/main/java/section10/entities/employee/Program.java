package section10.entities.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = leia.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            System.out.printf("\nEmployee #%d:\n", i);
            System.out.print("Id: ");
            int id = leia.nextInt();
            leia.nextLine();
            System.out.print("Name: ");
            String name = leia.nextLine();
            System.out.print("Salary: ");
            double salary = leia.nextDouble();

            Employee employee = new Employee(id, name, salary);
            employees.add(employee);
        }

        System.out.printf("\nEnter the employee id that will have salary increase: ");
        int id = leia.nextInt();
        System.out.print("Enter the percentage: ");
        double percentage = leia.nextDouble();

        Employee employee = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("List of employees:");
        for (Employee emp : employees){
            System.out.println(emp);
        }

    }
}
