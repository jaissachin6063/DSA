import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Q.2 : Take name as input and print a greeting message for that particular name.


        System.out.print("Enter the name : ");
        String name = in.next();

        System.out.printf("Hello "  +   name  +  "  welcome to the programming!  ");
    }
}
