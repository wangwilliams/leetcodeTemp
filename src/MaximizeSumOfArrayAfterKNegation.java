import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaximizeSumOfArrayAfterKNegation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = Integer.parseInt(sc.nextLine());
        String[] presorder = sc.nextLine().split(" ");
        int[] nums = new int[presorder.length];
        for (int i=0;i<presorder.length;i++){
            nums[i] = Integer.parseInt(presorder[i]);
        }
        System.out.println(largestSumAfterKNegations(nums,target));
    }
    public static int largestSumAfterKNegations(int[] A, int K) {
        int negative = 0;
        int zero = 0;
        for (int i=0;i<A.length;i++){
           if (A[i] < 0){
                negative++;
            }else if (A[i] == 0){
                zero++;
            }
        }
        Arrays.sort(A);
        if (K <= negative){
            for (int i=0;i<K;i++){
                A[i] = -A[i];
            }
            return ArraySum(A);
        }else if (zero != 0){
            for (int i=0;i<negative;i++){
                A[i] = -A[i];
            }
            return ArraySum(A);
        }else {
            for (int i=0;i<negative;i++){
                A[i] = -A[i];
            }
            int kNow = K - negative;
            if (kNow%2 == 0){
                return ArraySum(A);
            }else {
                Arrays.sort(A);
                A[0] = -A[0];
                return ArraySum(A);
            }
        }
    }

    public static int ArraySum(int[] A){
        int ans = 0;
        for (int i=0;i<A.length;i++){
            ans += A[i];
        }
        return ans;
    }
}
