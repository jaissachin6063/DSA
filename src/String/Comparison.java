package String;

public class Comparison {
    public static void main(String[] args) {
        String a = "Sachin";
        String b = "Sachin";
        String c = a;
       // System.out.println(c==a);//true
        // System.out.println(a==b);// true


        String name1 = new String("Sachin");
        String name2 = new String("Sachin");

       // System.out.println(name1==name2);// false

        System.out.println(name1.equals(name2));// true




    }
}
