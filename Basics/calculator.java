package Basics;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.print("Enter first number: ");   
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.print("Enter the operator: ");
        char op = in.next().trim().charAt(0);

        switch(op){
            case '+': 
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if(b != 0){
                    System.out.println(a / b);
                    break;
                }
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
