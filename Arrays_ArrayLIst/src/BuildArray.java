import java.util.Arrays;
import java.util.Scanner;

public class BuildArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
//        int n=in.nextInt();
        int[] arr=new int[6];
        for(int i = 0; i < 6 ; i++) {
            arr[i]=in.nextInt();
        }
//        System.out.println(Arrays.toString(arr));

        int[] ans1 =bliud_array(arr);

        System.out.println(Arrays.toString(ans1));


    }
    static int[] bliud_array(int[] nums){
       int n=nums.length;
        int[] ans=new int[n];
       for(int i = 0; i < n ; i++) {
           ans[i]=nums[nums[i]];
        }

       return ans;
    }
}
