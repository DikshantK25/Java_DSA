public class FindSingleNumber {
    public static void main(String[] args) {
        int[] nums={1,2,3,3,4,5,6,7,7,7,4,3,3,22};
        System.out.println(findSingleNumber(nums));
    }
    public static int findSingleNumber(int[] nums) {
        int xor = 0;
        int ones = 0;
        for (int num : nums) {
          xor ^= num;
          ones ^= num;
        }
        return xor; // If no number appears 3 or more times, then `ones` will be 0 and `xor` will contain the single number.
      }
      
}
