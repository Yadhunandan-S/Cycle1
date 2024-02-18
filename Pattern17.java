//   *   *  
//  * * * *
// *   *   *
public class Pattern17 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n - 1); j++) {
                if ((j == (n - i) + 1) || (j == (n + i) - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = 2; j <= (2 * n - 1); j++) {
                if ((j == (n - i) + 1) || (j == (n + i) - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
