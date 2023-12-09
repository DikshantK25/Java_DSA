import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Principal Amount:");
        int principal =in.nextInt();
        System.out.println("Enter the Time Period:");
        float time =in.nextFloat();
        System.out.println("Enter the Rate  Interest:");
        float rate  =in.nextFloat();
        float Simple_Interest =(principal*rate*time)/100;
        System.out.println("Simple Interest is:"+Simple_Interest);

    }
}
