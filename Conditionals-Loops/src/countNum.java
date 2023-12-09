public class countNum {
    public static void main(String[] args){
        int num=425454572;
        int count=0;
        int similar=5;
        while(num>0){
           int  digit=num%10;
           if (digit==similar){
               count++;
           }
           num/=10;
        }
        System.out.println(count);
    }
}
