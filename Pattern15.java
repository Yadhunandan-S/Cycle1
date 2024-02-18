// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 

public class Pattern15 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern
        printPattern(rows);
    }

    public static void printPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            int numToPrint = i % 2; // Alternate between 0 and 1
            for (int j = 0; j <= i; j++) {
                System.out.print(numToPrint + " ");
                numToPrint = (numToPrint + 1) % 2; // Alternate between 0 and 1
            }
            System.out.println();
        }
    }
}
