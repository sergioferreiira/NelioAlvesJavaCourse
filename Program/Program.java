package Program;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x , y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Type the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Type the measures of triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double area = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));

        double p1 = (y.a + y.b + y.c) / 2.0;
        double area1 = Math.sqrt(p1*(p1-y.a)*(p1-y.b)*(p1-y.c));

        System.out.printf("Triangle X area: %.2f", area);
        System.out.println(" ");
        System.out.printf("Triangle Y area: %.2f", area1);
        System.out.println(" ");

        if (area > area1){
            System.out.println("Larger area: X");
        }
        else{
            System.out.println("Larger area: y");
        }


        sc.close();
    }
}
