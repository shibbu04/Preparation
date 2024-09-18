package Basics;

public class printArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};   // array declaration and initialization

        // to print the array using for loop
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");     // print the array
        // }

        // using for-each loop
        for(int i : arr){
            System.out.print(i + " ");     // print the array
        }
    }
}
