package String;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');//195 giving the value of  a & b
        System.out.println("a" + "b"); // ab it is string that's why it is add
        System.out.println((char) ('a' +3));// d

        System.out.println('a' + 1);// 98
        // this is same as  after a few steps: "a" + 1
        //integer will be converted to integer that will call toString()

        System.out.println("Sachin" + new ArrayList<>());// Sachin[]
        System.out.println("Sachin" + new Integer(56));//sachin56

        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);// 56[]

        System.out.println("a" + 'b');//ab


    }
}
