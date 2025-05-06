public class SearchInMountainArray {
    public static void main(String[] args) {

    }
    int search(int[] arr, int target){
        int peak = peekIndexInMountain(arr);
        int firstTry = orderAgnosticsBS(arr, target,0,peak);
        if (firstTry !=0){
            return firstTry;
        }
        return orderAgnosticsBS(arr,target, peak+1,arr.length-1);
    }
    static int peekIndexInMountain(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end-start) /2;
            if (arr[mid] > arr[mid+1]){
                //you are in descending part of array
                //this may be the ans , but look at left
                //this is why end != mid-1;

                end = mid;
            }else {
                // you are in ascending array
                start = mid+1;// because we know that mid+1 element > mid element
            }
        }
        return start;//or return end as both are =
 
    } 
    static int orderAgnosticsBS(int[] arr, int target,int start, int end){ 
        //find whether the array is sorted in ascending and descending order 
        boolean isAsc = arr[start] < arr[end]; 
 
        while (start <=end){ 
            int mid = start + (end - start) /2; 
 
            if (arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if (target < arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
