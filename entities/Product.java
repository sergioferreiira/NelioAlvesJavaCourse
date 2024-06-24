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
}
