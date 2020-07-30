
package Star_Pattern;

import java.util.Scanner;
public class Diamond_shape {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int n, i, j, space = 1;
        System.out.print("Enter the number of rows: ");
        n = key.nextInt();
        space = n - 1;
        for (j = 1; j <= n; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= n - 1; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        }
     
            
          }
    
      
