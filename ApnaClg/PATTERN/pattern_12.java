import java.util.Scanner;

public class pattern_12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int counter = sc.nextInt();

        for(int i =1; i<= counter; i++)
        {
            for(int j = 1; j<= (counter-i); j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=counter; j++)
            {
                if(i == 1 || i == counter || j == 1 || j==counter)
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
