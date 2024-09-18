package Basics;

public class sum_of_array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int sum = 0;
        System.out.print("Array elements are : ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            // sum
            sum = sum + arr[i];
        }
        System.out.println("Sum of array elements is : " + sum);
    }
}
