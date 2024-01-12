package Recursion4;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int ans = printCount(0, arr, 0, 2);
        System.out.println(ans);
    }

    static int printCount(int index, int[] arr, int sum, int target) {
        if (index == arr.length) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }
        sum=sum + arr[index];
        int l = printCount(index + 1, arr, sum, target);

        sum= sum- arr[index];
        int r = printCount(index + 1, arr, sum, target);

        return l + r;
    }
}
