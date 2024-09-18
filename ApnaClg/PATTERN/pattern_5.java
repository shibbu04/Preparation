//  PATTERN 5
// star pyramid
//     *
//    * *
//   * * *
//  * * * *
                
import java.util.Scanner;

public class pattern_5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int counter = sc.nextInt();

        for(int i = 1; i<= counter; i++)
        {
            for(int j = 1; j<= counter; j++)
            {
                System.out.print(" ");
                if((i + j) >= 5){
                System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
