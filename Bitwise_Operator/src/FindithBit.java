public class FindithBit {
    public static void main(String[] args) {
        int n =0 ;
        int value = 8;

        int bit = (value & (1 << (n-1))) >> (n-1);
        System.out.println(n + "th bit " + bit);
    }
}
