package HashmapFile;

import java.util.*;

class Main {
  public static void main(String[] args) {
    List<List<Integer>> ans = new ArrayList<>();
    int[] arr = { 1, 1, 1, 2, 2 };// use sorted array
    backtrack(0, arr, 4, new ArrayList<>(), ans);
    System.out.println(ans);
  }

  static void backtrack(int index, int[] arr, int target, List<Integer> ds, List<List<Integer>> ans) {
    if (target == 0) {
      ans.add(new ArrayList<>(ds));
      return;
    }
    for (int i = index; i < arr.length; i++) {

      if (i > index && arr[i] == arr[i - 1]) {
        continue;
      }
      if (arr[i] > target) {
        break;
      }

      ds.add(arr[i]);

      backtrack(i + 1, arr, target - arr[i], ds, ans);
      ds.remove(ds.size() - 1);
    }

  }
}
