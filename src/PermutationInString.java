import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] presorder = sc.nextLine().split(" ");
        System.out.println(checkInclusion(presorder[0],presorder[1]));
    }
    public static boolean checkInclusion(String s1, String s2) {
        char[] temp = s1.toCharArray();
        List<String> list = new ArrayList<>();
        NextPir(temp,0,list);
        List<String> list1 = new ArrayList<>();
        if (s1.equals(s2)){
            list1.add(s2);
        }
        for (int i=0;i<s2.length()-s1.length();i++){
            list1.add(s2.substring(i,i+s1.length()));
        }
        for (int i=0;i<list.size();i++){
            if (list1.contains(list.get(i))){
                return true;
            }
        }
        return false;
    }

    public static void NextPir(char[] temp, int start, List<String> list){
        if (start == temp.length-1) {
            String ans="";
            for (int i=0;i<temp.length;i++){
                ans = ans+temp[i];
            }
            list.add(ans);
        }
        for (int i=start;i<temp.length;i++){
            char re = temp[start];
            temp[start] =temp[i];
            temp[i] = re;
            NextPir(temp,start+1,list);
            re = temp[i];
            temp[i] = temp[start];
            temp[start] =re;
        }
    }
}
