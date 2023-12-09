import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number1 :");
        int num1=in.nextInt();
        System.out.println("Enter the number2 :");
        int num2=in.nextInt();
        System.out.println("largest No:");
        if (num1>num2){
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }
    }
}
