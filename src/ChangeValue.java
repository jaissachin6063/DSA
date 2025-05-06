import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int arr[] = {1, 2, 3, 45 , 6};
        changearr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changearr(int[] num) {
        num[0] = 99; // if you make a change to the object via this variable  same object will be change
    }
}
