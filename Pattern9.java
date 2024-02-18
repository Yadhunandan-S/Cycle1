// 1      1
// 12    21
// 123  321
// 12344321
public class Pattern9 {
    public static void main(String[] args) {
        printPattern(4); // Adjust the parameter to change the number of rows
    }

    public static void printPattern(int n) {
        // Upper half of the pattern
        for (int i = 1; i <= n; i++) {
            // Print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print spaces
            for (int j = 2 * (n - i); j > 0; j--) {
                System.out.print(" ");
            }
            // Print numbers in decreasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
