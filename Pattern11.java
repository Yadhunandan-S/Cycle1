// *********
//  *******
//   *****
//    ***
//     *

public class InvertedTrianglePattern {
    public static void main(String[] args) {
        printInvertedTriangle(5); // Adjust the parameter to change the number of rows
    }

    public static void printInvertedTriangle(int n) {
        // Loop for rows
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
