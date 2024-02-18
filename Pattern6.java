// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

public class Pattern6 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern
        printPattern(rows);
    }

    public static void printPattern(int rows) {
        int count = 1;
        for (int i = 1; i <= rows; i++) {
            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
