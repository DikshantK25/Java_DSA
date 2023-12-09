import java.util.Arrays;

public class SB {
    public static void main(String[] args){
         StringBuilder builder= new StringBuilder();
         for(int i = 0; i <26 ; i++) {
             char ch= (char)('a'+i);
             builder.append(ch);

         }
         String name ="kunal kushewah";
         System.out.println(builder);
         System.out.println(builder.deleteCharAt(0));
         System.out.println(builder.reverse());
         System.out.println(" kushi  dikshant  ".strip());
         System.out.println(Arrays.toString(name.split(" ")));
    }
}
