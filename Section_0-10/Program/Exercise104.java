package Program;

import java.sql.Array;
import java.util.Scanner;

public class Exercise104 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int m , n , x, y , z;

        System.out.print("Type how many lines will be there: ");
        m = sc.nextInt();
        System.out.print("Type how many columns will be there: ");
        n = sc.nextInt();


        int [][] mat = new int[m][n];

        for(int i = 0; i< m; i++){
            System.out.printf("type the numbers of the %d line: \n", i+1 );
            for (int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Choose a number: ");
        x = sc.nextInt();

        for(int i = 0; i< m; i++){
            for (int j = 0; j < n; j++){
                if (mat[i][j] == x){
                    System.out.printf("Position %d , %d \n", i , j );
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }


        sc.close();
    }
}
