package practice;

// armstrong number is a number that is equal to the sum of cubes of its digits.
public class armstrong {
    public static void main(String[] args) {
        int n = 153;
        int temp = n; 
        int sum = 0;

        while(n>0)
        {
            int rem = n % 10; // 3
            n = n / 10; // 15
            sum = sum + (rem * rem * rem);
        }
        if(sum == temp)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an armstrong number");
        }


    }
}
// sum = 0 + (3*3*3) = 27
// sum = 27 + (5*5*5) = 152
// sum = 152 + (1*1*1) = 153

// (1 cube + 5 cube + 3 cube) = 153