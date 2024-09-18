package FUNCTION;

import java.util.Scanner;

public class JavaPrime {

    public static boolean isPrime(int num){
        boolean isPrime = true;
        for(int i = 2; i<=(num-1);i++)
        {
            if(num%i == 0)
            isPrime = false;
        }
        return isPrime;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(isPrime(num));

    }
}
