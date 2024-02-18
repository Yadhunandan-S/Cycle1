public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        int sum = findSum(arr);
        System.out.println("Sum of elements in the array: " + sum);
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
