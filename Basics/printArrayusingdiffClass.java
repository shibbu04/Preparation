package Basics;
import java.util.Arrays;

public class printArrayusingdiffClass {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        String[] arr = {"Hello", "World", "Java"};

        // passes refrence of array to printArray method
        System.out.print("Tostring: " + Arrays.toString(arr));
        System.out.println();
        // passes refrence of array to printArray method
        System.out.print("AsList: " + Arrays.asList(arr));
        // passes refrence of array to printArray method in two dimentional array
        System.out.println();
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.print("deepToString: " + Arrays.deepToString(a));
    }
}
