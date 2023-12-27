import java.lang.*;
import java.util.*;

public class Pattern {
    public static void main(String[] args) {
     
        // int row =5;
        // int col =0;
        // printStar1(row ,col);
        int[] arr = {10,9,8,7,6,5,4,3,2,1,0};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }


    static void printStar1(int row,int col) {

           // *****
           // ****
           // ***
           // **
           // *
        if(row == 0){
            return;
        }
       if(col < row){
        System.out.print("*");
        printStar1(row,col+1);
       }else{
        System.out.println();
        printStar1(row-1,0);
       }
    }

    static void printStar2(int row,int col) {
          // *
          // **
          // ***
          // ****
          // *****
        if(row == 0){
            return;
        }
       if(col < row){
        printStar2(row,col+1);
        System.out.print("*");

       }else{
        printStar2(row-1,0);
          System.out.println();

       }
    }


       static void bubbleSort(int[] arr, int row,int col) {
         
        if(row == 0){
            return;
        }
        
       if(col < row){

       if(arr[col]> arr[col+1]){   
         
        int tmp = arr[col];
        arr[col] = arr[col+1];
        arr[col+1] = tmp;

       }

        bubbleSort(arr, row,col+1);

       }else{

        bubbleSort(arr,row-1,0);

       }
       
    }
    //selection sort Homework


}
