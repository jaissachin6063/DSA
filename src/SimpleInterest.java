import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         // Q.3 : Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

        System.out.print("Enter the Principle value (P) : ");
        double principle = in.nextDouble();

        System.out.print("Enter the Time in year (T) : ");
        double year = in.nextDouble();

        System.out.print("Enter the Rate of interest (R) : ");
        double rate = in.nextDouble();

        double simpleInterest = ( principle * year * rate ) / 100;

        System.out.print(simpleInterest);
    }
}
