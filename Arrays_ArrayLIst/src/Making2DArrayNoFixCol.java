import java.util.Arrays;
import java.util.Scanner;

//public class Making2DArrayNoFixCol {
//    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//
//        System.out.println("Enter the row you want:");
//        int row =in.nextInt();
//        int[][] arr= new int[row][];
//        for (int i = 0; i <row ; i++) {
//            int n=in.nextInt();
//            arr[i]=new int[n];
//
//
//
//            for (int c = 0; c <arr[r].length ; c++) {
//                arr[r][c]=in.nextInt();
//            }
//
//        }
//        for (int i = 0; i <row ; i++) {
//            System.out.println(Arrays.toString(arr[row]));
//
//        }
//    }


    public class Making2DArrayNoFixCol {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the number of rows:");
            int row = in.nextInt();
            int[][] arr = new int[row][];

            for (int i = 0; i < row; i++) {
                System.out.println("Enter the number of columns for row " + i + ":");
                int n = in.nextInt();
                arr[i] = new int[n];
                for (int c = 0; c < n; c++) {
                    arr[i][c] = in.nextInt();
                }
            }

            for (int r = 0; r < row; r++) {
                System.out.println(Arrays.toString(arr[r]));
            }
        }
    }


