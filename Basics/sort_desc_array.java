package Basics;

import java.util.*;

public class sort_desc_array {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 8, 7, 1 };
        // Arrays.sort(arr);
        // System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}