package Recursion4;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    // Subsequence concept of recursion
    public static void main(String[] args) {
        int[] array = {3, 1, 2};
        //Syntax mistake 
        List<Integer> list = new ArrayList<>();
        printfun(0, array, list);
    
    }

    static void printfun(int index, int[] array, List<Integer> list) {
        if (index == array.length) {
            ////base condition
            // Print or process the generated subsequence
            System.out.print(list);
            return;
        }

        // Include the current element in the subsequence
        list.add(array[index]);
        printfun(index + 1, array, list);

        // Exclude the current element from the subsequence
        list.remove(list.size() - 1);//important for pick not pick cases
        printfun(index + 1, array, list);
    }
}
