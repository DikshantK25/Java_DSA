public class OddEven {
    public static void main(String[] args) {
        int num = 99;
        int lastbit = num & 1;
        if(lastbit == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even"); 
        }
    }
    
}
