package section14.exercises.exercise03.application;

import section14.exercises.exercise03.entities.Company;
import section14.exercises.exercise03.entities.Individual;
import section14.exercises.exercise03.entities.TaxPayer;

import java.util.List;
import java.util.Scanner;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;


public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = leia.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = leia.next().charAt(0);
            System.out.print("Name: ");
            leia.nextLine();
            String name = leia.nextLine();
            System.out.print("Anual income: ");
            double income = leia.nextDouble();
            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = leia.nextDouble();
                list.add(new Individual(name, income, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = leia.nextInt();
                list.add(new Company(name, income, numberOfEmployees));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

    }
}