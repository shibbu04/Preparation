import java.util.Scanner;

public class pattern_8 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        int n = 1;
        for(int i = 1; i<= counter; i++)
        {
            for(int j = 1; j<=i ; j++)
            {
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }
}
