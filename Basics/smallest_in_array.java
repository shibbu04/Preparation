package Basics;

public class smallest_in_array {
    public static void main(String[] args) {
        int arr[] = {2,5,3,4,1};
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print("Smallest element in the array is : " + min);
    }
}
