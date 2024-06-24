package entities;

public class Product {
    public String name;
    public double price;
    public int stock;

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
