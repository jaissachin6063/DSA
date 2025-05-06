import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         //Q.7 : To calculate Fibonacci Series up to n numbers.

        System.out.print("Enter the value of n : ");
        int n = in.nextInt();

        int  first = 0 , second = 1;
        System.out.println("Fibonacci series up to " + n + " numbers");


        for (int i = 0; i <=n ; i++){
            System.out.print(first  + " ");
             int temp = first + second;
             first = second ;
             second = temp;


        }

    }
}
