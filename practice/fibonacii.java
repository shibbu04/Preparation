package practice;

// fibonacii series is a series of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

public class fibonacii {
    public static void main(String[] args) {
        int nth = 10;
        int first = 0;
        int second = 1;
        int next;

        System.out.print(first + " " + second);

        for(int i=2; i<nth; i++)
        {
            next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}

// Output: 0 1 1 2 3 5 8 13 21 34
// first = 0, second = 1, next = 0 + 1 = 1      0 1 1
// first = 1, second = 1, next = 1 + 1 = 2     0 1 1 2
// first = 1, second = 2, next = 1 + 2 = 3      `0 1 1 2 3
// first = 2, second = 3, next = 2 + 3 = 5      0 1 1 2 3 5



// second largest number in an array
// sort array in ascending order
// 1 2 3 4 5
// print 2nd last element = [array.length - 2]