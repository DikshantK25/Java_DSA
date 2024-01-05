import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
         mergesort(array,0, array.length-1);

        // Print the sorted array
        System.out.println(Arrays.toString(array));
    }

    static void mergesort(int[] array,int start ,int end) {
        if (end -start == 1) {
            return ;
        }

        int mid = array.length / 2;
        mergesort(array, 0, mid);
        mergesort(array, mid, array.length);

   merge(array, start, mid, end);
    }

    static void merge(int[]array ,int start,int mid, int end) {
        int[] mix = new int[end- start];
        int i = 0, j = 0, k = 0;

        while (i < mid && j < end) {
            if (array[i] < array[j]) {
                mix[k] = array[i];
                i++;
            } else {
                mix[k] = array[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements if any
        while (i < mid) {
            mix[k] = array[i];
            k++;
            i++;
        }

        while (j < end) {
            mix[k] = array[j];
            k++;
            j++;
        }
        for (int l = 0; l < mix.length; l++) {
            array[l]=mix[l];

        }
    }
}

