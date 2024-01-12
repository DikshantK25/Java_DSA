package Recursion4;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        int[]  arr={1,2,3};
        List<Integer> list = new ArrayList<>();
        getSum(0, arr, 0, list);

    }
    static void getSum(int index,int[] arr,int sum, List<Integer> list){
        if(index ==arr.length){
            System.out.println(list);
            return;
        }
        sum =sum +arr[index];
        list.add(sum);
        getSum(index+1, arr, sum, list);

        list.remove(list.size()-1);
        sum=sum - arr[index];
        getSum(index+1, arr, sum, list);

    }
}
