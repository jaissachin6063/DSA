import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Q.6 : Input currency in rupees and output in USD.
        System.out.print("Enter the currency in rupees(INR): ");
        double rupees = in.nextDouble();

         double conversionRate = 0.012;

         double USD = rupees * conversionRate ;

        System.out.print("The amount in Us Dollers (USD) : "  + USD );
    }
}
