package practice;

public class numReeverse {
    public static void main(String[] args) {
        int n = 12345;

        while(n>0)
        {
            int rem = n % 10;
            n = n / 10;
            System.out.print(rem);
        }  
    }
}

