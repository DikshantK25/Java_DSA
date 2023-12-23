public class PrintValue {
    
        public static void main(String[] args) {
            int n = 1;
            printNumSol(n);
        }
    
        static void printNumSol(int n) {
            if (n == 6) {
                return;
            }
            System.out.println(n);
            printNumSol(n + 1);
        }
}
