import java.util.Arrays;



public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println("before: "+Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("after: "+Arrays.toString(arr));
    }


    private static int[] insertionSort(int[] arr) {
        int n=arr.length;
        for(int i = 0; i < n-1 ; i++) {
            for(int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1 );
                }else{
                    break;
                }

            }

        }
        return  arr;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
