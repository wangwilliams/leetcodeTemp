package _282ExpressionAddOperators;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] presorder = sc.nextLine().split(" ");
        int k = Integer.parseInt(presorder[0]);
        int t = Integer.parseInt(presorder[1]);
        //int[] me = SplitNum(target);
        //System.out.println(me[1]+" "+me[0]);
        presorder = sc.nextLine().split(" ");
        int[] nums = new int[presorder.length];
        for (int i=0;i<presorder.length;i++){
            nums[i] = Integer.parseInt(presorder[i]);
        }
        System.out.println(containsNearbyAlmostDuplicate(nums,k,t));
        System.out.println(Math.abs(-1-2147483647));
    }
    //给定一个整数数组，判断数组中是否有两个不同的索引 i 和 j，
    // 使得 nums [i] 和 nums [j] 的差的绝对值最大为 t，并且
    // i 和 j 之间的差的绝对值最大为 ķ。
    /**
     * TreeSet是基于TreeMap的, 而TreeMap基于红黑树(一种特殊的二叉查找树)
     * TreeSet中的元素按自然顺序或创建时提供的比较器排序,
     * 并且保证了基本操作(add, remove, contains)是lg(n)的时间复杂度.
     */
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0 || k <= 0 || t < 0) return false;
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i) {
            // 返回集合中大于等于给定元素的最小元素s
            Long s = set.ceiling((long) nums[i]);
            // 如果s存在, 并且s与当前数的差值小于等于t
            if (s != null && s - nums[i] <= t) {
                return true;
            }
            // 返回集合中小于或等于给定元素的最大元素g
            Long g = set.floor((long) nums[i]);
            // 如果g存在, 并且当前数与g的差值小于等于t
            if (g != null && nums[i] - g <= t) {
                return true;
            }
            // 将当前数加入集合, 同时维护集合元素个数为k(只保留当前窗口k的元素)
            set.add((long) nums[i]);
            if (set.size() > k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }
    private static boolean hasCycle(ListNode head) {
        Set<ListNode> settemp = new HashSet<>();
        while (head.next != null) {
            if (settemp.contains(head)){
                return true;
            }
            settemp.add(head);
            head = head.next;
        }
        return false;
    }
    private static int[] SplitNum(int num){
        for (int i=2;i<num;i++){
            if (num%i == 0){
                return new int[]{i,num/i};
            }
        }
        return null;
    }
    private static List<String> addOperators(String num,int target){
        List<String> ansList = new ArrayList<>();
        //动态分割num,找到所有的分割方式

        //对于每种方式里面添加符号运算,结果相同就放进答案里面
        return ansList;
    }

    private static void splitArray(String num,List<List<Integer>> ans,int rightSide,int KnifeCount){

    }
}
class ListNode {
    int val;
        ListNode next;
        ListNode(int x) {
         val = x;
         next = null;
      }
}