package Basics;

public class searchElementInArray {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 60, 100};
        int target = 60;

        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == target){
                System.out.println("Element found at index : " + i);
                System.out.println("Found item is : " + arr[i]);
                // break;
            }
        }
    }
}
