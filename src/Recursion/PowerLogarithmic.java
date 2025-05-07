package Recursion;

import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int xn = powerLogarithmic(x,n);
        System.out.println(xn);
    }
    public static int powerLogarithmic(int x, int n){
        if (n==0) return 1;
        int xpnb2 = powerLogarithmic(x,n/2);
        int xn = xpnb2 * xpnb2;

        if(n % 2 == 1){
            xn = xn * x;
        }
        return xn;
    }
}
