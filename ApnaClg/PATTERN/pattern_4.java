                 // Pattern 4
                 // *****
                 // *   *
                 // *   *
                 // *****

import java.util.Scanner;

public class pattern_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows :");
        int rows = sc.nextInt();
        System.out.println("Enter columns :");
        int columns = sc.nextInt();

        for(int i = 1; i<= rows ; i++)
        {
            for(int j = 1; j <= columns ; j++)
            {
                if(i == 1 || i == rows || j == 1 || j == columns)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
