package Bitwise;

public class PowOfTwo {
    public static void main(String[] args) {
        int n = 16; // note: fix for n = 0
        boolean ans = (n & (n-1) ) == 0;
        System.out.println(ans);
    }
}
// This can be give the number which is power of 2