import java.util.Scanner;

public class CalculateValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Q.4 : Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions).

        System.out.print("Enter first number : ");
        double num1 = in.nextDouble();

        System.out.printf("Enter second number : ");
        double  num2 = in.nextDouble();

        System.out.print("Enter an operator (+, -, *, /) : ");
        char operator = in.next().charAt(0);

      // To store all the value in one variable.
        double result = 0;


        if (operator == '+' ){
            result  = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0){
                result = num1 / num2;
            }else {
                System.out.println(" Error!! This is infinitive value!!");
            }
        }else {
            System.out.println("Invalid operator!! ");
        }

        System.out.printf("The result is  " + result );
    }
}
