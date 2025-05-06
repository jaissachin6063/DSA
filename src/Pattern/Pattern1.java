package Pattern;

public class Pattern1 {
    public static void main(String[] args) {
        pattern(4);
    }
    static  void pattern( int n ){
        for (int row=1 ; row <= n ; row++){ // if you want to change the row in format of i you can change it
            // for every row , run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when your first row is printed we need to new line
            System.out.println();
        }
    }
}
/* output is :
*
* *
* * *
* * * *

 */