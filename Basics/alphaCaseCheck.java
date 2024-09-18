package Basics;

import java.util.Scanner;

public class alphaCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        } else {
            System.out.println("Invalid character");
        }
}
}