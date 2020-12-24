
package Star_Pattern;

import java.util.Scanner;
public class Downward_triangle {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("Enter the number of rows: "); 
 
    int rows = key.nextInt();
 
    for (int i= rows-1; i>=0 ; i--)
    {
    for (int j=0; j<=i; j++)
    {
    System.out.print("*" + " ");
    }
    System.out.println();
    }
    key.close();
    }
        
    }
    
    

