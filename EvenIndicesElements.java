public class EvenIndicesElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array
        printEvenIndices(arr);
    }

    public static void printEvenIndices(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
    }
}
