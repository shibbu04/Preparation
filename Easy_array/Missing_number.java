package Easy_array;

public class Missing_number {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};  // Array of size n = 5, missing number is 3
        int missingNumber = findMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array) {
        int n = array.length; // Length of the array (n)
        
        // Calculate the sum of numbers from 1 to n+1
        int totalSum = (n + 1) * (n + 2) / 2;
        
        // Sum of all elements in the array
        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }
        
        // The missing number is the difference between totalSum and arraySum
        return totalSum - arraySum;
    }
}

