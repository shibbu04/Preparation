package Easy_array;

public class isSorted {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};  // Example of a sorted array
        boolean isSorted = isArraySorted(array);
        System.out.println("Is the array sorted? " + isSorted);
    }

    public static boolean isArraySorted(int[] array) {
        // Traverse the array and check if each element is <= the next one
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;  // If any element is greater than the next one, array is not sorted
            }
        }
        return true;  // If no violation found, array is sorted
    }
}

