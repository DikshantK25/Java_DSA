public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] arr = {'c','d','f','g'};
        char target = 'f';

        char ans =check(arr,target);
        System.out.println(ans);

    }

    static char check(char[] letters,char target){

                int start = 0;
                int end = letters.length - 1;

                while(start <= end){
                    int mid = start + (end - start) / 2;


                     if(target < letters[mid]){
                        end = mid - 1;
                    }
                    else{
//                         if(x > y) {
//                             // Executes if x is greater than y
//                         } else {
//                             // Executes if x is less than or equal to y
////                         }
                        start = mid + 1;
                    }
                }
                return  letters[start % letters.length];


    }
}

