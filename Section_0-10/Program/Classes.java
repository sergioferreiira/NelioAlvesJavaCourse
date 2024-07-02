package Program;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Classes {
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

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f", areaX);
        System.out.println(" ");
        System.out.printf("Triangle Y area: %.4f", areaY);
        System.out.println(" ");

        if (areaX > areaY){
            System.out.println("Larger area: X");
        }
        else{
            System.out.println("Larger area: y");
        }


        sc.close();
    }
}
