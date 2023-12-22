public class GCD_LCM {
    public static void main(String[] args) {
        int a=60;
        int b=120;
        System.out.println(gcd(a,b));
    }

    
    static int gcd(int a,int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
}
