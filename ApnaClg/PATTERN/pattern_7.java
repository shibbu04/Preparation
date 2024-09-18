import java.util.Scanner;

public class pattern_7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int counter = sc.nextInt();
        int n = counter;

        for(int i = 1; i<=counter ; i++)
        {
            for(int j = 1; j<=n ; j++)
            {
                System.out.print(j);
            }
            n--;
            System.out.println();
        }


    }
}
