import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word= input.next();
        char start=word.charAt(0);
        char end =word.charAt(word.length()-1);
        while(start<=end){
            if(start==end){
                start++;
                end--;


            }else{
                System.out.println("-1");
                break; 
            }

        }

    }
//    static  boolean ispalindrome(String word){
//        word=word.toLowerCase();
//        for(int i = 0; i <=word.length() ; i++) {
//
//        }
//    }
}
