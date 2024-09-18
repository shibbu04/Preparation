package Arrays;

import java.util.*;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Enter first index number: ");
        int index1 = in.nextInt();
        System.out.print("Enter second index number: ");
        int index2 = in.nextInt();

        // swap 
        for(int i = 0; i < arr.length; i++){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
        System.out.print(Arrays.toString(arr));
    }
    
}
