package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t1d = in.nextInt();
        int t2d = in.nextInt();
        int t3d = in.nextInt();
        toh(n, t1d, t2d, t3d);

    }
     public static void  toh(int n, int t1id, int t2id, int t3id){
        if (n == 0){
            return;
        }

        toh(n-1, t1id, t3id, t2id);//
         System.out.println(n+" from "+t1id+" to "+t2id);
         toh(n-1, t3id, t2id, t1id);

    }
}
