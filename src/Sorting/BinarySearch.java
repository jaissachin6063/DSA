package Sorting;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {5, 6, 8, 9, 11, 13, 17};

        int target = 11;


        int result = binarySearch1(nums, target);
        if (result != -1) {
            System.out.println("Element found at index:" + result);
        } else {
            System.out.println("Element not found: ");
        }
    }

    public static int binarySearch1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                //left = mid + 1;
                right = mid - 1;
            } else {
                //right = mid - 1;
                left = mid + 1;
            }

        }
        return -1;
    }
}

