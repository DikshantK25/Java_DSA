public class DiagonalSum {

       static int diagonalSum(int[][] mat) {
            int sum=0;
            int row=mat.length;
            int col=mat[0].length;
            for(int i=0;i < row; i++){
                for(int j=0 ;j < col ; j++){
                    if(i == j || i + j == row - 1){
                        sum+=mat[i][j];
                    }
                }
            }
            return sum;
        }


    public static void main(String[] args) {

        int[][] arr= {{1, 2, 3},
                {4, 5, 6},
                {8, 9, 10}
        };
        int ans=diagonalSum(arr);
        System.out.println(ans);


    }
}
