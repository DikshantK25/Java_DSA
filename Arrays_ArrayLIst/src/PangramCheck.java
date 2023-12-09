import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the sentence");
//        String name= in.next();
        String name="thequckbrownfoxjumpsoverthelazydog";
        boolean ans=checkIfPangram(name);
        System.out.println(ans);

    }

  static boolean checkIfPangram(String sentence) {
            int arr[]=new int[26];
            for(int i=0;i<sentence.length();i++)
            {
                int num=sentence.charAt(i)-'a';
                arr[num]++;
            }
            for(int i=0;i<26;i++)
            {
                if(arr[i]<1)
                    return false;
            }
            return true;


    }
}
