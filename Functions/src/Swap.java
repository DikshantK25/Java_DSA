public class Swap {
    public static void main(String[] args){
        int a=20;
        int b=30;
        //Swap the Number code
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(+a+" "+b);


        swap(a,b);
        System.out.println(+a+" "+b);

        String name ="Dikshant Koriwar";
                changename(name);
        System.out.println(name);

    }
    static void swap(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
        // this valid will only be valid in this function scope only.
    }

    static void  changename(String naam){
         naam = "rahul rana";

    }
}
