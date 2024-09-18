package Easy_array;


public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 4, 5};

        int newLength = removeDuplicates(array);

        // Output the result array and its new length
        System.out.println("New length after removing duplicates: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int removeDuplicates(int[] array) {
        if (array.length == 0) return 0;

        int uniqueIndex = 1; // Index to place the next unique element

        // Start from the second element and compare with the previous one
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                array[uniqueIndex] = array[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex; // The length of the array with unique elements
    }
}
