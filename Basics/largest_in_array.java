package Basics;

import java.util.*;

public class largest_in_array{

    public static void main(String[] args) {
        int arr[] = {2,5,3,4,1};
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print("Largest element in the array is : " + max);
    }
}