package String;

public class SB {// String Builder is already is a class

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' +i);
            builder.append(ch);

            // Here  are not creating the new object
        }
        System.out.println(builder.toString());
        builder.deleteCharAt(0);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
    }
}
