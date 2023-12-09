public class PatternsProblems1To31 {
    public static void main(String[] args){

            pattern28(5);
    }



        static  void pattern15(int n){
            for(int i = 1; i <2*n; i++) {
                int totalColPrint= i>=n ? i-n : i-1;
                int totalColSpace = i>n? i-n:n-i;
                for(int j = 0; j <=totalColSpace ; j++) {
                    System.out.print(" ");

                }

                for(int j = 0; j < 1; j++) {
                    System.out.print("* ");

                }
                int totalColSpace2 = i>n? i-n:2*i-1;
                for(int j = 0; j <totalColSpace ; j++) {
                    System.out.print(" ");

                }
                for(int j = 1; j <=1; j++) {
                    System.out.print("* ");

                }
                System.out.println();

            }
        }



    //    static  void pattern18(int n){
//        for(int i = 0; i <=2*n-1; i++) {
//            int totalColPrint= i>=n ? (i-n)+1 : n-i;
////            int totalColSpace= i>=n ?    : i*2;
//            int totalColSpace = 2 * n - totalColPrint;
//
//            for(int j = 0; j<totalColPrint; j++) {
//                System.out.print("* ");
//
//            }
//            for(int j = 0; j <totalColSpace ; j++) {
//                System.out.print(" ");
//
//            }
//            for(int j = 0; j<totalColPrint; j++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//
//        }
//    }
    static  void pattern13(int n){
        for(int i = 0; i < n ; i++) {
            for(int j = 0; j < i ; j++) {
                System.out.print("  ");

            }
            for(int j = 0; j <2*n-(2*i+1); j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
    static  void pattern19(int n){
        for(int row = 1; row < 2*n ; row++) {
            int totalSpace=(row>=n)? 2*row-2*n : 2*n-2*row;
            int totalStar=(row>=n)? 2*n-row : row;

            for(int col = 1; col <=totalStar; col++) {
                System.out.print("* ");
            }

            for(int j = 1; j <=totalSpace ; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <=totalStar; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
    static  void pattern12(int n){
        for(int i = 0; i < 2*n ; i++) {
            int totalSpace=(i>=n)?2*n-i-1:i;
            int totalStar=(i>=n)?i+1-n:n-i;

            for(int j = 0; j < totalSpace ; j++){
                System.out.print(" ");

            }
            for(int j = 0; j <totalStar; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
    static  void pattern11(int n){
        for(int i = 0; i <n ; i++) {
             for(int j = 0; j <i ; j++) {
                System.out.print(" ");

            }
            for(int j = 0; j < n-i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
    static  void pattern10(int n){
        for(int i = 1; i <=n ; i++) {
            for(int j = 1; j <= n-i ; j++) {
                System.out.print(" ");

            }
            for(int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
       //CONFUSE DOWN PIERAMID ***
    static  void pattern9(int n){
        for(int i = 0; i < n ; i++) {
            for(int j = 0; j < i ; j++) {
                System.out.print("  ");

            }
            for(int j = 0; j <2*n-(2*i+1); j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
    static  void pattern8(int n){
        for(int i = 0; i < n ; i++) {
            for(int j = 0; j < n-i ; j++) {
                System.out.print("  ");

            }
            for(int j = 0; j < 2*i+1 ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
    static  void pattern7(int n){
        for(int i = 0; i < n ; i++) {
            for(int j = 0; j < i ; j++) {
                System.out.print("  ");

            }
            for(int j = 0; j <n-i ; j++) {
                System.out.print("* ");

           }
            System.out.println();

        }

    }

    static  void pattern31(int n){
        int original=n;
        int N=2*n;
        for(int row = 0; row <=N ; row++) {
            for(int col = 0; col <= N; col++) {
                int atEveryIndex= original-Math.min( Math.min(row,col), Math.min(N-row,N-col));
               if(atEveryIndex==0){
                   System.out.print(n+" ");
               }
               else {
                   System.out.print(atEveryIndex+" ");
               }
            }
            System.out.println();
        }
    }

    static  void pattern17(int n){
        for (int row = 1; row <= 2 * n - 1; row++) {
                int c = row > n ? 2 * n - row : row;
                for (int col = 1; col <= n - c; col++) {
                    System.out.print("  ");
                }
                for (int col = c; col >= 1; col--) {
                    System.out.print(col + " ");
                }
                for (int col = 2; col <= c; col++) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }
    }

    static  void pattern30(int n){
        for(int i = 0; i <n ; i++) {
            for(int j = 0; j < n-i ; j++) {
                System.out.print("  ");

            }
            for(int j = i+1; j >=1 ; j--) {
                System.out.print(j+" ");

            }
            for(int j = 2; j <=i+1 ;j++) {
                System.out.print(j+" ");

            }
            System.out.println();

        }

    }

    static  void pattern1(int n){
        for(int i = 0; i <n ; i++) {
            for(int j = 0; j <n-i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    static  void pattern2(int n){
        for(int i = 0; i <n ; i++) {
            for(int j = 0; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    static  void pattern3(int n){
        for(int i = n; i >0 ; i--) {
            for(int j = 0; j<i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    static  void pattern4(int n){
        for(int i = 1; i <=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(j+" ");

            }
            System.out.println();

        }
    }
    static  void pattern5(int n){
//        for(int i = 0; i <n-1 ; i++) {
//            for(int j = 0; j <=i; j++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//
//        }
//        for(int i = n; i >0 ; i--) {
//            for(int j = 0; j<i; j++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//
//        }
        //other way to do this
        for(int i = 0; i <=2*n-1 ; i++) {
            int totalColPrint= i>n ? 2*n-i : i;
            for(int j = 0; j<totalColPrint; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

    static  void pattern6(int n){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j<n-1; j++) {
                System.out.print(" ");

            }
            for(int j = 0; j<=i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    static  void pattern28(int n){
        for(int i = 0; i <=2*n-1   ; i++) {
            int totalColPrint= i>n ? 2*n-i : i;
            int numOfspaces=n-totalColPrint;
            for(int j = 0; j <numOfspaces ; j++) {
                System.out.print(" ");

            }
            for(int j = 0; j<totalColPrint; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }



}
