package ARRAY;

public class largest {
    public static int larGest(int array[]){
        int lar = Integer.MIN_VALUE;
    
        for(int i = 0; i<array.length ; i++)
        {
            if(lar < array[i])
            {
                lar = array[i];
            }
        }
        return lar;
    }
    public static void main(String args[]){

       int array [] = {10, 20, 30, 40, 50, 60, 70, 80};

        System.out.print("The largest number is:" + larGest(array));

    }
}
