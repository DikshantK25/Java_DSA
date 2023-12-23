public class NumDigits {
    public static void main(String[] args) {
        System.out.println("Sum of Digits : "+digitSum(1342));
    }

    static int digitSum(int n){
        if(n==0){
            return 0;

        }
        return( n%10 + digitSum(n/10));
    }
}
