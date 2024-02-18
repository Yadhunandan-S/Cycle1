//    1
//   212
//  32123
// 4321234
//  32123
//   212
//    1
public class DiamondPattern {
    public static void main(String[] args) {
        printDiamondPattern(4); // Adjust the parameter to change the number of rows
    }

    public static void printDiamondPattern(int n) {
        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print numbers in decreasing order
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print numbers in increasing order
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print numbers in decreasing order
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print numbers in increasing order
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
