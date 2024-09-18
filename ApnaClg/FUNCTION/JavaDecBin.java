package FUNCTION;

import java.util.Scanner;

public class JavaDecBin {

    public static int Dec_Bin(int DecimalNumber){
        int pow = 0;
        int BinaryNumber = 0;
        while(DecimalNumber > 0)
        {
            int remainder  = DecimalNumber%2;
            BinaryNumber = BinaryNumber + (remainder*(int)Math.pow(10, pow));
            pow++;
            DecimalNumber = DecimalNumber/2;
        }
        return BinaryNumber;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int DecimalNumber = sc.nextInt();

    System.out.println(Dec_Bin(DecimalNumber));
    }
}
