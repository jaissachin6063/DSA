import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Sachin";
        char target = 'c';
        // System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    static  boolean search2(String str , char target){
        if(str.length() == 0){
            return  false;
        }
        // for all the character of the array is print to use  str.toCharArray()
        for (char ch: str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
    static  boolean search(String str , char target){
        if(str.length() == 0){
            return  false;
        }
        for (int i= 0; i < str.length(); i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
