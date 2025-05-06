package Pattern;
public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern6(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row ;
            int noOfSpace = n - totalColsInRow;
            for (int s = 0; s < noOfSpace  ; s++) {
                System.out.print(" ");
                
            }
            for (int cols = 0; cols < totalColsInRow; cols++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
}
/* output is :

                       *
                      * *
                     * * *
                    * * * *
                   * * * * *
                    * * * *
                     * * *
                      * *
                       *

 */