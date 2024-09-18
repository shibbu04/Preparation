package Basics;

import java.util.*;

public class largest{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter first numbers: ");
    int a = in.nextInt();
    System.out.print("Enter second numbers: ");
    int b = in.nextInt();
    System.out.print("Enter third numbers: ");
    int c = in.nextInt();
    
    int max = a;
    if(a < b){
        max = b;
    }
    if(b < c){
        max = c;
    }
    System.out.println(max);
}
}