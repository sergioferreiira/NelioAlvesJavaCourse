package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class VectorProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        int arrayNumber , minors = 0,x = 0;
        double heightAvarage = 0;



        System.out.print("How many persons will be typed: ");
        arrayNumber = sc.nextInt();

        VectorClasses [] students = new VectorClasses[arrayNumber];
        String [] minorNames = new String[arrayNumber];

        for (int i = 0 ; i < students.length; i++){
            System.out.printf("The data of the %d person \n" , i + 1);
            sc.nextLine();

            String name = sc.nextLine();
            int age = sc.nextInt();
            double height = sc.nextDouble();

            students[i] = new VectorClasses(name , age, height);

            heightAvarage += height;

            if ( age < 16){

                minorNames[x] = students[i].getName();
                minors += 1;
                x++;
            }

        }


        System.out.printf("Height Avarange : %.2f \n" , heightAvarage / arrayNumber);
        System.out.printf("Persons as less of 16 years old : %.1f%%\n", (double)(minors * 100) / arrayNumber);
        for(int i = 0; i < minors; i++){
            System.out.println(minorNames[i]);
        }




        sc.close();
    }
}
