package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int nums[] ={5, 6, 2, 3, 1};
        System.out.println("After sorting: ");
        for (int num: nums){
            System.out.print(num + " ");
        }
        int n = nums.length;
        for(int i =1; i<n; i++){
            int key = nums[i];
            int j = i-1;
            while (j>=0 && nums[j]>key ){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
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
