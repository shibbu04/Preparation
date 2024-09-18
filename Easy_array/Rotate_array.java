package Easy_array;

public class Rotate_array {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k is greater than n

        // Step 1: Reverse the whole array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining n - k elements
        reverse(arr, k, n - 1);
    }

    // Helper method to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(arr, k);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
