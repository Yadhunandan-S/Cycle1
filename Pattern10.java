public class Pattern10 {
    public static void main(String[] args) {
        printPattern(5); // Adjust the parameter to change the number of rows
    }

    public static void printPattern(int n) {
        // Loop for rows
        for (int i = 1; i <= n; i++) {
            // Loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
