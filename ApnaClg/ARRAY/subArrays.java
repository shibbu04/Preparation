package ARRAY;

public class subArrays {
    public static void printSubArrays(int array[]){
        int ts = 0;

        for(int i =0; i<array.length; i++){
            int start = i;
            for(int j = i; j<array.length; j++){
                int end = j;
                for(int k = start; k<= end; k++){
                    System.out.print(array[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        // System.out.println();
        System.out.print("Total subarrays: " + ts);
    }
    public static void main(String args[]){
        int array[] = {2, 4, 6, 8, 10};

        printSubArrays(array);
    }
}
