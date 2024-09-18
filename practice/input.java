package practice;

import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        // input 
        Scanner puru = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = puru.nextInt();   // 5

        int arr[] = new int[n];     // new int[5]

        // input array
        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < n ; i++){
            arr[i] = puru.nextInt();
        }

        // output array
        System.out.print("Array is: ");

        for(int i = 0; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }


}


