package Recursion;

import java.util.Scanner;

public class IncreasingNumber {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int n = 5;
        printIncreasing(n);
    }
    static void printIncreasing(int n){
        if (n == 0) return;
        printIncreasing(n-1);
        System.out.println(n);
    }
}
