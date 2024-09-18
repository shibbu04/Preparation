package Easy_array;

public class MoveZeroesEnd {
    public static void moveZeroes(int[] arr) {
        int n = arr.length;
        int lastNonZeroIndex = 0;

        // Move non-zero elements to the front of the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // Swap elements
                int temp = arr[lastNonZeroIndex];
                arr[lastNonZeroIndex] = arr[i];
                arr[i] = temp;

                lastNonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        moveZeroes(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
