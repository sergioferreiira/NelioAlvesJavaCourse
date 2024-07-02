package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class VectorProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);



//        Problema "alturas"

//        int arrayNumber , minors = 0,x = 0;
//        double heightAvarage = 0;
//
//
//
//        System.out.print("How many persons will be typed: ");
//        arrayNumber = sc.nextInt();
//
//        VectorClasses [] students = new VectorClasses[arrayNumber];
//        String [] minorNames = new String[arrayNumber];
//
//        for (int i = 0 ; i < students.length; i++){
//            System.out.printf("The data of the %d person \n" , i + 1);
//            sc.nextLine();
//
//            String name = sc.nextLine();
//            int age = sc.nextInt();
//            double height = sc.nextDouble();
//
//            students[i] = new VectorClasses(name , age, height);
//
//            heightAvarage += height;
//
//            if ( age < 16){
//
//                minorNames[x] = students[i].getName();
//                minors += 1;
//                x++;
//            }
//
//        }
//
//
//        System.out.printf("Height Avarange : %.2f \n" , heightAvarage / arrayNumber);
//        System.out.printf("Persons as less of 16 years old : %.1f%%\n", (double)(minors * 100) / arrayNumber);
//        for(int i = 0; i < minors; i++){
//            System.out.println(minorNames[i]);
//        }


//        Problema "soma_vetor"

//        int x;
//        double total = 0;
//
//        System.out.print("How many number do you will type? ");
//        x = sc.nextInt();
//        VectorClasses [] array = new VectorClasses[x];
//
//        for (int i = 0; i < array.length; i++){
//            System.out.print("Type a number: ");
//            double number = sc.nextInt();
//            array[i] = new VectorClasses(number);
//
//        }
//        System.out.println(" ");
//        System.out.print("Values: ");
//        for (int i = 0; i < array.length; i++){
//            System.out.print(array[i].getNumber() + " " );
//            total += array[i].getNumber();
//        }
//        System.out.println(" ");
//        System.out.printf("Sum: %.2f \n" , total);
//        System.out.printf("Average: %.2f" , (total / x));


//        Problema soma_2_Vetores

//        int x;
//
//        System.out.print("How many number will be there in each vector? ");
//        x = sc.nextInt();
//        VectorClasses [] array = new VectorClasses[x];
//        VectorClasses [] array2 = new VectorClasses[x];
//        VectorClasses [] array3 = new VectorClasses[x];
//
//        System.out.print("Type a number of the vector A \n");
//        for (int i = 0; i < array.length; i++){
//
//            double number = sc.nextInt();
//            array[i] = new VectorClasses(number);
//
//        }
//        System.out.print("Type a number of the vector B \n");
//        for (int i = 0; i < array2.length; i++){
//            double number = sc.nextInt();
//            array2[i] = new VectorClasses(number);
//        }
//
//        for (int i = 0; i < array3.length; i++){
//            double number = array[i].getNumber() + array2[i].getNumber();
//            array3[i] = new VectorClasses(number);
//        }
//
//        System.out.println("Vector result: ");
//        for (int i = 0; i < array3.length; i++){
//            System.out.println(array3[i].getNumber());
//        }


        String name , email;
        VectorClasses[] roomArray = new VectorClasses[10];

        System.out.print("How many students will rent rooms: ");
        int students = sc.nextInt();



        for(int i= 0; i < students; i++){
            sc.nextLine();
            System.out.printf("Student %d type your name: ", i + 1);
            name = sc.nextLine();

            System.out.printf("Student %d type your email: ", i + 1);
            email = sc.nextLine();

            System.out.printf("Student %d chose a room: ", i + 1);
            int roomNumber = sc.nextInt();
            System.out.println();

            roomArray[roomNumber] = new VectorClasses(name , email , roomNumber);
        }

        System.out.println("Busy rooms: ");
        for (VectorClasses vectorClasses : roomArray) {
            if (vectorClasses != null) {
                System.out.println(vectorClasses.getRoom()
                        + ": "
                        + vectorClasses.getName()
                        + ", "
                        + vectorClasses.getEmail()
                );
            }
        }

        sc.close();
    }
}
