package SORTING;

public class bubble {
    public static void BubbleSort(int array[]){
        for(int i = 0; i<array.length-1; i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j]> array[j+1]){

                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int array[]){
        // Ascending order
        for(int i=0; i<array.length; i++){
        System.out.print(array[i] + " ");
    }
    System.out.println();
        // Descending order
        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
    } 
    public static void main(String args[]){
        int array[] = {5, 4, 1, 3, 2, 6};
        BubbleSort(array);
        printArray(array);
    }
}
