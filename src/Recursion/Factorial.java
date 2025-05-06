package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }
    static int factorial(int n){
        if(n == 1) return 1;
        int fn1 = factorial(n-1);
        int fn = n*fn1;
        return fn;
    }

}
