package practice;

public class largest {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 8, 2, 1 };
        int n = arr.length;
        int max = arr[0];   // 5 
                        
        // largest element
        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest element is: " + max);
    }
}
