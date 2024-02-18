// 1 1 1 1 1 1 
// 2 2 2 2 2 
// 3 3 3 3 
// 4 4 4 
// 5 5 
// 6 

public class Pattern16 {
    public static void main(String[] args) {
        int rows = 6;
        printPattern(rows);
    }

    public static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print numbers
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
