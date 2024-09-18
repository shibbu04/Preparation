package practice;
import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1}; 
         int n = arr.length;                            // 4 3 2 1 (i + 1)
        // sorted array 
        for(int i = 0 ; i < n; i++){    // itertaing over the array
            for(int j = i+1; j < n; j++){   // comparing the elements
                if(arr[i] > arr[j]){
                    // swap 
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


