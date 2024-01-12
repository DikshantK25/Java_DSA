package Recursion4;

import java.util.*;

public class Q3 {
  // only one subsquence
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    int[] arr = { 1, 2, 1 };
    int target = 2;
    System.out.println(printSubSum(0, arr, 0, list, target));
  }

  static boolean printSubSum(int index, int[] arr, int sum, List<Integer> list, int target) {
    if (index == arr.length) {
      if (sum == target) {
        System.out.println(list);
        return true;
      }
      return false;
    }

    // Include the current element in the subarray
    list.add(arr[index]);
    if (printSubSum(index + 1, arr, sum + arr[index], list, target) == true) {
      return true;
    }

    // Exclude the current element from the subarray
    list.remove(list.size() - 1);

    if (printSubSum(index + 1, arr, sum, list, target) == true) {
      return true;
    }
    return false;
  }
}