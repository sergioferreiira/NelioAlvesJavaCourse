package Program;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Job {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double percent;
        Employee x;
        x = new Employee();


        System.out.print("Name: ");
        x.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        x.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        x.tax = sc.nextDouble();

        System.out.println("Employee : " + x.name + " " + x.NetSalary());

        System.out.println("Which percent to increase salary: ");
        percent = sc.nextDouble();
        x.IncreaseSalary(percent);

        System.out.print("Update data: " + x.name + " , $" + x.grossSalary);





        sc.close();
    }
}
