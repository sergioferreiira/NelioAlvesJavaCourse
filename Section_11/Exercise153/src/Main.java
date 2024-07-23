import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt0 = DateTimeFormatter.ofPattern("(dd/MM/yyyy)");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmtNow = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Order order = new Order();

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date: ");
        String birthDate = sc.nextLine();
        LocalDate birthDateFormatter = LocalDate.parse(birthDate , fmt1);
        Client client = new Client(name, email, birthDateFormatter);


        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.print("How many items to this order? ");
        int quantityItemOrder = sc.nextInt();
        for (int x = 1; x <= quantityItemOrder; x++){
            sc.nextLine();
            System.out.println("Enter item ");

            System.out.print("Product Name: ");
            String productName = sc.nextLine();
            System.out.print("Product Price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Product Quantity: ");
            int productQuantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            order.addOrder(new OrderItem(quantityItemOrder, productPrice * quantityItemOrder));
        }

        System.out.println("Order Summary" +
                "\n" +
                "Order moment:" + LocalDateTime.now().format(fmtNow) +
                "\n" +
                "Status:" + status +
                "\n" +
                "Client: " + client.getName() + " " + client.getBirthDate().format(fmt0)  + " - " + client.getEmail()+
                "\n" +
                "Order Items:" +
                "\n"
        );













        sc.close();
    }
}
