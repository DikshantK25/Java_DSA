public class AscBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 1;

        int ans =check(arr,target);
        System.out.println(ans);

    }

        static int check(int[] nums,int target){
            int end = nums.length - 1;
            int start = 0;
            for (int i = 0; i < nums.length; i++) {
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (nums[mid] < target) {
                        start = mid +1;
                    } else if (nums[mid] > target) {
                        end = mid -1;

                    } else {

                        return mid;
                    }

                }
            }
            return -1;

    }
}
