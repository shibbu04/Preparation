package Basics;

import java.util.Arrays;
public class deletion{
    public static void main(String[] args) {
        int arr [] = {5, 2, 4, 6, 1, 3};
        int pos = 1;
        // int element = 10;
        
        arr = delete(arr, pos);
        System.out.print("Array after deletion: " + Arrays.toString(arr));
    }

    public static int[] delete(int arr[], int pos){

        int newArr[] = new int[arr.length - 1];

        // copy the elements upto pos
        for(int i = 0; i < pos; i++){
            newArr[i] = arr[i];
        }

        // delete the element at pos in new array
        for(int i = pos; i < arr.length - 1; i++){
            newArr[i] = arr[i+1];
        }

        return newArr;
    }
}