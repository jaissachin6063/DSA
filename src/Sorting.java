import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr ={4, 5, 1, 2, 3};
        //bubble(arr);
        //selection(arr);
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

//    static void  insertion (int[] arr){
//        for (int i =1; i < arr.length; i++){
//            int current = arr[i];
//            int j = i-1;
//            while(j >= 0 && current < arr[j]){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            //placement
//            arr[j+1] = current;
//        }
//    }

    static void insertion( int [] arr){
        for (int i = 0; i< arr.length-1; i++){
            for (int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j ,j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int smallest = i;
            for (int j=i+1; j < arr.length; j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

//    static  void selection (int[] arr){
//        for(int i =0; i < arr.length; i++){
//            int last = arr.length-i-1;
//            int maxIndex = getMaxIndex(arr,0,last);
//
//            swap(arr,maxIndex, last);
//        }
//
//    }
//    static  int getMaxIndex(int[] arr, int start, int end){
//        int max = start;
//        for (int i= 0; i <=end; i++){
//            if (arr[max] < arr[i]){
//                max = i;
//            }
//        }
//        return max;
//    }
//
    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }

    static  void bubble (int[] arr){
        // run steps n-1 times
        for (int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}