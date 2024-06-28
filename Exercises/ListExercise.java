package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExercise {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        ListClasses employees = new ListClasses();

        System.out.print("How many employees will be registered? ");
        int x = sc.nextInt();


        for(int i = 0; i < x ; i++){
            System.out.printf("Employee %d \n", i + 1);
            System.out.print("id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Wage: ");
            double wage = sc.nextDouble();
            employees = new ListClasses(id, name, wage);
            list.add(String.valueOf(employees));
        }


        System.out.print("Enter the employee id that will have wage increase : ");
        int idIncrease = sc.nextInt();

        System.out.print("Enter the percent that will increase : ");
        int percent = sc.nextInt();
        employees.increase(percent);


        System.out.println(employees);

//        for(ListClasses listClasses : employees){
//            System.out.println(listClasses);
//        }
//
//





        sc.close();
    }
}
