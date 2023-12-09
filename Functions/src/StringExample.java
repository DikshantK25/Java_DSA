import java.util.Scanner;

public class StringExample {
    public static void main(String[] args){
//        String message=greet();
//        System.out.println(message);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=sc.nextLine();

        String personalized=myGreet(name);
//        String personalized=myGreet("Dikshant koriwar");
        System.out.println(personalized);

    }

   static String myGreet(String name){
        String message ="Hello "+name;
        return message;
   }

    static String greet(){
        String greeting ="How are you";
        return greeting;
    }

}
