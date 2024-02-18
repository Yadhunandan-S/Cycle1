public class SunnyNumber {
    public static void main(String[] args) {
        int number = 24; // Test number
        if (isSunnyNumber(number)) {
            System.out.println(number + " is a Sunny number.");
        } else {
            System.out.println(number + " is not a Sunny number.");
        }
    }

    public static boolean isSunnyNumber(int n) {
        double root = Math.sqrt(n + 1);
        return root == (int) root;
    }
}
