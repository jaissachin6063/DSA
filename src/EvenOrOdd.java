import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Q.1 :  Write a program to print whether a number is even or odd, also take input from the user.

        System.out.print("Enter the number :");
        int num = in.nextInt();

        if (num % 2 == 0 ){
            System.out.print("This number is EVEN!");
        }else {
            System.out.print("This number is ODD!");
        }
    }
}
