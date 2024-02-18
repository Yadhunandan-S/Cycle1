//     *
//    **
//   ***
//  ****
// *****
public class Pattern2 {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
