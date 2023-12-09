public class CeilingFind {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,135,18};
        int target = 15;
        for(int i=0;i< arr.length;i++){
            if(target<=arr[i]){
                System.out.println(arr[i]);
                break;
            }

        }
    }
}
