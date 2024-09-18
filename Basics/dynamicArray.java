package Basics;

import java.util.Scanner;

public class dynamicArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   // scanner class to take input from user

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();   // size of the array
        int[] a = new int[size];  // array declaration
        
        // to take input from user
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            a[i] = sc.nextInt();        // input from user
        }
        
        // to print the array
        for(int i = 0; i < size; i++){
            System.out.print(a[i] + " ");     // print the array
        }
    }
}
