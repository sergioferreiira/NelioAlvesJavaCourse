package Program;

import entities.NVector;

import java.util.Scanner;

public class Vector {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        NVector[] vect = new NVector[n];

        for(int i = 0 ;i < vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new NVector(name , price);
        }

        double sum = 0.0;
        for(int i = 0 ; i < vect.length; i ++){
            sum += vect[i].getPrice();
        }

        sum = sum / vect.length;

        System.out.printf("Avarange price = %.2f" , sum);




        sc.close();
    }
}
