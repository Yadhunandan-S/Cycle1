public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        // Swap elements from start and end until reaching the middle
        while (start < end) {
            // Swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Move to the next elements
            start++;
            end--;
        }
    }
}
