public class OneComplement {
 
    static int totalBits(int num) {
        int count = 0;
        while (num != 0) {
            num >>= 1;
            count++;
        }
        return count;
    }
 
    static void complement(int num) {
        int n = totalBits(num);
        int mask = (1 << n) - 1;
        int comp = num ^ mask;
        System.out.println("One's complement: " + comp);
        if (num < 0) {
            System.out.println("Two's complement: " + (comp + 1));
        }
    }
 
    public static void main(String[] args) {
        int num = 23;
        complement(num);
    }
}