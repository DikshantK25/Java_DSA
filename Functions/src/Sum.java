import java.sql.SQLOutput;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
            //sum();


//           int ans = sum2();
//           System.out.println(ans);



           int answer=sum3(20,30);
           System.out.println(answer);



        }

    static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no1:");
        int num1= sc.nextInt();
        System.out.println("Enter the no2:");
        int num2= sc.nextInt();
        int sum= num1+num2;
        System.out.println("Sum:"+sum);

    }


        //return  the value
      static int sum2(){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the no1:");
          int num1= sc.nextInt();
          System.out.println("Enter the no2:");
          int num2= sc.nextInt();
          int sum= num1+num2;
//          System.out.println("Sum:"+sum);
          return sum;
          //never excute
          //System.out.println(sum);
      }


    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }

}
