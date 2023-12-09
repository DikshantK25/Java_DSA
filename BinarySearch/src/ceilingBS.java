public class ceilingBS {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2, 3, 5,14,16,18,22,45,89};
        int target = 15;

        int ans =check(arr,target);
        System.out.println(ans);

    }


    //return  the index of smallest no>=target
    static int check(int[] nums,int target){
        int end = nums.length - 1;
        int start = 0;


        //what if the target element is greater than the greatest number in the array
               if(target> nums[nums.length-1]){
                   return -1;
               }

        for (int i = 0; i < nums.length; i++) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] < target) {
                    start = mid +1;
                } else if (nums[mid] > target) {
                    end = mid -1;

                } else {

                    return nums[mid];
                }

            }
        }
        return nums[start];

    }
}


