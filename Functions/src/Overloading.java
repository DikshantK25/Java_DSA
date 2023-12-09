public class Overloading {
    public static void main(String[] args){
        fun();
        fun(89);
    }
    static void fun(){
        System.out.println("a");
    }
    static void fun(int a){
       System.out.println(a);
    }
}
