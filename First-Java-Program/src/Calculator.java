import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Number1 :");
        int num1=in.nextInt();
        System.out.println("Enter the Number2 :");
        int num2=in.nextInt();
        System.out.println("Enter the Operator= +,-,*,/ :");
        char oper=in.next().charAt(0);
        if(oper=='+'){
            System.out.println("Addition:" + (num1 + num2));
        }else if(oper=='-'){
            System.out.println("Subtraction:"+(num1-num2));
        }else if(oper=='*'){
            System.out.println("Multiplication:"+(num1*num2));
        }else if(oper=='/'){
            System.out.println("Division:"+(num1/num2));
        }
        }
    }

