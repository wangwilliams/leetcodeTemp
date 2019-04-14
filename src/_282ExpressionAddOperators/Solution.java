package _282ExpressionAddOperators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] presorder = sc.nextLine().split(" ");
        int target = Integer.parseInt(presorder[0]);
        int[] me = SplitNum(target);
        System.out.println(me[1]+" "+me[0]);
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
