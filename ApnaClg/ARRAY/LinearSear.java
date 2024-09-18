package ARRAY;

import java.util.Scanner;

public class LinearSear {
    public static int linearSearch(int array[], int key){
        for(int i=0; i<array.length ;i++)
        {
            if (array [i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    // return -1;

    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int array [] = {10, 20, 30, 40, 50, 60, 70, 80};
            int key = sc.nextInt();

            int index = linearSearch(array, key);
            if (index == -1)
            {
                System.out.print("Item not found...");
            }
            else{
                System.out.print("Item found on Index " + index);
            }
        }
    }
}
