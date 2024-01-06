package section13.exercises.exercise.entities;

import section13.entities.enuns.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
    private static SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double total = 0;
        for (OrderItem item:items){
            total += item.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: "+ dateFormat2.format(moment) +"\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Cliente: " + client.getName() + " (" + dateFormat1.format(client.getBirthDate()) + ") - "
                + client.getEmail() + "\n");
        sb.append("Order itens: \n");
        for (OrderItem item: items){
            sb.append(item.getProduct().getName() + ", $" + item.getProduct().getPrice() + ", ");
            sb.append("Quantity: " + item.getQuantity() + ", Subtotal: $" + item.subTotal() + "\n");
        }
        sb.append("Total price: $"+total());
        return sb.toString();
    }
}
