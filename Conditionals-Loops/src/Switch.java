import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String  Fruit= sc.next();
        switch (Fruit){
            case "mango":
                System.out.println("king of fruit ");
                break;
            case "grapas":
                System.out.println(" fruit  look small ");
                break;
            case "apple":
                System.out.println(" fruit  is best");
                break;
            case "orange ":
                System.out.println(" fruit good ");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
