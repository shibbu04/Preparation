import java.util.Scanner;

public class square_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int counter = sc.nextInt();

        for(int i = 1; i<=counter; i++)
        {
            for (int n = 1; n <= counter; n++ )
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
