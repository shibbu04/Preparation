package FUNCTION;

import java.util.Scanner;

public class JavaBinDec {

    public static int Bin_Dec(int binaryNumber){

        int dec = 0;
        int pow = 0;
        while(binaryNumber > 0)
        {
            int lastDigit = binaryNumber%10;
            dec = dec + (lastDigit*(int)Math.pow(2, pow));
            pow++;
            binaryNumber = binaryNumber/10;
        }
        return dec;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int binaryNumber = sc.nextInt();

        System.out.println(Bin_Dec(binaryNumber));
    }
}
