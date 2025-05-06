import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Here are the all 3 digits  ArmStrong number:");
        for (int i= 100 ; i < 1000 ; i++){
            if(isArmStrong(i)){
                System.out.printf( i + "  ");
            }
        }

    }
    // print all the 3 digits ArmStrong number

    static  boolean isArmStrong(int n ){
        int original = n;
        int sum = 0;

        while( n > 0){
            int rem = n % 10;
            n = n/10;
            sum = sum + rem * rem * rem;
        }

        return sum == original;
    }
}
