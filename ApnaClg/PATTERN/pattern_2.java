                             // PATTERN 2

                       // (1)1234        (2) 1
                       //    123   and       12
                       //    12              123
                       //    1               1234
import java.util.Scanner;

public class pattern_2 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int counter = sc.nextInt();
    int n = counter;
        
     //    for (1)
    for(int i = 1; i<= counter; i++)
    {
        for(int j=1; j<= n; j++)
        {
            System.out.print(j);
            // counter ++;
        }
        n--;
        System.out.println();
    }
        //    for (2)
    for(int i = 1; i<= counter; i++)
    {
        for(int j=1; j<= i; j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
}
}
