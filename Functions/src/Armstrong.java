public class Armstrong{

        public static void main(String[] args) {

             for(int i =100; i <1000 ; i++) {
                 ArmStrong(i);
                 if (ArmStrong(i)){
                     System.out.println(i);
                 }

             }
        }

// 3 digit armstrong number
static  boolean ArmStrong(int n){
            int original=n,sum=0;
            while (n>0){
                int digit=n%10;
                sum=sum+digit*digit*digit;
                n=n/10;
            }
            if (sum==original){
                return  true;
            }

            return false;
}
}