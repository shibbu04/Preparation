package Basics;

import java.util.Scanner;

public class FibonaciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        // First two terms
        int first = 0, second = 1;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        // Print first two terms
        System.out.print(first + " " + second);

        // Loop to print the Fibonacci series
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}

