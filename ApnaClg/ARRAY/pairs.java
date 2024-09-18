package ARRAY;

public class pairs {
    public static void printPairs(int array[]){
        int tp = 0;
        for(int i =0 ; i<array.length; i++){
            int current = array[i];
            for(int j = i+1; j<array.length; j++){
                System.out.print("("+ current + "," + array[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total pairs: " + tp);
    }
    public static void main(String args[]){
        int array[] = {2, 4, 6, 8, 10, 12};

        printPairs(array);
    }
}
