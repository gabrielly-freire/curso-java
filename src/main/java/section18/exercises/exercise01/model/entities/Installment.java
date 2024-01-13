package section18.exercises.exercise01.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate dueData;
    private Double amount;

    public Installment() {
    }

    public Installment(LocalDate dueData, Double amount) {
        this.dueData = dueData;
        this.amount = amount;
    }

    public LocalDate getDueData() {
        return dueData;
    }

    public void setDueData(LocalDate dueData) {
        this.dueData = dueData;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return formatter.format(dueData) + " - " + String.format("%.2f", amount);
    }
}