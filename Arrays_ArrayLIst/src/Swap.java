import java.util.Arrays;

public class Swap {
    public static void main(String[] args){
        int[] array={1,2,3,4,5,6,7};
        swap(array,1,3);
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));


    }

    static  void  reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }


    }
    static  void swap(int[] num,int index1,int index2){
        int temp=num[index1];
        num[index1]=num[index2];
        num[index2]=temp;
    }
}
