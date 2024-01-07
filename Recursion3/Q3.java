package Recursion3;

public class Q3 {
 public static void main(String[] args) {
    System.out.println("factorial of number is: "+FactorilFunc(4));
 }  
 static int FactorilFunc(int number){
    if(number ==0 ){
        return 1;
    }
    return number * FactorilFunc(number-1);
 }
}
