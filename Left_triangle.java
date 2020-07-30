
package Star_Pattern;
import java.util.Scanner;
public class Left_triangle {
    public static void main(String[] args) {
      Scanner key = new Scanner(System.in);
        
            System.out.print("Enter the number of rows:  ");
        int rows = key.nextInt();
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
           
        }
    }

