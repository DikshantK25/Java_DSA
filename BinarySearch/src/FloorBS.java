public class FloorBS {

        public static void main(String[] args) {
            int[] arr = {-18,-12,-4,0,2, 3, 5,14,16,18,22,45,89};
            int target = 15;

            int ans =check(arr,target);

            System.out.println(ans);

        }

        static int check(int[] num,int target){
            int end = num.length - 1;
            int start = 0;
            for (int i = 0; i < num.length; i++) {
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (num[mid] < target) {
                        start = mid +1;
                    } else if (num[mid] > target) {
                        end = mid -1;

                    } else {

                        return num[mid];
                    }

                }
            }
            return num[end];

        }

}
