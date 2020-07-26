package Leetcode.Medium;
import java.util.*;

/**
 * 字符切割
 * Created by tktktkl on 2020/7/26 22:44
 */
public class WordSpilt {
    public static void main (String[] args) {
        String s = "LeetCode";
        Set<String> dict = new HashSet<>();
        dict.add("Leet");
        dict.add("Code");
        System.out.println(wordBreak(s, dict));

    }
    public static boolean wordBreak(String s, Set<String> dict) {
        boolean last[] = new boolean[s.length() + 1];
        last[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
//                System.out.println(s.substring(j, i));
                if (last[j] && dict.contains(s.substring(j, i))){
                    last[i] = true;
                    break;
                }
            }
        }
        return last[s.length()];
    }
}
