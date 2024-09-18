package MATRIX;

import java.util.Scanner;

public class basics {
    // serach function 
    public static boolean Search(int Matrix[][], int key){
        for(int i = 0; i<Matrix.length ; i++)
        {
            for(int j = 0; j<Matrix[0].length ; j++)
            {
                if(Matrix[i][j] == key){
                    System.out.print("Item found at cell ("+ i +","+ j +")");
                    return true;
                }
            }
            System.out.println();
        }
        System.out.print("Key not found");
        return false;
    }
    public static void main(String args[]){

        // assigning 2D matrix
        int Matrix[][] = new int[3][3];
        int m = Matrix.length , n = Matrix[0].length;

        Scanner sc = new Scanner(System.in);

        // input loop
        for(int i = 0; i<m ; i++)
        {
            for(int j = 0; j<n ; j++)
            {
                Matrix[i][j] = sc.nextInt();
            }
        }

        // output loop
        for(int i = 0; i<m ; i++)
        {
            for(int j = 0; j<n ; j++)
            {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

        // FUNCTION CALLING
        Search(Matrix, 5);
    }
}
