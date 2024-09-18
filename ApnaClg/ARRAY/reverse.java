package ARRAY;

public class reverse {
    public static void Reverse(int array[]){
        int start = 0, last = array.length-1;

        while(start < last){
            int temp = array[last];
            array[last] = array[start];
            array[start] = temp;

            start++;
            last--;
        }
    }
    public static void main(String args []){
        int array[] = {1, 2, 3, 5, 8,10};

        Reverse(array);
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
