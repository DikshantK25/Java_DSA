public class RotataryBS {
   public static void main(String[] args) {
     int[] arr={1,2,3,4,5,6,7,8};
     int target=8;
      System.out.println(search(arr,target,0,arr.length-1));
   } 
   static int search(int[] arr,int target, int start, int end){
    if(start > end){
        return -1;
    }
    int mid = start + (end - start)/2;
    if(arr[mid] == target){
        return mid;
    }
   if(arr[start] <= arr[mid]){ 
    if(arr[start] <=  target && arr[mid] >= target){
        return search(arr,target,start,mid-1);
    }
    else{
       return search(arr,target,mid+1,end);
    }
}
    if(arr[mid] <= target && arr[end] >= target){
        return search(arr,target,mid+1,end);
    }
        return search(arr,target,start,mid-1);
   }
}
