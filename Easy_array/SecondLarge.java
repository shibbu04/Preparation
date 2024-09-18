package Easy_array;

import java.util.Arrays;

public class SecondLarge {
    public static void main(String[] args) {
        int[] array = { 10, 20, 4, 45, 99, 23 };

        // Call the method to find the second largest element
        int secondLargest = findSecondLargest(array); // Uncomment this line to use the one-pass method
        // int secondLargest = findSecondLargestTwoPass(array); // Uncomment this line to use the two-pass method

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("Array does not have enough elements for a second largest value.");
        }
    }

    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            return Integer.MIN_VALUE; // Handle case where array doesn't have at least 2 elements
        }

        // Initialize the largest and second largest elements
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse through the array
        for (int num : array) {   // for each loop   10 20 4 45 99 23
            if (num > largest) {
                secondLargest = largest; // Update second largest    
                largest = num; // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num; // Update second largest if it's not the same as the largest
            }
        }

        return secondLargest;
    }


    // Method to find the second largest element in the array using two passes
    public static int findSecondLargestTwoPass(int[] array) {
        if (array.length < 2) {
            return Integer.MIN_VALUE; // Handle case where array doesn't have at least 2 elements
        }

        // First pass to find the largest element
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        // Second pass to find the second largest element
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondLargest && array[i] < largest) {
                secondLargest = array[i];
            }
        }

        return secondLargest;
    }
}