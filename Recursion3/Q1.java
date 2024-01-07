package Recursion3;

public class Q1 {
   public static void main(String[] args) {
        System.out.println("Sum is :"+printSum(0, 50));
   } 
   static int printSum(int sum, int num){
    if(num == 0){
        return sum;
    }
      return printSum(sum=sum+num, num-1);
   }
}
