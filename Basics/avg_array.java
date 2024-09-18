package Basics;

public class avg_array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        double avg = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        avg = sum / n;
        System.out.println("Average of the array is: " + avg);
    }
}
