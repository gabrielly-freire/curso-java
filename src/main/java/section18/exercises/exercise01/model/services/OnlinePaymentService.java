package section18.exercises.exercise01.model.services;

public interface OnlinePaymentService {

    double paymentFee(double amount);
    double interest(double amount, int months);
}
