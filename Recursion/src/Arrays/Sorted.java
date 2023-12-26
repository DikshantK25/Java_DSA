package Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr ={0,2,3,4,4,5};
       System.out.println( sort(arr,1));
    }
    static boolean sort(int[] arr, int index){
        if(index == arr.length-1){
           return true;
        }
        return (arr[index]>=arr[index-1] && sort(arr, index+1));
    }

}
