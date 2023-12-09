import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4, 7, 2, 6, 3, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] !=arr[correctIndex] ) {

                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}

