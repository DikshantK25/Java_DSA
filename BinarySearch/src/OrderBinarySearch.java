public class OrderBinarySearch {
    public static void main(String[] args) {
        int[] arr = {100, 99, 88, 77, 66, 55, 44, 33, 22, 11};
        int target = 36;

        int ans =check(arr,target);
        System.out.println(ans);
    }
    static  int check(int[] nums, int target){
        int start =0;
        int end=nums.length-1;

        //find whether its ascending or Decending
        boolean isAsc= (nums[0]<nums[nums.length-1]);
        while(start<= end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]) {
                return mid;
            }

            if(isAsc) {
                if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;

                }
            }
            else {
                    if (nums[mid] > target) {
                        start = mid +1;
                    } else {
                        end = mid -1;

                    }
                    }

                }
            return -1;
            }
        }


