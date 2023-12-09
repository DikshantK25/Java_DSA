import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args){
        //create an array
        int [] arr ={1,3,2,4,5,6,7,};
        chnage(arr);
        System.out.println(Arrays.toString(arr ));

    }
    static  void chnage(int [] nums){
        nums[0]=99;//if you make change to the object via ref variable ,same object will be change
    }
}
