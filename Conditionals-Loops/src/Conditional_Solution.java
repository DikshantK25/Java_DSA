import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


                //Q1
        int num=sc.nextInt();
        int ans=Subtract(num);
        System.out.println(ans);

//        //Q2
         Sum();

         //Q3
        Largest();

    }



    static int Subtract(int n) {
        int product =1,sum=0;
        while(n>0){
            int r=n%10;
            product*=r;
            sum =sum+r;
            n/=10;
        }
        int sub=product-sum;

        return sub;

}
 static void  Sum(){
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextByte();
        int sum=0;
        while(n!=0){
            sum+=n;
            n=Sc.nextByte();
        }
        System.out.println("Sums"+sum);

 }

 static void Largest(){
     Scanner Sc=new Scanner(System.in);
     int n=Sc.nextByte();
     int L=0;
        while (n!=0){
            if(n>L){
                L=n;

            }
            n=Sc.nextInt();

         }  System.out.println("Largest: "+L);

 }




}



