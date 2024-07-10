import intities.Client;
import intities.Order;
import intities.Product;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

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
        int manyItens = sc.nextInt();

        for(int y = 1; y < manyItens; y ++){
            System.out.printf("Enter #%d item data", y);

            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            Order order = new Order();

        }


        System.out.println("Client: " + client1.getName() + " " + client1.getBirthDate() + " - " +client1.getEmail());

        sc.close();

    }
}