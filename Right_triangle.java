
package Star_Pattern;

import java.util.Scanner;
public class Right_triangle {
    public static void main(String[] args) {
          int rows, i, j;
   
        Scanner key = new Scanner(System.in);
        System.out.println("Enter number of rows in pattern");
        rows = key.nextInt();
 
        for(i = 1; i <= rows; i++) {
            /* Prints one row of triangle */
            for(j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            /* move to next row */
            System.out.print("\n");
        }

    }
    }

