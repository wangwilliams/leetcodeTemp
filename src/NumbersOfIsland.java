import jdk.internal.dynalink.linker.LinkerServices;
import org.w3c.dom.NamedNodeMap;

import java.util.*;

public class NumbersOfIsland {


    /**
     * @param
     * @return 小岛的数量
     * <p>
     * 回溯法处理,
     */
   /* public static int numIslands(char[][] grid) {
        int ans = 0;
        int row = grid.length;
        int colomn = grid[0].length;
        boolean[][] hasMetch = new boolean[row][colomn];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colomn; j++) {

            }
        }

    }*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] presorder = sc.nextLine().split(" ");
        int[] nums = new int[presorder.length];
        for (int i=0;i<presorder.length;i++){
            nums[i] = Integer.parseInt(presorder[i]);
        }
        int[] ans = asteroidCollision(nums);
        for (int i=0;i<ans.length;i++)
        System.out.print(nums[i]+" ");
    }
    public static int[] asteroidCollision(int[] asteroids) {
        if (asteroids.length < 2){
            return asteroids;
        }
        Stack<Integer> stack = new Stack<>();
        int i=0;
        while (i<asteroids.length&&asteroids[i] < 0){
            stack.push(asteroids[i]);
            i++;
        }
        Stack<Integer> stack1 = new Stack<>();

        while (i < asteroids.length){
            while (i<asteroids.length && asteroids[i] > 0){
                stack1.push(asteroids[i]);
                i++;
            }
            if (i == asteroids.length){
                break;
            }
            int tempInt = asteroids[i];

            while (!stack1.isEmpty() && Math.abs(stack1.peek()) < Math.abs(tempInt)){
                stack1.pop();
            }
            if (!stack1.isEmpty() && Math.abs(stack1.peek()) == Math.abs(tempInt)){
                i++;
                stack1.pop();
                continue;
            }
            if (stack1.isEmpty()){
                stack.push(tempInt);
            }
            i++;
        }
        int length = stack.size();
        int teml = stack1.size();
        int[] ans = new int[length+teml];
        for (int i1=length-1;i1>=0;i1--){
            ans[i1] = stack.pop();
        }
        for (int i2 = length+teml-1;i2>=length;i2--){
            ans[i2] = stack1.pop();
        }
        return ans;
    }
    private void metchIslands(char[][] grid, boolean[][] hasMetch, int i, int j, int ans) {
        Stack<Node> queue = new Stack<>();
        if (grid[i][j] == '1' && hasMetch[i][j] == false) {
            ans++;
            hasMetch[i][j] = true;

            queue.add(new Node(i, j));
            while (!queue.isEmpty()) {
                Node temp = queue.pop();

            }
        }
    }

    class Node {
        int i = 0;
        int j = 0;

        public Node(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
