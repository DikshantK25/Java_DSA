import java.awt.*;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Number :");
        int number =in.nextInt();

        if (number%2==0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number ");
        }
    }
}
