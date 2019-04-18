package _541;

import java.util.Arrays;
import java.util.Scanner;

public class reverseSolution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] presorder = sc.nextLine().split(" ");
        int[] nums = new int[presorder.length];
        for (int i=0;i<presorder.length;i++){
            nums[i] = Integer.parseInt(presorder[i]);
        }
    }
}
