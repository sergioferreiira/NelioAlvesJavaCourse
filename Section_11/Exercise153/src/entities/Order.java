package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date date;
    private OrderStatus status;
    private List<OrderItem> orderItems = new ArrayList<>();
    private Client client;

    public Order() {
    }

    public Order(Date date, OrderStatus status ) {
        this.date = date;
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addOrder(OrderItem orderItem){
        orderItems.add(orderItem);
    }
    public void removeOrder(OrderItem orderItem){
        orderItems.remove(orderItem);
    }

}
