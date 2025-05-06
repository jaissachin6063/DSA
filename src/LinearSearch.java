public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 34, 45, -12 , 56 , 19 , -11 , 28};
        int target = 20;
        boolean  ans = linearSearch3(nums, target);
        System.out.println(ans);

    }
//  Search the target and return true or false :

    static  boolean linearSearch3(int[] arr , int target){
        if(arr.length == 0){
            return  true;
        }
        for (int element : arr){

            if (element == target){
                return true ;
            }
        }
        return false;
    }

    // search the target and return the element :
    static  int linearSearch2(int[] arr , int target){
        if(arr.length == 0){
            return  -1;
        }
        for (int element :arr){

            if (element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
//    search the array : return the index if item found
    // otherwise if item not found return -1
    static  int linearSearch(int[] arr , int target){
        if(arr.length == 0){
            return  -1;
        }
        for (int index=0; index < arr.length ; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
