                           // PATTERN 3

                       // (1)4444        (2) 1
                       //    333   and       22
                       //    22              333
                       //    1               4444
import java.util.*;
public class pattern_3 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int counter = sc.nextInt();
    int n = counter;

     //    for (1) 

    for(int i = 1; i<= counter; i++)
    {
        for(int j=1; j<= n; j++)
        {
            System.out.print(n);
        }
        n = n-1;
        System.out.println();
    }
        //    for (2)

    for(int i = 1; i<= counter; i++)
    {
        for(int j=1; j<= i; j++)
        {
            System.out.print(i);
        }
        System.out.println();
    }
}
}
