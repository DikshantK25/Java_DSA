public class ProductDigit {
     public static void main(String[] args) {
        System.out.println("Product of Digits : " + digitProduct(111));
    }

    static int digitProduct(int n) {
        if(n==0){
            return 0;
        }
        if(n<=1) {
            return 1;

        }
        if(n==0){
            return 0;
        }
        return( n%10 * digitProduct(n/10));
    }
}

