package Recursion;

import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        displayArray(arr, 0);
    }
    public static void displayArray(int[] arr, int index){
            if (index == arr.length){
                return;
            }
        System.out.println(arr[index]);
        displayArray(arr, index+1);

    }
}
