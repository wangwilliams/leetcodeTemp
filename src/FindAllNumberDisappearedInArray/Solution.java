package FindAllNumberDisappearedInArray;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] presorder = sc.nextLine().split(" ");
        int[] nums = new int[presorder.length];
        for (int i=0;i<presorder.length;i++){
            nums[i] = Integer.parseInt(presorder[i]);
        }
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if (nums[i+1]-nums[i] > 1){
                for (int k = nums[i]+1;k<nums[i+1];k++){
                    list.add(k);
                }
            }
        }
        if (nums[nums.length-1] < nums.length){
            for (int k=nums[nums.length-1]+1;k <= nums.length;k++){
                list.add(k);
            }
        }
        return list;
    }
}