import java.util.Scanner;

public class SmallLetterGreatThanTarget {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Character target = sc.nextLine().charAt(0);
        String[] presorder = sc.nextLine().split(" ");
        char[] nums = new char[presorder.length];
        for (int i=0;i<presorder.length;i++){
            nums[i] = presorder[i].charAt(0);
        }
        System.out.println(nextGreatestLetter(nums,target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        if (letters.length == 0){
            return target;
        }
        for (int i=0;i<letters.length;i++){
            if (letters[i] > target){
                return letters[i];
            }
        }
        return letters[0];
    }
}
