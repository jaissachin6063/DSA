package Pattern;

public class Pattern9 {
    public static void main(String[] args) {
        pattern10(4);
    }

    static void pattern9(int n) {
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");

            }
            System.out.println();

        }
    }

/* output is :
 0 0 0 0 0 0 0 0 0
0 1 1 1 1 1 1 1 0
0 1 2 2 2 2 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 3 4 3 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 2 2 2 2 1 0
0 1 1 1 1 1 1 1 0
0 0 0 0 0 0 0 0 0
 */

    static void pattern10(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");

            }
            System.out.println();

        }
    }
}