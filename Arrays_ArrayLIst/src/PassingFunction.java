import java.util.Arrays;
import java.util.Scanner;

public class PassingFunction {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int[] num= {1,64,7,8,3,32};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static  void change(int[] arr){
        arr[0]=99;

    }
}
