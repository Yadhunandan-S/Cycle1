// *
// **
// ***
// ****
// *****

public class TrianglePattern {
    public static void main(String[] args) {
        printTriangle(5); // Adjust the parameter to change the number of rows
    }

    public static void printTriangle(int n) {
        // Loop for rows
        for (int i = 1; i <= n; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
