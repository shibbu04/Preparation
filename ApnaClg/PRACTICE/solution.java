package PRACTICE;

public class solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }
    
    public static void main(String args[]){
        int nums[] = {2, 7, 11, 14};
        int target  = 9;

        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

