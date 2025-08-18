package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int nums[]= {6, 5, 2, 8, 9, 4};
        int n = nums.length;
        System.out.println("Before sorting: ");
        for (int num: nums){
            System.out.print(num + " ");
        }
        for (int i =0; i < n-1; i++){
            int min = i;
            for (int j=i+1; j < n; j++){
                if (nums[min] > nums[j]){
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;

            System.out.println();
            for (int num: nums){
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("After sorting: ");
        for (int num: nums){
            System.out.print(num + " ");
        }
    }
}
