import java.util.Scanner;

public class Fibonaaci{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=0, b=1;
        System.out.println("Enter the no");
        int n=sc.nextInt();

        for(int i = 1; i <=n ; i++) {
            {

                System.out.print(a+" ");
                 int c=a+b;
                 a=b;
                 b=c;
            }

       }
    }
}