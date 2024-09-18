package practice;

public class search {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 8, 2, 1 };
        int target = 8;
        int n = arr.length;

        // search element
        for (int i = 0; i < n; i++) {
            if(arr[i] == target){
                System.out.println("Element found at index: " + i + " and value is: " + arr[i]);
                return;
            }
        }
    }
}
