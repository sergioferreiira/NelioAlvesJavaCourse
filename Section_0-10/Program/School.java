package Program;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class School {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student x , y;
        x = new Student();
        y = new Student();

        System.out.print("Type the name of the student: ");
        x.name = sc.nextLine();
        System.out.print("Type the grade A of the student: ");
        x.gradeA = sc.nextDouble();
        System.out.print("Type the grade B of the student: ");
        x.gradeB = sc.nextDouble();
        System.out.print("Type the grade C of the student: ");
        x.gradeC = sc.nextDouble();

        System.out.println(" ");
        y.name = sc.nextLine();
        System.out.print("Type the name of the second student: ");
        y.name = sc.nextLine();
        System.out.print("Type the grade A of the student: ");
        y.gradeA = sc.nextDouble();
        System.out.print("Type the grade B of the student: ");
        y.gradeB = sc.nextDouble();
        System.out.print("Type the grade C of the student: ");
        y.gradeC = sc.nextDouble();

        System.out.println(" ");
        System.out.println("Student: " + x.name + " " + x.SumOfGrades());
        System.out.println(" ");
        System.out.println("Student: " + y.name + " " + y.SumOfGrades());



        sc.close();
    }
}
