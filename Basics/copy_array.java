package Basics;

public class copy_array {
    public static void main(String[] args) {
        // array 1
        int arr[] = {1, 2, 3, 4, 5};
        System.out.print("Original Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        // array 2
        int arr1[] = new int[arr.length];

        System.out.print("\nCopied Array: ");
        for(int i = 0; i < arr.length; i++){
            // copying array
            arr1[i] = arr[i];
            System.out.print(arr1[i]);
        }
    }
}
