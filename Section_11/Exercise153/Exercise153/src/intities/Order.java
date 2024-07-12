package Section_11.Exercise153.Exercise153.src.intities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {

    private LocalDate date;
    private Orderstatus status;
    private List<OrderItem> orderitens = new ArrayList<>();

    public Order() {
    }

    public Order(LocalDate date, Orderstatus status) {
        this.date = date;
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Orderstatus getStatus() {
        return status;
    }

    public void setStatus(Orderstatus status) {
        this.status = status;
    }

    public void addOrderitens(OrderItem product) {
        this.orderitens.add(product);
    }

    public void removeOrderitens(OrderItem product) {
        this.orderitens.remove(product);
    }
    public List<OrderItem> getOrderitens() {
        return orderitens;
    }
    public void setOrderitens(List<OrderItem> orderitens) {
        this.orderitens = orderitens;
    }
}
