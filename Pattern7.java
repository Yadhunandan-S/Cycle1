// ****
// *  *
// *  *
// *  *
// ****
import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        
        // Print the top side of the rectangle
        for (int i = 0; i < columns; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        // Print the middle part of the rectangle
        for (int i = 2; i < rows; i++) {
            System.out.print("*");
            for (int j = 2; j < columns; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        // Print the bottom side of the rectangle
        for (int i = 0; i < columns; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
