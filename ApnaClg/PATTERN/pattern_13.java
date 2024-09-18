import java.util.Scanner;

public class pattern_13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int counter = sc.nextInt();

        //    for (1)
        for(int i = 1; i <= counter; i++)
        {
            for(int j = 1; j <= counter-i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i-1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // for (2)
        for(int i = counter; i >= 1; i--)
        {
            for(int j = 1; j <= counter-i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i-1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
