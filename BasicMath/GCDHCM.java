package BasicMath;

public class GCDHCM {
    public static void main(String[] args) {
        int x = 9;
        int y = 3;
        int ans = gcd1(x, y);
        System.out.println(ans);
    }

    private static int gcd1(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        // Move the return statement outside the loop
        if (a == 0) {
            return b;
        } else {
            return a;
        }
    }
}
