package section13.application;

import section13.entities.Order;
import section13.entities.enuns.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.DELIVERED);

        System.out.println(order);

        OrderStatus orderStatus1 = OrderStatus.DELIVERED;
        OrderStatus orderStatus2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(orderStatus1);
        System.out.println(orderStatus2);

    }
}
