package section14.exercises.exercise02.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return name + " $ " + (price+customsFee) + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }
}
