package Recursion;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printZigZag(n);

    }
    public static void printZigZag(int n){
        if(n == 0) return;
        System.out.println("Pre" +n);
        printZigZag(n-1);
        System.out.println("In" +n);
        printZigZag(n-1);
        System.out.println("Post" +n);
    }
}
