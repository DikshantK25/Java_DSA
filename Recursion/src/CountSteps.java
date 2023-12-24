public class CountSteps {
    public static void main(String[] args) {
        int number =14;
        int steps = 0;
        System.out.println(helper(number,steps));
        
    }
    static int helper(int number,int steps){
        if(number==0){
            return steps;
        }
        if(number%2==0){
             return helper(number/2, steps+1);
        }
         return helper(number-1, steps+1);

    }
}
