package VerityPreorderSerializationOfABinaryTree;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String presorder = sc.nextLine();
        System.out.println(isValidSerialization(presorder));
    }

    private static boolean isValidSerialization(String preorder) {
        //遍历字符串如果是#就少个叶子节点,如果不是多个叶子节点
        String[] CharPreorder = preorder.split(",");
        int count = 1;
        for (int i=0;i<CharPreorder.length;i++){
            if (count == 0){
                return false;
            }
            if (CharPreorder[i].equals("#")){
                count--;
            }else if (i != CharPreorder.length-1){
                count++;
            }
        }
        return count==0;
    }
}
