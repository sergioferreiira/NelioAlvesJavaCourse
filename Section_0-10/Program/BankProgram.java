package Program;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class BankProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        BankAccount x;

        System.out.print("Enter number account: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();


        System.out.println("Is there an initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);

        if (answer == 'y' || answer == 'Y'){
            System.out.print("Enter initial deposit value: ");
            double accountBalance = sc.nextDouble();
            x = new BankAccount(accountNumber,accountHolder, accountBalance);
        }
        else {
            x = new BankAccount(accountNumber,accountHolder);
        }

        System.out.println(" ");

        System.out.println("Account Data:");
        System.out.println(x);

        System.out.println("Enter deposit value: ");
        double depositValue = sc.nextDouble();
        x.Deposit(depositValue);

        System.out.println(x);

        System.out.println("Enter withdraw value: ");
        double withdrawValue = sc.nextDouble();
        x.Withdraw(withdrawValue);

        System.out.println(x);





        sc.close();
    }
}
