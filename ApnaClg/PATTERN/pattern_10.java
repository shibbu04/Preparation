import java.util.Scanner;

public class pattern_10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int counter = sc.nextInt();

        for(int i =1; i<=counter; i++)
        {
            for(int j = 1; j<=i ; j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j<=2*(counter-i) ; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();  
        }

        // mirror image
        for(int i = counter; i>=1; i--)
        {
            for(int j = 1; j<=i ; j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j<=2*(counter-i) ; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
