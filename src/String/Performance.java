package String;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch  = (char)('a' + i);
            //System.out.println(ch);// it gives output is a to z

            series = series + ch ;// series += ch

            // Here its creating new object.
        }
        System.out.println(series); // print a to z in one line

    }
}
