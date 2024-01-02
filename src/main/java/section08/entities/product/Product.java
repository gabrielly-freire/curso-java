package section08.entities.product;

public class Product {
    // atributos
    private String name;
    private double price;
    private int quantity;

    // construtor padrao
    public Product(){

    }
    // construtor parametrizado
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // métodos setters e getters
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }
    // métodos
    public double totalValueStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name + ", $ " + String.format("%.2f",price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueStock());
    }
}
