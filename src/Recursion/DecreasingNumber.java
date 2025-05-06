package Recursion;

import java.util.Scanner;

public class DecreasingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printDecreasing(n);
    }
    static void printDecreasing(int n){
        if(n == 0) return;
        System.out.println(n);
        printDecreasing(n-1);

    }
}
