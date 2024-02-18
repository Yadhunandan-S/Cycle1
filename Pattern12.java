public class Pattern12 {
    public static void main(String[] args) {
        printPattern(5); // Adjust the parameter to change the number of rows
    }

    public static void printPattern(int n) {
        // Loop for rows
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
        // Loop for rows (inverted triangle)
        for (int i = n - 2; i >= 0; i--) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
