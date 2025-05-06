public class MaxWealth {
    public static void main(String[] args) {

    }
    public  int maximumWealth(int[][] accounts){
        int ans = 0;
        for (int[] ints : accounts) {
            // when you start a col, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have  sum of account of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return  ans;
    }
}
