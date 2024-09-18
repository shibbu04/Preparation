import java.util.Scanner;

public class reverse_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        // int reverse = 0;     //for alternative way
        
        while(number > 0)
        {
            int reverse = number%10;
            System.out.print(reverse);
            number = number/10;

            // Alternative way
            // int num = number % 10;
            // reverse = (reverse*10) + num;
            // number = number/10;
        }
        System.out.println();
        // System.out.println(reverse);    // for alternative way
    }
}