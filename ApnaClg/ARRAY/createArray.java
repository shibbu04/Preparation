package ARRAY;

public class createArray {
    public static int printArray(int array[]){
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        return 0;
    }
    public static void main(String args[]){
        int array[] = {1, 2, 3, 4, 5};

        printArray(array);


    }
}

