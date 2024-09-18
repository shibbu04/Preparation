                               // PATTERN 1

                       // (1)****         (2) *
                       //    ***    and       **
                       //    **               ***
                       //    *                ****

import java.util.Scanner;

public class pattern_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int counter = sc.nextInt();

        //    for (1)
        for(int i = 1; i <= counter; i++)
        {
            for(int j = i; j <= counter ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // for (2)
        for(int i = 1; i <= counter; i++)
        {
            for(int j = 1; j <= i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
