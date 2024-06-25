package Program;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Store {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int stock = sc.nextInt();

        Product tv = new Product(name, price, stock);

        System.out.println(tv);


        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        tv.AddProducts(quantity);

        System.out.println(tv);

        System.out.print("Enter the number of products to be removed from stock: ");
        int remove = sc.nextInt();
        tv.RemoveProducts(remove);

        System.out.println(tv);




        sc.close();
    }

}
