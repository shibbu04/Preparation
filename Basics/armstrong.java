package Basics;

import java.util.Scanner;

public class armstrong {              // armstrong numbers are numbers whose sum of cubes of digits is equal to the number itself
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int temp = n;
        int num = 0;

        while (n > 0) {
            int rem = n % 10;
            num = num + rem * rem * rem;
            n = n / 10;
        }
        // System.out.println(num);
        if (num == temp) {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an Armstrong number");
        }
    }
}