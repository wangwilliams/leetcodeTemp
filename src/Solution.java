import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        int N = Integer.parseInt(temp);
        int[][] grid = new int[N][N];
        for (int i=0;i<N;i++){
            temp = sc.nextLine();
            String[] source = temp.split(" ");
            for (int j=0;j<N;j++){
                grid[i][j] = Integer.parseInt(source[j]);
            }
        }
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int N = grid.length;
        if (N == 0){
            return 0;
        }
        int[] horizonal = new int[N];
        int[] vertival = new int[N];
        for (int i=0;i<N;i++){
            int temp = 0;
            int temp2 = 0;
            for (int j=0;j<N;j++){
                if (grid[i][j] > temp){
                    temp = grid[i][j];
                }
                if (grid[j][i] > temp2){
                    temp2 = grid[j][i];
                }
            }
            horizonal[i] = temp;
            vertival[i] = temp2;
        }
        int ans = 0;
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                if (grid[i][j] < Math.min(horizonal[i],vertival[j])){
                    ans +=Math.min(horizonal[i],vertival[j])-grid[i][j];
                }
            }
        }
        return ans;
    }
}
