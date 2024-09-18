import java.util.Scanner;

public class pattern_6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int counter = sc.nextInt();

        for(int i =1; i<=counter; i++)
        {
            // for spaces
            for(int j = 1; j<= (counter-i); j++)
            {
                System.out.print(" ");
            }

            // for star
            for(int j = 1;j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
