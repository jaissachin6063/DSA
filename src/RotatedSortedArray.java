public class RotatedSortedArray {
    public static void main(String[] args) {

    }
    static int search(int[] nums, int target){
        int pivot = findPivot(nums);
        //if not find pivot the array is not sorted
        if (pivot == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if (nums[pivot]== target){
            return pivot;
        }
        if (target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums, target, pivot+1,nums.length-1);
    }

    static int binarySearch(int[] arr, int target,int start,int end) {
        while (start <= end) {
            // int mid = (start+end)/2  might be possible that (start+end) exceed the range of int in java
            int mid = start + (end - start) / 2;//same as formula is mid =(start + end)/2

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static  int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start +(end-start)/2;
            //4 cases over here
            if (mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return  mid-1;
            }
            if (arr[mid] <= arr[start]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
    static  int findPivotWithDuplicates(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid+1]){
                return  mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the Duplicates
                if (start<end && arr[start] >arr[start+1]){
                    return start;
                }
                start++;

                if (end > start && arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start]==arr[mid] && arr[mid] > arr[end])) {
                start = mid+1;

            }else {
                end = mid-1;
            }
        }
        return -1;
    }

}
