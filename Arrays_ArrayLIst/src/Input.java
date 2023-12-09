import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        // input array
         Scanner sc =new Scanner(System.in);
         int[] arr=new int[5];
         for(int i = 0; i < arr.length; i++) {
             arr[i]=sc.nextInt();


         }
         System.out.println("array ="+Arrays.toString(arr));





        for(int num : arr) { // for every element in array, print the element
             System.out.print(num + " "); //  here num represents element of the array
                    }

        }
}

