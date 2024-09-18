package Basics;
import java.util.*;
public class copyOf_equlas_sort {
    public static void main(String[] args) {
        int arr [] = {2,5,3,4,1};
        int arr2 [] = {2,5,3,4,1};
        int arr3 [] = {2,5,3,4,1,6};

        // sort array
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        // equals array 
        boolean result = Arrays.equals(arr, arr3);     // arr2(true) and arr3()false)
        System.out.println("Both arrays are equal :" + result);


        // copyOf array
        for(int i = 0; i < arr.length; i++){
            int arr4[] = Arrays.copyOf(arr, arr.length);
            System.out.print(arr4[i] + " ");
        }
    }
}
