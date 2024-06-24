package Program;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle x;
        x = new Rectangle();

        System.out.println("Enter with the width and height of the Rectangle: ");
        x.width = sc.nextDouble();
        x.height = sc.nextDouble();

        System.out.println(x.area());
        System.out.println(x.perimeter());
        System.out.println(x.diagonal());



        sc.close();
    }
}
