import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr ={5,4,3,2,17};
        System.out.println(Arrays.toString(checkBubbleSort(arr)));
    }



    static int[] checkBubbleSort(int[] nums){
        boolean swapped;
        for(int i = 0; i <nums.length ; i++) {
            swapped = false;
            for(int j = 1; j <nums.length-i ; j++) {
                if(nums[j]<nums[j-1]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                    swapped=true;
                }

            }
            if(!swapped){
                break;
            }

        }
        return nums;

    }
}
