package section13.exercises.exercise01.application;

import section13.exercises.exercise01.entities.Deparment;
import section13.exercises.exercise01.entities.HourContract;
import section13.exercises.exercise01.entities.Worker;
import section13.exercises.exercise01.entities.enuns.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner leia = new Scanner(System.in);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = leia.nextLine();

        Deparment deparment = new Deparment(departmentName);

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = leia.nextLine();
        System.out.print("Level: ");
        String level = leia.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = leia.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, deparment);

        System.out.print("How many contracts to this worker? ");
        int n = leia.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.printf("Enter contract #%d data:\n", i);
            System.out.print("Date (DD/MM/YYYY): ");
            Date date = dateFormat1.parse(leia.next());
            System.out.print("Value per hour: ");
            double valuePerHour = leia.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = leia.nextInt();

            HourContract contract = new HourContract(date, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = leia.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDeparment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


    }
}
