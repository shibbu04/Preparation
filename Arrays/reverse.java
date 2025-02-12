package Arrays;

import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        int start = 0;
        int end = size - 1;

        // reverse
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // reversed array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
