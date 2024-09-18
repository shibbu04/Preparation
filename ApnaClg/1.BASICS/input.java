import java.util.*;

public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  //input function

        // for till first space 
        String input = sc.next();   
        System.out.println(input);

        //for full name or whole line
        String name = sc.nextLine();
        System.out.println(name);

        //for taking numbers as input
        int number = sc.nextInt();
        System.out.println(number);

        //for taking float numbers as input
        float price = sc.nextFloat();
        System.out.println(price);

    }
}
