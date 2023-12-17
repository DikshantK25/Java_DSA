public class PascalTriangle {
    public static void main(String[] args) {
       System.out.println(sumPascalTriangleRow(10));
          
    }
     public static int sumPascalTriangleRow(int n) {
            return (int) Math.pow(2, n - 1);
          }
    
}
