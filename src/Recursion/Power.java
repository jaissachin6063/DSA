package Recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int xn = power(x,n);
        System.out.println(xn);
    }
    public static int power(int x,int n){
        if (n == 0) return 1;
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
}
