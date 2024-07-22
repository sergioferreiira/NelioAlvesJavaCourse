package Section_11.Exercise153.Exercise153.src;

import Section_11.Exercise153.Exercise153.src.intities.Client;
import Section_11.Exercise153.Exercise153.src.intities.Order;
import Section_11.Exercise153.Exercise153.src.intities.OrderItem;
import Section_11.Exercise153.Exercise153.src.intities.Product;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static <orderlist> void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        OrderItem order = new OrderItem();
        Order orderlist = new Order();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter Client Data");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth Date (DD/MM/YYYY): ");
        String dateInput = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(dateInput, dateFormatter);
        Client client1 = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");

        System.out.print("Status: ");
        String status = sc.nextLine();

        System.out.print("How many items to this order? ");
        int manyItems = sc.nextInt();

        sc.nextLine();
        for(int y = 1; y <= manyItems; y ++){
            System.out.printf("Enter #%d item data ", y);
            System.out.println();
            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            order = new OrderItem(quantity,productPrice);

            orderlist.addOrderitens(order);
            sc.nextLine();
        }

        System.out.println("ORDEDR SUMMARY: ");

        String x = String.valueOf(LocalDateTime.now().format(fmt1));
        System.out.printf("Order moment: " + x);
        System.out.println();
        System.out.println("Order status: " + status);
        System.out.println("Client: " + client1 );
        System.out.println("Order items: ");

        System.out.println();



        sc.close();

    }
}