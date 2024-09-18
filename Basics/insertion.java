package Basics;

import java.util.Arrays;

public class insertion {
    public static int[] insert(int arr[], int pos, int element){
        
        int[] newArr = new int[arr.length + 1];

        // copy the elements upto pos 
        for(int i = 0; i < pos; i++){
            newArr[i] = arr[i];
        }

        // insert the element at pos in new array 
        newArr[pos] = element;

        // copy the rest elements after pos

        for (int i = pos; i < arr.length ; i++){
            newArr[i+1] = arr[i];
        }

        // print the new array
        return newArr;
    }
    public static void main(String[] args) {
        int arr [] = {5, 2, 4, 6, 1, 3};
        int pos = 1;
        int element = 10;
        
        arr = insert(arr, pos, element);
        System.out.print("Array after insertion: " + Arrays.toString(arr));
    }
}
