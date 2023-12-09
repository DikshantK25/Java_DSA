import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args){
          fun(1,2,3,4,55,6,6,7,7);
          fun();
          multiple(2,3,"dikshant");
    }
    static void multiple(int a,int b,String ...v){

    }
    public  static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
