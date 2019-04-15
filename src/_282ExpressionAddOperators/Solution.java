package _282ExpressionAddOperators;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] presorder = sc.nextLine().split(" ");
        int target = Integer.parseInt(presorder[0]);
        //int[] me = SplitNum(target);
        //System.out.println(me[1]+" "+me[0]);
        presorder = sc.nextLine().split(" ");
        ListNode listNode = new ListNode(Integer.parseInt(presorder[0]));
        ListNode head = listNode;
        for (int i=1;i<target;i++){
            listNode.next = new ListNode(Integer.parseInt(presorder[i]));
            listNode = listNode.next;
        }
        System.out.println(hasCycle(head));
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

    }
    public static boolean hasCycle(ListNode head) {
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