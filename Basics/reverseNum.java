package Basics;

import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int num = 0;

        while(n>0){
            int rem = n % 10;
            num = num * 10 + rem;
            n = n / 10;
        }
        System.out.println(num);
    }
}
