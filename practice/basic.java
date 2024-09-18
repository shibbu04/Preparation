

package practice;
import java.util.Arrays;
public class basic {
    public static void main(String[] args) {
        // main fuction
        // calling sort function
        int[] array = {1, 12, 3, 34, 5, 45, 7, 8, 15};
        int result = sortArray(array); // calling helper function
        System.out.println("Second largest element is: " + result);
        
    }
    
    public static int sortArray(int[] array) {
        // helper function
        Arrays.sort(array);
        return array[array.length - 2];
    }
}
