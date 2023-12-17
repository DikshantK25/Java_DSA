public class FindRightMostSetBit {
    public static void main(String[] args) {
        System.out.println(findRightmostSetBit(8));
    }
    public static int findRightmostSetBit(int n) {
        int ans=1;
        int position = 1;
        while ((n & 1) == 0) {
          n >>= 1;//n=n>>1;
          position++;
        }
        return position;
        // return 2^position;
      }
    
}
