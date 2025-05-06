public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345, 2, 6, 7896};
//        System.out.println(findEvenDigits(nums));
        System.out.println(digits2(-34567654));
    }
    static int findEvenDigits(int[] nums){
        int count = 0;
        for (int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count++;
    }
    static boolean even(int num){
        int numOfDigits = digits2(num);
        /*
        if (numOfDigits % 2 == 0){
            return true;
        }
        return false;
        */
       return numOfDigits % 2 ==0;
    }
    static  int digits2(int num){
        if (num < 0){
            num =num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
    /*
    static int digits(int num){
        if (num<0){
            return num*-1;
        }
        if (num ==0){
            return 1;
        }
        int count = 0;
        while (num>0){
            count++;
            num =num/10; //num /= 10;
        }
        return count;
    }

     */

}
