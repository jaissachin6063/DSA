import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Q.8 To find out whether the given String is Palindrome or not.

        System.out.print("Enter a  String : ");
        String str = in.nextLine();

        String lowerCaseString = str.toLowerCase();

        String revresedString = new StringBuilder(lowerCaseString).reverse().toString();

        if (lowerCaseString.equals(revresedString)) {
            System.out.println(str + " is  a Palindrome:");
        }else {
            System.out.println(str + " is not a Palindrome!");
        }
    }
}
