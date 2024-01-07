package Recursion2BascicQuestions;

public class Q1 {
    public static void main(String[] args) {
        print("dikshant",0);
    }
    static void print(String str,int count){
        if(count == 5){
            return;
        }
        System.out.println(str);
        print(str,count+1);

    }
}
