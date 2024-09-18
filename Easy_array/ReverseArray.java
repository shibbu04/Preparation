package Easy_array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // Example array to reverse
        int[] array = {1, 2, 3, 4, 5, 6};

        // Call the reverse method
        reverseArray(array);

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    // Method to reverse the array in-place
    public static void reverseArray(int[] array) {
        int left = 0; // Start pointer
        int right = array.length - 1; // End pointer

        // Swap elements until the two pointers meet
        while (left < right) {
            // Swap array[left] and array[right]
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the pointers
            left++;
            right--;
        }
    }
}

