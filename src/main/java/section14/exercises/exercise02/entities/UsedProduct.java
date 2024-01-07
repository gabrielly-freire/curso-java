package section14.exercises.exercise02.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

    private static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate manufacture;

    public UsedProduct() {
    }
    public UsedProduct(String name, Double price, LocalDate manufacture) {
        super(name, price);
        this.manufacture = manufacture;
    }

    public LocalDate getManufacture() {
        return manufacture;
    }

    public void setManufacture(LocalDate manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String priceTag() {
        return name + " (used) $ " + String.format("%.2f", price) + " Manufacture date: "+ format.format(manufacture);
    }
}
