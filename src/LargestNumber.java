import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Q.5 Take 2 numbers as input and print the largest number.

        System.out.print("Enter first number :  ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number :  ");
        int num2 = in.nextInt();

        if (num1 > num2) {
            System.out.print("num1 is the largest number : ");
        } else {
            System.out.print("num2 is the largest number : ");
        }
    }
}
