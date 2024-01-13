package section18.exercises.exercise01.model.services;

import section18.exercises.exercise01.model.entities.Contract;
import section18.exercises.exercise01.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){

        double basicQuota = contract.getTotalValue()/months;

        for (int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusDays(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double paymentFee = onlinePaymentService.paymentFee(interest+basicQuota);
            double quota = basicQuota+interest+paymentFee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
