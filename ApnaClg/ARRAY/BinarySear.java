package ARRAY;

import java.util.Scanner;

public class BinarySear{
    public static int BinarySearch(int array[], int key){
        int start = 0, end = array.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(array[mid] == key){
                return mid;
            }
            if(array[mid] < key){
                start = mid +1;
            }
            else{
                end = end -1;
            }
        }
        return -1;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int array[] = {1, 2, 5, 9 , 15, 19, 20, 40};

        int index = BinarySearch(array, key);
        if(index == -1)
        {
            System.out.print("Item not found");
        }
        else{
            System.out.print("The Key is at index: " + BinarySearch(array, key));
        }
    }
}
