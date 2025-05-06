package Recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print( int n ){
        //base condition
        if (n == 5){
            System.out.println(5);
            return;
        }
        // recursive call
        //if you are calling a function again and again , you can treat it is separate call in the stack
        System.out.println(n);

        // Tail recursion
        print(n+1);
    }
}
