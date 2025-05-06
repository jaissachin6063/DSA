import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        String personalised = myGreet(name);
        System.out.println(personalised);

    }

    static  String myGreet(String name){

        return "Hello "  + name;
    }


}
