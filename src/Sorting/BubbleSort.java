package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {6, 8,  9, 2, 4, 5};
        int n = nums.length;
        System.out.println("Before Sorting: ");
        for (int num: nums){
            System.out.print(num + " ");
        }
        for (int i = 0; i < n; i++) {
            for(int j=0; j<n-i-1; j++){
                if (nums[j+1] < nums[j]){
                    int temp = nums[j+1];
                    nums[j+1] =nums[j];
                    nums[j] = temp;


                }
            }
            System.out.println();
            for (int num: nums){
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("After Sorting: ");
        for (int num: nums){
            System.out.print(num + " ");
        }


    }
}
