import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // Example usage:
        int[] array = {12, 11, 13, 5, 6, 7};
        int[] sortedArray = mergesort(array);

        // Print the sorted array
        System.out.println(Arrays.toString(sortedArray));
    }

    static int[] mergesort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(array, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(array, mid, array.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements if any
        while (i < first.length) {
            mix[k] = first[i];
            k++;
            i++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            k++;
            j++;
        }

        return mix;
    }
}
