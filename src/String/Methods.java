package String;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name  = "Sachin Jaiswal";
        System.out.println(Arrays.toString(name.toCharArray())); // print individually characters like that S,a,c,h,i,n etc..
        System.out.println(name.toLowerCase());// in lower case print
        System.out.println(name.indexOf('a'));// print the position of the string
        System.out.println("         Sachin      ".strip());// remove white spaces
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
