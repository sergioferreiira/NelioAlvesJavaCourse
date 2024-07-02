package entities;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(){

    }
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }


    public double TotalValueInStock(){
        return price * stock;
    }
    public void AddProducts(int quantity){
        stock += quantity;
    }
    public void RemoveProducts(int quantity){
        stock -= quantity;
    }
    public String toString(){
        return "Product Data: "
                + name
                + " , "
                + String.format("price: $ %.2f , ", price)
                + stock
                + " units , "
                + " Total: $"
                + String.format("%.2f",TotalValueInStock());
    }
}
