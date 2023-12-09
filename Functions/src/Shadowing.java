public class Shadowing {
     static int x=90;//this will be shadow at line 7
    public static void main(String[] args){

        System.out.println(x);//90
        int x=40;
        System.out.println(x);//40
        fun();
        System.out.println(x);
    }

    static void fun(){
        System.out.println(x);
    }


}
