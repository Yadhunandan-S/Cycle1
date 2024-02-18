//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

public class DiamondPattern {
    public static void main(String[] args) {
        printDiamond(9); // Adjust the parameter to change the number of rows
    }

    public static void printDiamond(int n) {
        if (n % 2 == 0) {
            n++; // Ensure n is odd to create symmetric diamond
        }
        
        int spaces = n / 2;
        int stars = 1;

        // Upper half of the diamond
        for (int i = 1; i <= n; i += 2) {
            printSpaces(spaces);
            printStars(stars);
            System.out.println();
            spaces--;
            stars += 2;
        }

        // Lower half of the diamond
        spaces = 1;
        stars = n - 2;
        for (int i = n - 2; i >= 1; i -= 2) {
            printSpaces(spaces);
            printStars(stars);
            System.out.println();
            spaces++;
            stars -= 2;
        }
    }

    public static void printSpaces(int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
    }
}
