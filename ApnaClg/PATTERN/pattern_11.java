import java.util.Scanner;

public class pattern_11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int counter = sc.nextInt();

        for(int i = 1; i<=counter; i++)
        {
            for(int j =1; j<=(counter-i); j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=counter; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
