package Program;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Store {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int add;
        int remove;

        Product x;
        x = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        x.name = sc.nextLine();

        System.out.print("Price: ");
        x.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        x.stock = sc.nextInt();

        System.out.printf("Product data: %s , %d units , Total: $ %.2f/n", x.name , x.stock , x.TotalValueInStock());


        System.out.print("Enter the number of products to be added in stock: ");
        add = sc.nextInt();
        x.AddProducts(add);

        System.out.printf("Product data: %s , %d units , Total: $ %.2f/n", x.name , x.stock , x.TotalValueInStock());

        System.out.print("Enter the number of products to be removed from stock: ");
        remove = sc.nextInt();
        x.RemoveProducts(remove);

        System.out.printf("Product data: %s , %d units , Total: $ %.2f/n", x.name , x.stock , x.TotalValueInStock());




        sc.close();
    }

}
