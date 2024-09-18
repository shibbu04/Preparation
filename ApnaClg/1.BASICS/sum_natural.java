import java.util.Scanner;

public class sum_natural {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = 1;
        int sum = 0;
        System.out.println("Enter the boundary number :");
        int counter = sc.nextInt();

        while(n <= counter)
        {
            sum =sum + n;
            n = n + 1;
        }
        System.out.println(sum);
    }
}
