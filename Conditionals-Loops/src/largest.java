import java.util.Scanner;

public class largest {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=in.nextInt();
        int y=in.nextInt();
        int z=in.nextInt();
        int max=x;

        if (y>max){
            max=y;

        }
        if (z>max){
            max=z;
        }
        System.out.println("max:"+max);
    }
}
