package Recursion3;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Sum is :"+PrintFuncSum(100));
    }
    static int PrintFuncSum(int number){
        if(number ==0){
            return 0;
        }
        return number + PrintFuncSum( number-1);

    }
}
