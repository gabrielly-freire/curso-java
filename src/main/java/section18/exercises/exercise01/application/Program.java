package section18.exercises.exercise01.application;

import section18.exercises.exercise01.model.entities.Contract;
import section18.exercises.exercise01.model.entities.Installment;
import section18.exercises.exercise01.model.services.ContractService;
import section18.exercises.exercise01.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = leia.nextInt();
        leia.nextLine();
        System.out.print("Data (dd/MM/yyyy):");
        LocalDate date = LocalDate.parse(leia.nextLine(), formatter);
        System.out.print("Valor do contrato: ");
        double totalValue = leia.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int n = leia.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, n);
        System.out.println("Parcelas:");
        for (Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }

    }
}
