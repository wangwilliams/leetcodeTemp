import java.util.*;

public class ShortestCompletingWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String licensePlate = sc.nextLine();
        String[] presorder = sc.nextLine().split(" ");
        System.out.println(shortestCompletingWord(licensePlate,presorder));
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        List<Character> list = new ArrayList<>();
        char[] CharArray = licensePlate.toCharArray();
        for (int i=0;i<CharArray.length;i++){
            if (CharArray[i] > 96 &&CharArray[i] < 123){
                list.add(CharArray[i]);
            }else if (CharArray[i] >64 && CharArray[i] < 91){
                list.add((char)(CharArray[i] +32));
            }
        }
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        for (int i=0;i<words.length;i++){
            if (ContainsAllLetter(list,words[i])){
                return words[i];
            }
        }
        return null;
    }

    private static boolean ContainsAllLetter(List<Character> list,String word){
        char[] chars = word.toCharArray();
        List<Character> wordList = new LinkedList<>();
        for (int i=0;i<word.length();i++){
            wordList.add(chars[i]);
        }
        for (int i=0;i<list.size();i++){
            if (wordList.contains(list.get(i))){
                wordList.remove(list.get(i));
            }else {
                return false;
            }
        }
        return true;
    }
}
