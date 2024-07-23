package Section_14;

import Section_14.entities.Account;
import Section_14.entities.Bank;
import Section_14.entities.BusinesAccount;

import java.util.List;
import java.util.Scanner;

public class LutheranPolymorphism {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        Bank bankAccount = new Bank();

        System.out.println();
        System.out.println("Welcome to bank");
        System.out.println();

        Boolean system = true;
        while (system){
            System.out.println("Type 1 to create a common account or type 2 to create a Business Account");
            int choice = sc.nextInt();

            if (choice == 1){
                sc.nextLine();
                System.out.println("Welcome to Common account");
                System.out.print("Type your name: ");
                String name = sc.nextLine();
                System.out.print("Type a number that you prefer for your account: ");
                int number = sc.nextInt();
                System.out.print("Type how much you will deposit to your account: ");
                double balance = sc.nextDouble();
                bankAccount.addAccount(new Account(number,  name, balance));

            }else {
                sc.nextLine();
                System.out.println("Welcome to Business Account");
                System.out.print("Type your name: ");
                String name = sc.nextLine();
                System.out.print("Type a number that you prefer for your account: ");
                int number = sc.nextInt();
                System.out.print("Type how much you will deposit to your account: ");
                double balance = sc.nextDouble();
                System.out.println("How much money do you wanna have of loan");
                double loanLimit = sc.nextDouble();
                bankAccount.addBusinesAccount(new BusinesAccount(number,name,balance,loanLimit));
            }


            for(Account acc : bankAccount.getAccounts()){
                System.out.println("Holder: " + acc.getHolder() +"\n"+ "Balance: " +acc.getBalance());
            }
            for(Account acc : bankAccount.getBusinesAccounts()){
                System.out.println("Holder: " + acc.getHolder() +"\n"+ "Balance: " +acc.getBalance());
            }


            sc.nextLine();
            System.out.println("Do you want continue in this system (Y/N)?");
            String systemContinue = sc.nextLine();

            if(systemContinue.charAt(0) == 'N' || systemContinue.charAt(0) == 'n'){
                system = false;
            }else {
                continue;
            }
        }


        System.out.println(bankAccount);

    }
}
