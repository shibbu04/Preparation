package FUNCTION;

import java.util.Scanner;

public class JavaProduct {

    public static int ProductOfTwo(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(ProductOfTwo(a ,b));
    }
}
